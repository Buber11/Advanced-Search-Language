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
    private String offsetClause = "";
    private String orderByClause = "";
    private String sortByClause = "";
    private int limit = 0;
    private int offset = 0;
    private int pageNumber;

    public AdvancedSearchLanguageImpl(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    private STGroup group = new STGroupFile("src/main/java/pl/pwr/ads/antlr4/SQLTemplates.stg");

    public Map<String,String> generateSql() {
        List<String> conditions = new ArrayList<>(expressionValues.values());

        String countSql = "";
        if (limit > 0 && limit > offset) {
            setPageParameter();
            ST sqlCountTemplate = group.getInstanceOf("sqlCountTemplate");
            sqlCountTemplate.add("conditions", conditions);
            sqlCountTemplate.add("limit",limit);
            sqlCountTemplate.add("offset",offset);
            countSql = sqlCountTemplate.render();
        }

        ST sqlTemplate = group.getInstanceOf("sqlTemplate");
        sqlTemplate.add("conditions", conditions);
        sqlTemplate.add("limitClause", limitClause);
        sqlTemplate.add("offsetClause", offsetClause);
        sqlTemplate.add("sortByClause", sortByClause);
        sqlTemplate.add("orderByClause", orderByClause);
        String sql = sqlTemplate.render();

        LOGGER.info("Generated SQL: {}", sql);
        return Map.of("sql", sql, "countSql", countSql);
    }

    private void setPageParameter(){
        int diference = (limit - offset) * ( pageNumber - 1 );
        limitClause = "LIMIT " + String.valueOf(limit);
        offsetClause = "OFFSET " + String.valueOf(offset + diference);
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
        limit = Integer.parseInt(ctx.getChild(2).getText());
        LOGGER.debug("Set limit clause: {}", limitClause);
    }

    @Override
    public void exitOffsetExpression(AdvancedSearchLanguageParser.OffsetExpressionContext ctx) {
        offset = Integer.parseInt(ctx.getChild(2).getText()) ;
    }

    @Override
    public void exitOrderByExpression(AdvancedSearchLanguageParser.OrderByExpressionContext ctx) {
        orderByClause = ctx.getChild(2).getText();
    }

    @Override
    public void exitSortByExpression(AdvancedSearchLanguageParser.SortByExpressionContext ctx) {
        System.out.println("sort expression");
        StringBuilder stringBuilderSortExpression = new StringBuilder();
        ctx.children.stream()
                .skip(2)
                .forEach(stringBuilderSortExpression::append);
        sortByClause = "ORDER BY " + stringBuilderSortExpression.toString();
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
