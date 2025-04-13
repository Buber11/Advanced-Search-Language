package pl.pwr.ads.service;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
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

    private STGroup group = new STGroupFile("src/main/java/pl/pwr/ads/antlr4/SQLTemplates.stg");

    public String generateSql() {
        List<String> conditions = new ArrayList<>(expressionValues.values());
        ST st = group.getInstanceOf("sqlTemplate");
        st.add("conditions", conditions);
        st.add("limitClause", limitClause);
        String sql = st.render();
        LOGGER.info("Generated SQL: {}", sql);
        return sql;
    }

    @Override
    public void exitQuery(AdvancedSearchLanguageParser.QueryContext ctx) {
        generateSql();
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
        processWord("a.name || ' ' || a.surname", ctx.children, false);
    }

    @Override
    public void exitLangExpression(AdvancedSearchLanguageParser.LangExpressionContext ctx) {
        processWord("language", ctx.children, false);
    }

    @Override
    public void exitSinceExpression(AdvancedSearchLanguageParser.SinceExpressionContext ctx) {
        processDate(">=", ctx.DATE().getText());
    }

    @Override
    public void exitUntilExpression(AdvancedSearchLanguageParser.UntilExpressionContext ctx) {
        processDate("<=", ctx.DATE().getText());
    }

    @Override
    public void exitLimitExpression(AdvancedSearchLanguageParser.LimitExpressionContext ctx) {
        limitClause = "LIMIT " + ctx.getChild(2).getText();
        LOGGER.debug("Set limit clause: {}", limitClause);
    }

    private void processWord(String key, List<ParseTree> words, boolean isLike) {
        String operator = isLike ? "LIKE" : "=";
        StringBuilder conditionBuilder = new StringBuilder();

        if (expressionValues.containsKey(key)) {
            String prev = expressionValues.get(key);
            conditionBuilder.append(prev, 0, prev.length() - 1);
            conditionBuilder.append(" OR ");
        } else {
            conditionBuilder.append("( ");
        }

        for (int i = 2; i < words.size(); i += 2) {
            String value = words.get(i).getText().replace("\"", "");
            conditionBuilder.append(key)
                    .append(" ")
                    .append(operator)
                    .append(operator.equals("LIKE") ? " '%" : " '")
                    .append(value)
                    .append(operator.equals("LIKE") ? "%'" : "'");
            if (i < words.size() - 1) {
                String logicOp = words.get(i + 1).getText();
                conditionBuilder.append(" ").append("AND".equalsIgnoreCase(logicOp) ? "AND" : "OR").append(" ");
            } else {
                conditionBuilder.append(" )");
            }
        }

        expressionValues.put(key, conditionBuilder.toString());
        LOGGER.debug("Processed word condition for {}: {}", key, conditionBuilder);
    }

    private void processDate(String sign, String date) {
        String key = "created_at";
        StringBuilder conditionBuilder = new StringBuilder();
        if (expressionValues.containsKey(key)) {
            String prev = expressionValues.get(key);
            conditionBuilder.append(prev, 0, prev.length() - 1);
            conditionBuilder.append(" AND ");
        } else {
            conditionBuilder.append("( ");
        }

        conditionBuilder.append(key)
                .append(" ")
                .append(sign)
                .append(" '")
                .append(date)
                .append("' )");

        expressionValues.put(key, conditionBuilder.toString());
        LOGGER.debug("Processed date condition for {}: {}", key, conditionBuilder);
    }
}
