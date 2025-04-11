// Generated from C:/Users/adamc/Documents/GitHub/Advanced-Search-Language/src/main/java/pl/pwr/ads/antlr4/AdvancedSearchLanguage.g4 by ANTLR 4.13.2
package pl.pwr.ads.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0)) {
				{
				{
				setState(20);
				expression();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIND_TITLE_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				findTitleExpression();
				}
				break;
			case FIND_CONTENT_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				findContentExpression();
				}
				break;
			case FROM_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				fromExpression();
				}
				break;
			case SINCE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				sinceExpression();
				}
				break;
			case UNTIL_KEYWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				untilExpression();
				}
				break;
			case LANG_KEYWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				langExpression();
				}
				break;
			case LIMIT_KEYWORD:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				limitExpression();
				}
				break;
			case FILTER_KEYWORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(35);
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
			setState(38);
			match(FIND_TITLE_KEYWORD);
			setState(39);
			match(COLON);
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
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
				setState(47);
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
			setState(48);
			match(FIND_CONTENT_KEYWORD);
			setState(49);
			match(COLON);
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
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
				setState(57);
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
			setState(58);
			match(FROM_KEYWORD);
			setState(59);
			match(COLON);
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==QUOTED_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
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
				setState(67);
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
			setState(68);
			match(LANG_KEYWORD);
			setState(69);
			match(COLON);
			setState(70);
			match(LANGUAGE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(72);
				match(LANGUAGE);
				}
				}
				setState(77);
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
			setState(78);
			match(SINCE_KEYWORD);
			setState(79);
			match(COLON);
			setState(80);
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
			setState(82);
			match(UNTIL_KEYWORD);
			setState(83);
			match(COLON);
			setState(84);
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
			setState(86);
			match(LIMIT_KEYWORD);
			setState(87);
			match(COLON);
			setState(88);
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
			setState(90);
			match(FILTER_KEYWORD);
			setState(91);
			match(COLON);
			setState(92);
			match(FILTER);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				match(FILTER);
				}
				}
				setState(99);
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
		"\u0004\u0001\u0012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003"+
		"\n\u0003\f\u00039\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005J\b\u0005"+
		"\n\u0005\f\u0005M\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t`\b\t\n\t\f"+
		"\tc\t\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0002\u0001\u0000\u0010\u0011\u0001\u0000\n\u000bg\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001"+
		"\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000"+
		"\u0000\nD\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eR\u0001"+
		"\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000"+
		"\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c%\u0003\u0004\u0002\u0000"+
		"\u001d%\u0003\u0006\u0003\u0000\u001e%\u0003\b\u0004\u0000\u001f%\u0003"+
		"\f\u0006\u0000 %\u0003\u000e\u0007\u0000!%\u0003\n\u0005\u0000\"%\u0003"+
		"\u0010\b\u0000#%\u0003\u0012\t\u0000$\u001c\u0001\u0000\u0000\u0000$\u001d"+
		"\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000"+
		"\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005\t\u0000\u0000(-\u0007\u0000"+
		"\u0000\u0000)*\u0007\u0001\u0000\u0000*,\u0007\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000001\u0005\u0002\u0000\u000012\u0005\t\u0000\u000027\u0007\u0000"+
		"\u0000\u000034\u0007\u0001\u0000\u000046\u0007\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u0005\t\u0000\u0000<A\u0007\u0000"+
		"\u0000\u0000=>\u0007\u0001\u0000\u0000>@\u0007\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0004\u0000\u0000EF\u0005\t\u0000\u0000FK\u0005\r\u0000"+
		"\u0000GH\u0007\u0001\u0000\u0000HJ\u0005\r\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0007\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0005\f\u0000\u0000"+
		"Q\r\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000ST\u0005\t\u0000\u0000"+
		"TU\u0005\f\u0000\u0000U\u000f\u0001\u0000\u0000\u0000VW\u0005\u0005\u0000"+
		"\u0000WX\u0005\t\u0000\u0000XY\u0005\u000e\u0000\u0000Y\u0011\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0006\u0000\u0000[\\\u0005\t\u0000\u0000\\a\u0005"+
		"\u000f\u0000\u0000]^\u0007\u0001\u0000\u0000^`\u0005\u000f\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u0013\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000\u0007\u0017$-7AKa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}