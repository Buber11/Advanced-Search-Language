// Generated from D:/Github/Advanced-Search-Language/src/main/java/pl/pwr/ads/antlr4/AdvancedSearchLanguage.g4 by ANTLR 4.13.2
package pl.pwr.ads.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdvancedSearchLanguageParser}.
 */
public interface AdvancedSearchLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(AdvancedSearchLanguageParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(AdvancedSearchLanguageParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AdvancedSearchLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AdvancedSearchLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#findTitleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFindTitleExpression(AdvancedSearchLanguageParser.FindTitleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#findTitleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFindTitleExpression(AdvancedSearchLanguageParser.FindTitleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#findContentExpression}.
	 * @param ctx the parse tree
	 */
	void enterFindContentExpression(AdvancedSearchLanguageParser.FindContentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#findContentExpression}.
	 * @param ctx the parse tree
	 */
	void exitFindContentExpression(AdvancedSearchLanguageParser.FindContentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#fromExpression}.
	 * @param ctx the parse tree
	 */
	void enterFromExpression(AdvancedSearchLanguageParser.FromExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#fromExpression}.
	 * @param ctx the parse tree
	 */
	void exitFromExpression(AdvancedSearchLanguageParser.FromExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#langExpression}.
	 * @param ctx the parse tree
	 */
	void enterLangExpression(AdvancedSearchLanguageParser.LangExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#langExpression}.
	 * @param ctx the parse tree
	 */
	void exitLangExpression(AdvancedSearchLanguageParser.LangExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#sinceExpression}.
	 * @param ctx the parse tree
	 */
	void enterSinceExpression(AdvancedSearchLanguageParser.SinceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#sinceExpression}.
	 * @param ctx the parse tree
	 */
	void exitSinceExpression(AdvancedSearchLanguageParser.SinceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#untilExpression}.
	 * @param ctx the parse tree
	 */
	void enterUntilExpression(AdvancedSearchLanguageParser.UntilExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#untilExpression}.
	 * @param ctx the parse tree
	 */
	void exitUntilExpression(AdvancedSearchLanguageParser.UntilExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#limitExpression}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpression(AdvancedSearchLanguageParser.LimitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#limitExpression}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpression(AdvancedSearchLanguageParser.LimitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#offsetExpression}.
	 * @param ctx the parse tree
	 */
	void enterOffsetExpression(AdvancedSearchLanguageParser.OffsetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#offsetExpression}.
	 * @param ctx the parse tree
	 */
	void exitOffsetExpression(AdvancedSearchLanguageParser.OffsetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(AdvancedSearchLanguageParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(AdvancedSearchLanguageParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdvancedSearchLanguageParser#sortByExpression}.
	 * @param ctx the parse tree
	 */
	void enterSortByExpression(AdvancedSearchLanguageParser.SortByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedSearchLanguageParser#sortByExpression}.
	 * @param ctx the parse tree
	 */
	void exitSortByExpression(AdvancedSearchLanguageParser.SortByExpressionContext ctx);
}