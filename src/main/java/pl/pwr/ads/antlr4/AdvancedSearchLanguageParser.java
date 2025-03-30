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
		FIND_TITLE_KEYWORD=1, FIND_CONTENT_KEYWORD=2, FROM_KEYWORD=3, LANG_KEYWORD=4, 
		LIMIT_KEYWORD=5, FILTER_KEYWORD=6, SINCE_KEYWORD=7, UNTIL_KEYWORD=8, COLON=9, 
		OR=10, AND=11, DATE=12, LANGUAGE=13, NUMBER=14, FILTER=15, WORD=16, QUOTED_WORD=17, 
		WS=18;
	public static final int
		RULE_query = 0, RULE_expression = 1, RULE_findTitleExpression = 2, RULE_findContentExpression = 3, 
		RULE_fromExpression = 4, RULE_langExpression = 5, RULE_sinceExpression = 6, 
		RULE_untilExpression = 7, RULE_limitExpression = 8, RULE_filterExpression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "expression", "findTitleExpression", "findContentExpression", 
			"fromExpression", "langExpression", "sinceExpression", "untilExpression", 
			"limitExpression", "filterExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'findtitle'", "'findcontent'", "'from'", "'lang'", "'limit'", 
			"'filter'", "'since'", "'until'", "':'", "'OR'", "'AND'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FIND_TITLE_KEYWORD", "FIND_CONTENT_KEYWORD", "FROM_KEYWORD", "LANG_KEYWORD", 
			"LIMIT_KEYWORD", "FILTER_KEYWORD", "SINCE_KEYWORD", "UNTIL_KEYWORD", 
			"COLON", "OR", "AND", "DATE", "LANGUAGE", "NUMBER", "FILTER", "WORD", 
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				expression();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0) );
			setState(25);
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
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
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
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIND_TITLE_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				findTitleExpression();
				}
				break;
			case FIND_CONTENT_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				findContentExpression();
				}
				break;
			case FROM_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				fromExpression();
				}
				break;
			case SINCE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				sinceExpression();
				}
				break;
			case UNTIL_KEYWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				untilExpression();
				}
				break;
			case LANG_KEYWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				langExpression();
				}
				break;
			case LIMIT_KEYWORD:
				enterOuterAlt(_localctx, 7);
				{
				setState(33);
				limitExpression();
				}
				break;
			case FILTER_KEYWORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(34);
				filterExpression();
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
			setState(37);
			match(FIND_TITLE_KEYWORD);
			setState(38);
			match(COLON);
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
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
				setState(46);
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
			setState(47);
			match(FIND_CONTENT_KEYWORD);
			setState(48);
			match(COLON);
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(51);
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
				setState(56);
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
			setState(57);
			match(FROM_KEYWORD);
			setState(58);
			match(COLON);
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
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
				setState(66);
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
			setState(67);
			match(LANG_KEYWORD);
			setState(68);
			match(COLON);
			setState(69);
			match(LANGUAGE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				match(LANGUAGE);
				}
				}
				setState(76);
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
			setState(77);
			match(SINCE_KEYWORD);
			setState(78);
			match(COLON);
			setState(79);
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
			setState(81);
			match(UNTIL_KEYWORD);
			setState(82);
			match(COLON);
			setState(83);
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
			setState(85);
			match(LIMIT_KEYWORD);
			setState(86);
			match(COLON);
			setState(87);
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
	public static class FilterExpressionContext extends ParserRuleContext {
		public TerminalNode FILTER_KEYWORD() { return getToken(AdvancedSearchLanguageParser.FILTER_KEYWORD, 0); }
		public TerminalNode COLON() { return getToken(AdvancedSearchLanguageParser.COLON, 0); }
		public List<TerminalNode> FILTER() { return getTokens(AdvancedSearchLanguageParser.FILTER); }
		public TerminalNode FILTER(int i) {
			return getToken(AdvancedSearchLanguageParser.FILTER, i);
		}
		public List<TerminalNode> OR() { return getTokens(AdvancedSearchLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AdvancedSearchLanguageParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(AdvancedSearchLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AdvancedSearchLanguageParser.AND, i);
		}
		public FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).enterFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedSearchLanguageListener ) ((AdvancedSearchLanguageListener)listener).exitFilterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedSearchLanguageVisitor ) return ((AdvancedSearchLanguageVisitor<? extends T>)visitor).visitFilterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExpressionContext filterExpression() throws RecognitionException {
		FilterExpressionContext _localctx = new FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filterExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(FILTER_KEYWORD);
			setState(90);
			match(COLON);
			setState(91);
			match(FILTER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				match(FILTER);
				}
				}
				setState(98);
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
		"\u0004\u0001\u0012d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003"+
		"\f\u00038\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005I\b\u0005\n\u0005"+
		"\f\u0005L\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t\u0001"+
		"\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000"+
		"\u0002\u0001\u0000\u0010\u0011\u0001\u0000\n\u000bf\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nC\u0001"+
		"\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000"+
		"\u0000\u0010U\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"$\u0003\u0004\u0002\u0000\u001c$\u0003\u0006\u0003\u0000\u001d$\u0003"+
		"\b\u0004\u0000\u001e$\u0003\f\u0006\u0000\u001f$\u0003\u000e\u0007\u0000"+
		" $\u0003\n\u0005\u0000!$\u0003\u0010\b\u0000\"$\u0003\u0012\t\u0000#\u001b"+
		"\u0001\u0000\u0000\u0000#\u001c\u0001\u0000\u0000\u0000#\u001d\u0001\u0000"+
		"\u0000\u0000#\u001e\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000"+
		"# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0005"+
		"\t\u0000\u0000\',\u0007\u0000\u0000\u0000()\u0007\u0001\u0000\u0000)+"+
		"\u0007\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0002\u0000\u0000"+
		"01\u0005\t\u0000\u000016\u0007\u0000\u0000\u000023\u0007\u0001\u0000\u0000"+
		"35\u0007\u0000\u0000\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0003\u0000\u0000"+
		":;\u0005\t\u0000\u0000;@\u0007\u0000\u0000\u0000<=\u0007\u0001\u0000\u0000"+
		"=?\u0007\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0004\u0000\u0000DE\u0005"+
		"\t\u0000\u0000EJ\u0005\r\u0000\u0000FG\u0007\u0001\u0000\u0000GI\u0005"+
		"\r\u0000\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0005\t\u0000"+
		"\u0000OP\u0005\f\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0005\b\u0000"+
		"\u0000RS\u0005\t\u0000\u0000ST\u0005\f\u0000\u0000T\u000f\u0001\u0000"+
		"\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0005\t\u0000\u0000WX\u0005\u000e"+
		"\u0000\u0000X\u0011\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000\u0000"+
		"Z[\u0005\t\u0000\u0000[`\u0005\u000f\u0000\u0000\\]\u0007\u0001\u0000"+
		"\u0000]_\u0005\u000f\u0000\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0013"+
		"\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000\u0007\u0017#,6@J`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}