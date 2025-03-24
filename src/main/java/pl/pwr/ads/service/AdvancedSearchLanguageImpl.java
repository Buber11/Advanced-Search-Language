package pl.pwr.ads.service;

import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.pwr.ads.antlr4.AdvancedSearchLanguageBaseListener;
import pl.pwr.ads.antlr4.AdvancedSearchLanguageParser;

import java.util.*;
import java.util.stream.Collectors;

public class AdvancedSearchLanguageImpl extends AdvancedSearchLanguageBaseListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvancedSearchLanguageImpl.class);

    private final Map<String, String> expressionValues = new HashMap<>();
    private String limitClause = "";
    private StringBuilder sqlBuilder;
    private static final String SQL_STATEMENT = """
            SELECT title, description, language, created_at, updated_at,
            a.name || ' ' || a.surname as name_surname, photo 
            FROM post 
            INNER JOIN author a on post.id = a.post_id
            LEFT JOIN photo p on post.id = p.post_id
            """;

    public String generateSql() {
        return sqlBuilder != null ? sqlBuilder.toString() : "";
    }

    @Override
    public void exitQuery(AdvancedSearchLanguageParser.QueryContext ctx) {
        sqlBuilder = new StringBuilder(SQL_STATEMENT);

        if (!expressionValues.isEmpty()) {
            sqlBuilder.append("WHERE ")
                    .append(expressionValues.values().stream()
                            .collect(Collectors.joining(" AND ")));
        }

        sqlBuilder.append(" ").append(limitClause);

        LOGGER.info("Generated SQL: {}", sqlBuilder);
    }

    @Override
    public void exitFindTitleExpression(AdvancedSearchLanguageParser.FindTitleExpressionContext ctx) {
        processWord("title", ctx.children, true);
    }

    @Override
    public void exitFindContentExpression(AdvancedSearchLanguageParser.FindContentExpressionContext ctx) {
        processWord("description", ctx.children, true);
    }

    @Override
    public void exitFromExpression(AdvancedSearchLanguageParser.FromExpressionContext ctx) {
        processWord("name_surname", ctx.children, false);
    }

    @Override
    public void exitLangExpression(AdvancedSearchLanguageParser.LangExpressionContext ctx) {
        processWord("language", ctx.children, false);
    }

    @Override
    public void exitSinceExpression(AdvancedSearchLanguageParser.SinceExpressionContext ctx) {
        processDate(">", ctx.DATE().getText());
    }

    @Override
    public void exitUntilExpression(AdvancedSearchLanguageParser.UntilExpressionContext ctx) {
        processDate("<", ctx.DATE().getText());
    }

    @Override
    public void exitLimitExpression(AdvancedSearchLanguageParser.LimitExpressionContext ctx) {
        limitClause = "LIMIT " + ctx.getChild(2).getText();
        LOGGER.debug("Set limit clause: {}", limitClause);
    }

    private void processWord(String key, List<ParseTree> words, boolean isLike) {
        String operator = isLike ? "LIKE" : "=";
        StringBuilder stringBuilder = new StringBuilder();

        if(expressionValues.containsKey(key)){
            stringBuilder.append(expressionValues.get(key))
                    .setLength(expressionValues.get(key).length()-1);

            stringBuilder.append("OR ");
        }else {
            stringBuilder.append("( ");
        }

        for (int i = 2; i < words.size(); i += 2) {
            String value = words.get(i).getText().replace("\"", "");
            stringBuilder.append(key)
                    .append(" ")
                    .append(operator)
                    .append(operator.equals("LIKE") ? " '%" : " '")
                    .append(value)
                    .append(operator.equals("LIKE") ? "%'" : "'");

            if (i < words.size() - 1) {
                stringBuilder.append("AND".equalsIgnoreCase(words.get(i + 1).getText()) ? " AND " : " OR ");
            } else {
                stringBuilder.append(" )");
            }
        }

        expressionValues.put(key, stringBuilder.toString());
        LOGGER.debug("Processed word condition for {}: {}", key, stringBuilder);
    }

    private void processDate(String sign, String date) {
        String key = "created_at";
        StringBuilder stringBuilder = new StringBuilder();
        if(expressionValues.containsKey(key)){
            stringBuilder.append(expressionValues.get(key))
                    .setLength(expressionValues.get(key).length()-1);

            stringBuilder.append("AND ");
        }else {
            stringBuilder.append("( ");
        }

        stringBuilder.append(key)
                .append(" ")
                .append(sign)
                .append(" '")
                .append(date)
                .append("' )");

        expressionValues.put(key, stringBuilder.toString());
        LOGGER.debug("Processed date condition for {}: {}", key, stringBuilder);
    }
}
