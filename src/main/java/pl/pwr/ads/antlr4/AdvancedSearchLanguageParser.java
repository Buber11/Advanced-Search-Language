// Generated from D:/Github/Advanced-Search-Language/src/main/java/pl/pwr/ads/antlr4/AdvancedSearchLanguage.g4 by ANTLR 4.13.2
package pl.pwr.ads.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AdvancedSearchLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FIND_TITLE_KEYWORD=2, FIND_CONTENT_KEYWORD=3, FROM_KEYWORD=4, 
		LANG_KEYWORD=5, LIMIT_KEYWORD=6, OFFSET_KEYWORD=7, ORDER_BY_KEYWORD=8, 
		SORT_KEYWORD=9, SINCE_KEYWORD=10, UNTIL_KEYWORD=11, COLON=12, OR=13, AND=14, 
		DATE=15, LANGUAGE=16, NUMBER=17, ORDER_BY_WORD=18, SORT_BY_WORD=19, WORD=20, 
		QUOTED_WORD=21, WS=22;
	public static final int
		RULE_query = 0, RULE_expression = 1, RULE_findTitleExpression = 2, RULE_findContentExpression = 3, 
		RULE_fromExpression = 4, RULE_langExpression = 5, RULE_sinceExpression = 6, 
		RULE_untilExpression = 7, RULE_limitExpression = 8, RULE_offsetExpression = 9, 
		RULE_orderByExpression = 10, RULE_sortByExpression = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "expression", "findTitleExpression", "findContentExpression", 
			"fromExpression", "langExpression", "sinceExpression", "untilExpression", 
			"limitExpression", "offsetExpression", "orderByExpression", "sortByExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'findtitle'", "'findcontent'", "'from'", "'lang'", "'limit'", 
			"'offset'", "'orderby'", "'sortby'", "'since'", "'until'", "':'", "'OR'", 
			"'AND'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FIND_TITLE_KEYWORD", "FIND_CONTENT_KEYWORD", "FROM_KEYWORD", 
			"LANG_KEYWORD", "LIMIT_KEYWORD", "OFFSET_KEYWORD", "ORDER_BY_KEYWORD", 
			"SORT_KEYWORD", "SINCE_KEYWORD", "UNTIL_KEYWORD", "COLON", "OR", "AND", 
			"DATE", "LANGUAGE", "NUMBER", "ORDER_BY_WORD", "SORT_BY_WORD", "WORD", 
			"QUOTED_WORD", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AdvancedSearchLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdvancedSearchLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AdvancedSearchLanguageParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4092L) != 0)) {
				{
				{
				setState(24);
				expression();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public FindTitleExpressionContext findTitleExpression() {
			return getRuleContext(FindTitleExpressionContext.class,0);
		}
		public FindContentExpressionContext findContentExpression() {
			return getRuleContext(FindContentExpressionContext.class,0);
		}
		public FromExpressionContext fromExpression() {
			return getRuleContext(FromExpressionContext.class,0);
		}
		public SinceExpressionContext sinceExpression() {
			return getRuleContext(SinceExpressionContext.class,0);
		}
		public UntilExpressionContext untilExpression() {
			return getRuleContext(UntilExpressionContext.class,0);
		}
		public LangExpressionContext langExpression() {
			return getRuleContext(LangExpressionContext.class,0);
		}
		public LimitExpressionContext limitExpression() {
			return getRuleContext(LimitExpressionContext.class,0);
		}
		public OffsetExpressionContext offsetExpression() {
			return getRuleContext(OffsetExpressionContext.class,0);
		}
		public OrderByExpressionContext orderByExpression() {
			return getRuleContext(OrderByExpressionContext.class,0);
		}
		public SortByExpressionContext sortByExpression() {
			return getRuleContext(SortByExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIND_TITLE_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				findTitleExpression();
				}
				break;
			case FIND_CONTENT_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				findContentExpression();
				}
				break;
			case FROM_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				fromExpression();
				}
				break;
			case SINCE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				sinceExpression();
				}
				break;
			case UNTIL_KEYWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				untilExpression();
				}
				break;
			case LANG_KEYWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				langExpression();
				}
				break;
			case LIMIT_KEYWORD:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				limitExpression();
				}
				break;
			case OFFSET_KEYWORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(39);
				offsetExpression();
				}
				break;
			case ORDER_BY_KEYWORD:
				enterOuterAlt(_localctx, 9);
				{
				setState(40);
				orderByExpression();
				}
				break;
			case SORT_KEYWORD:
				enterOuterAlt(_localctx, 10);
				{
				setState(41);
				sortByExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FindTitleExpressionContext extends ParserRuleContext {
		public TerminalNode FIND_TITLE_KEYWORD() { return getToken(AdvancedSearchLanguageParser.FIND_TITLE_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public List<TerminalNode> QUOTED_WORD() { return getTokens(AdvancedSearchLanguageParser.QUOTED_WORD); }
		public TerminalNode QUOTED_WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.QUOTED_WORD, i);
		}
		public List<TerminalNode> WORD() { return getTokens(AdvancedSearchLanguageParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.WORD, i);
		}
		public List<TerminalNode> OR() { return getTokens(AdvancedSearchLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AdvancedSearchLanguageParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(AdvancedSearchLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AdvancedSearchLanguageParser.AND, i);
		}
		public FindTitleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findTitleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterFindTitleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitFindTitleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitFindTitleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindTitleExpressionContext findTitleExpression() throws RecognitionException {
		FindTitleExpressionContext _localctx = new FindTitleExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_findTitleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FIND_TITLE_KEYWORD);
			setState(45);
			match(COLON);
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==QUOTED_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FindContentExpressionContext extends ParserRuleContext {
		public TerminalNode FIND_CONTENT_KEYWORD() { return getToken(AdvancedSearchLanguageParser.FIND_CONTENT_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public List<TerminalNode> QUOTED_WORD() { return getTokens(AdvancedSearchLanguageParser.QUOTED_WORD); }
		public TerminalNode QUOTED_WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.QUOTED_WORD, i);
		}
		public List<TerminalNode> WORD() { return getTokens(AdvancedSearchLanguageParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.WORD, i);
		}
		public List<TerminalNode> OR() { return getTokens(AdvancedSearchLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AdvancedSearchLanguageParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(AdvancedSearchLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AdvancedSearchLanguageParser.AND, i);
		}
		public FindContentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findContentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterFindContentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitFindContentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitFindContentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindContentExpressionContext findContentExpression() throws RecognitionException {
		FindContentExpressionContext _localctx = new FindContentExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_findContentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FIND_CONTENT_KEYWORD);
			setState(55);
			match(COLON);
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==QUOTED_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromExpressionContext extends ParserRuleContext {
		public TerminalNode FROM_KEYWORD() { return getToken(AdvancedSearchLanguageParser.FROM_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public List<TerminalNode> WORD() { return getTokens(AdvancedSearchLanguageParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.WORD, i);
		}
		public List<TerminalNode> QUOTED_WORD() { return getTokens(AdvancedSearchLanguageParser.QUOTED_WORD); }
		public TerminalNode QUOTED_WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.QUOTED_WORD, i);
		}
		public List<TerminalNode> OR() { return getTokens(AdvancedSearchLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AdvancedSearchLanguageParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(AdvancedSearchLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AdvancedSearchLanguageParser.AND, i);
		}
		public FromExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterFromExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitFromExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitFromExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromExpressionContext fromExpression() throws RecognitionException {
		FromExpressionContext _localctx = new FromExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fromExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FROM_KEYWORD);
			setState(65);
			match(COLON);
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==QUOTED_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LangExpressionContext extends ParserRuleContext {
		public TerminalNode LANG_KEYWORD() { return getToken(AdvancedSearchLanguageParser.LANG_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public List<TerminalNode> LANGUAGE() { return getTokens(AdvancedSearchLanguageParser.LANGUAGE); }
		public TerminalNode LANGUAGE(int i) {
			return getToken(AdvancedSearchLanguageParser.LANGUAGE, i);
		}
		public List<TerminalNode> AND() { return getTokens(AdvancedSearchLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AdvancedSearchLanguageParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(AdvancedSearchLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AdvancedSearchLanguageParser.OR, i);
		}
		public LangExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterLangExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitLangExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitLangExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LangExpressionContext langExpression() throws RecognitionException {
		LangExpressionContext _localctx = new LangExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_langExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LANG_KEYWORD);
			setState(75);
			match(COLON);
			setState(76);
			match(LANGUAGE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(78);
				match(LANGUAGE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinceExpressionContext extends ParserRuleContext {
		public TerminalNode SINCE_KEYWORD() { return getToken(AdvancedSearchLanguageParser.SINCE_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public TerminalNode DATE() { return getToken(AdvancedSearchLanguageParser.DATE, 0); }
		public SinceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterSinceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitSinceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitSinceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinceExpressionContext sinceExpression() throws RecognitionException {
		SinceExpressionContext _localctx = new SinceExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sinceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(SINCE_KEYWORD);
			setState(85);
			match(COLON);
			setState(86);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UntilExpressionContext extends ParserRuleContext {
		public TerminalNode UNTIL_KEYWORD() { return getToken(AdvancedSearchLanguageParser.UNTIL_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public TerminalNode DATE() { return getToken(AdvancedSearchLanguageParser.DATE, 0); }
		public UntilExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterUntilExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitUntilExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitUntilExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilExpressionContext untilExpression() throws RecognitionException {
		UntilExpressionContext _localctx = new UntilExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_untilExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(UNTIL_KEYWORD);
			setState(89);
			match(COLON);
			setState(90);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitExpressionContext extends ParserRuleContext {
		public TerminalNode LIMIT_KEYWORD() { return getToken(AdvancedSearchLanguageParser.LIMIT_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(AdvancedSearchLanguageParser.NUMBER, 0); }
		public LimitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterLimitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitLimitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitLimitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExpressionContext limitExpression() throws RecognitionException {
		LimitExpressionContext _localctx = new LimitExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_limitExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LIMIT_KEYWORD);
			setState(93);
			match(COLON);
			setState(94);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetExpressionContext extends ParserRuleContext {
		public TerminalNode OFFSET_KEYWORD() { return getToken(AdvancedSearchLanguageParser.OFFSET_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(AdvancedSearchLanguageParser.NUMBER, 0); }
		public OffsetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterOffsetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitOffsetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitOffsetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetExpressionContext offsetExpression() throws RecognitionException {
		OffsetExpressionContext _localctx = new OffsetExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_offsetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(OFFSET_KEYWORD);
			setState(97);
			match(COLON);
			setState(98);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByExpressionContext extends ParserRuleContext {
		public TerminalNode ORDER_BY_KEYWORD() { return getToken(AdvancedSearchLanguageParser.ORDER_BY_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public TerminalNode ORDER_BY_WORD() { return getToken(AdvancedSearchLanguageParser.ORDER_BY_WORD, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterOrderByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitOrderByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitOrderByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ORDER_BY_KEYWORD);
			setState(101);
			match(COLON);
			setState(102);
			match(ORDER_BY_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortByExpressionContext extends ParserRuleContext {
		public TerminalNode SORT_KEYWORD() { return getToken(AdvancedSearchLanguageParser.SORT_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public List<TerminalNode> SORT_BY_WORD() { return getTokens(AdvancedSearchLanguageParser.SORT_BY_WORD); }
		public TerminalNode SORT_BY_WORD(int i) {
			return getToken(AdvancedSearchLanguageParser.SORT_BY_WORD, i);
		}
		public SortByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterSortByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitSortByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitSortByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortByExpressionContext sortByExpression() throws RecognitionException {
		SortByExpressionContext _localctx = new SortByExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sortByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(SORT_KEYWORD);
			setState(105);
			match(COLON);
			setState(106);
			match(SORT_BY_WORD);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(107);
				match(T__0);
				setState(108);
				match(SORT_BY_WORD);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016s\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"+\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003\n\u0003\f\u0003"+
		"?\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005P\b\u0005\n\u0005\f\u0005"+
		"S\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bn\b\u000b"+
		"\n\u000b\f\u000bq\t\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0002\u0001\u0000\u0014"+
		"\u0015\u0001\u0000\r\u000eu\u0000\u001b\u0001\u0000\u0000\u0000\u0002"+
		"*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00066\u0001"+
		"\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000"+
		"\fT\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010\\\u0001"+
		"\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000"+
		"\u0000\u0016h\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000"+
		" +\u0003\u0004\u0002\u0000!+\u0003\u0006\u0003\u0000\"+\u0003\b\u0004"+
		"\u0000#+\u0003\f\u0006\u0000$+\u0003\u000e\u0007\u0000%+\u0003\n\u0005"+
		"\u0000&+\u0003\u0010\b\u0000\'+\u0003\u0012\t\u0000(+\u0003\u0014\n\u0000"+
		")+\u0003\u0016\u000b\u0000* \u0001\u0000\u0000\u0000*!\u0001\u0000\u0000"+
		"\u0000*\"\u0001\u0000\u0000\u0000*#\u0001\u0000\u0000\u0000*$\u0001\u0000"+
		"\u0000\u0000*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000*\'\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0005\f\u0000"+
		"\u0000.3\u0007\u0000\u0000\u0000/0\u0007\u0001\u0000\u000002\u0007\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0005\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000067\u0005\u0003\u0000\u000078\u0005\f\u0000"+
		"\u00008=\u0007\u0000\u0000\u00009:\u0007\u0001\u0000\u0000:<\u0007\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0007\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005\f\u0000"+
		"\u0000BG\u0007\u0000\u0000\u0000CD\u0007\u0001\u0000\u0000DF\u0007\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005\f\u0000\u0000"+
		"LQ\u0005\u0010\u0000\u0000MN\u0007\u0001\u0000\u0000NP\u0005\u0010\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0005\n\u0000\u0000UV\u0005\f\u0000\u0000"+
		"VW\u0005\u000f\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0005\u000b\u0000"+
		"\u0000YZ\u0005\f\u0000\u0000Z[\u0005\u000f\u0000\u0000[\u000f\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\f\u0000\u0000^_\u0005"+
		"\u0011\u0000\u0000_\u0011\u0001\u0000\u0000\u0000`a\u0005\u0007\u0000"+
		"\u0000ab\u0005\f\u0000\u0000bc\u0005\u0011\u0000\u0000c\u0013\u0001\u0000"+
		"\u0000\u0000de\u0005\b\u0000\u0000ef\u0005\f\u0000\u0000fg\u0005\u0012"+
		"\u0000\u0000g\u0015\u0001\u0000\u0000\u0000hi\u0005\t\u0000\u0000ij\u0005"+
		"\f\u0000\u0000jo\u0005\u0013\u0000\u0000kl\u0005\u0001\u0000\u0000ln\u0005"+
		"\u0013\u0000\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0017\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000\u0007\u001b*3=GQo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}