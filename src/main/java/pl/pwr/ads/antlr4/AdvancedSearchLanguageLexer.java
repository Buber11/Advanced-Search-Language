// Generated from D:/Github/Advanced-Search-Language/src/main/java/pl/pwr/ads/antlr4/AdvancedSearchLanguage.g4 by ANTLR 4.13.2
package pl.pwr.ads.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AdvancedSearchLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIND_TITLE_KEYWORD=1, FIND_CONTENT_KEYWORD=2, FROM_KEYWORD=3, LANG_KEYWORD=4, 
		LIMIT_KEYWORD=5, FILTER_KEYWORD=6, SINCE_KEYWORD=7, UNTIL_KEYWORD=8, COLON=9, 
		OR=10, AND=11, DATE=12, LANGUAGE=13, NUMBER=14, FILTER=15, WORD=16, QUOTED_WORD=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FIND_TITLE_KEYWORD", "FIND_CONTENT_KEYWORD", "FROM_KEYWORD", "LANG_KEYWORD", 
			"LIMIT_KEYWORD", "FILTER_KEYWORD", "SINCE_KEYWORD", "UNTIL_KEYWORD", 
			"COLON", "OR", "AND", "DIGIT", "LETTER", "DATE", "LANGUAGE", "NUMBER", 
			"FILTER", "WORD", "QUOTED_WORD", "WS"
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


	public AdvancedSearchLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AdvancedSearchLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u007f\b\u000f\u000b"+
		"\u000f\f\u000f\u0080\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u008d\b\u0010\u0001\u0011\u0004\u0011\u0090\b\u0011\u000b\u0011"+
		"\f\u0011\u0091\u0001\u0012\u0001\u0012\u0005\u0012\u0096\b\u0012\n\u0012"+
		"\f\u0012\u0099\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013"+
		"\u009e\b\u0013\u000b\u0013\f\u0013\u009f\u0001\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\u0000"+
		"\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012\u0001\u0000"+
		"\u0018\u0002\u0000FFff\u0002\u0000IIii\u0002\u0000NNnn\u0002\u0000DDd"+
		"d\u0002\u0000TTtt\u0002\u0000LLll\u0002\u0000EEee\u0002\u0000CCcc\u0002"+
		"\u0000OOoo\u0002\u0000RRrr\u0002\u0000MMmm\u0002\u0000AAaa\u0002\u0000"+
		"GGgg\u0002\u0000SSss\u0002\u0000UUuu\u0001\u000009\u0002\u0000AZaz\u0002"+
		"\u0000--//\u0002\u0000PPpp\u0002\u0000HHhh\u0002\u0000VVvv\u0003\u0000"+
		"  AZaz\u0005\u0000\n\n\r\r\"\"<<>>\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u00033\u0001"+
		"\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000"+
		"\u0000\tI\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rV\u0001"+
		"\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011b\u0001\u0000"+
		"\u0000\u0000\u0013d\u0001\u0000\u0000\u0000\u0015g\u0001\u0000\u0000\u0000"+
		"\u0017k\u0001\u0000\u0000\u0000\u0019m\u0001\u0000\u0000\u0000\u001bo"+
		"\u0001\u0000\u0000\u0000\u001dz\u0001\u0000\u0000\u0000\u001f~\u0001\u0000"+
		"\u0000\u0000!\u008c\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000"+
		"%\u0093\u0001\u0000\u0000\u0000\'\u009d\u0001\u0000\u0000\u0000)*\u0007"+
		"\u0000\u0000\u0000*+\u0007\u0001\u0000\u0000+,\u0007\u0002\u0000\u0000"+
		",-\u0007\u0003\u0000\u0000-.\u0007\u0004\u0000\u0000./\u0007\u0001\u0000"+
		"\u0000/0\u0007\u0004\u0000\u000001\u0007\u0005\u0000\u000012\u0007\u0006"+
		"\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0007\u0000\u0000\u0000"+
		"45\u0007\u0001\u0000\u000056\u0007\u0002\u0000\u000067\u0007\u0003\u0000"+
		"\u000078\u0007\u0007\u0000\u000089\u0007\b\u0000\u00009:\u0007\u0002\u0000"+
		"\u0000:;\u0007\u0004\u0000\u0000;<\u0007\u0006\u0000\u0000<=\u0007\u0002"+
		"\u0000\u0000=>\u0007\u0004\u0000\u0000>\u0004\u0001\u0000\u0000\u0000"+
		"?@\u0007\u0000\u0000\u0000@A\u0007\t\u0000\u0000AB\u0007\b\u0000\u0000"+
		"BC\u0007\n\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DE\u0007\u0005\u0000"+
		"\u0000EF\u0007\u000b\u0000\u0000FG\u0007\u0002\u0000\u0000GH\u0007\f\u0000"+
		"\u0000H\b\u0001\u0000\u0000\u0000IJ\u0007\u0005\u0000\u0000JK\u0007\u0001"+
		"\u0000\u0000KL\u0007\n\u0000\u0000LM\u0007\u0001\u0000\u0000MN\u0007\u0004"+
		"\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000PQ\u0007"+
		"\u0001\u0000\u0000QR\u0007\u0005\u0000\u0000RS\u0007\u0004\u0000\u0000"+
		"ST\u0007\u0006\u0000\u0000TU\u0007\t\u0000\u0000U\f\u0001\u0000\u0000"+
		"\u0000VW\u0007\r\u0000\u0000WX\u0007\u0001\u0000\u0000XY\u0007\u0002\u0000"+
		"\u0000YZ\u0007\u0007\u0000\u0000Z[\u0007\u0006\u0000\u0000[\u000e\u0001"+
		"\u0000\u0000\u0000\\]\u0007\u000e\u0000\u0000]^\u0007\u0002\u0000\u0000"+
		"^_\u0007\u0004\u0000\u0000_`\u0007\u0001\u0000\u0000`a\u0007\u0005\u0000"+
		"\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005:\u0000\u0000c\u0012\u0001"+
		"\u0000\u0000\u0000de\u0007\b\u0000\u0000ef\u0007\t\u0000\u0000f\u0014"+
		"\u0001\u0000\u0000\u0000gh\u0007\u000b\u0000\u0000hi\u0007\u0002\u0000"+
		"\u0000ij\u0007\u0003\u0000\u0000j\u0016\u0001\u0000\u0000\u0000kl\u0007"+
		"\u000f\u0000\u0000l\u0018\u0001\u0000\u0000\u0000mn\u0007\u0010\u0000"+
		"\u0000n\u001a\u0001\u0000\u0000\u0000op\u0003\u0017\u000b\u0000pq\u0003"+
		"\u0017\u000b\u0000qr\u0003\u0017\u000b\u0000rs\u0003\u0017\u000b\u0000"+
		"st\u0007\u0011\u0000\u0000tu\u0003\u0017\u000b\u0000uv\u0003\u0017\u000b"+
		"\u0000vw\u0007\u0011\u0000\u0000wx\u0003\u0017\u000b\u0000xy\u0003\u0017"+
		"\u000b\u0000y\u001c\u0001\u0000\u0000\u0000z{\u0003\u0019\f\u0000{|\u0003"+
		"\u0019\f\u0000|\u001e\u0001\u0000\u0000\u0000}\u007f\u0003\u0017\u000b"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081 \u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0007\u0012\u0000\u0000\u0083\u0084\u0007"+
		"\u0013\u0000\u0000\u0084\u0085\u0007\b\u0000\u0000\u0085\u0086\u0007\u0004"+
		"\u0000\u0000\u0086\u008d\u0007\b\u0000\u0000\u0087\u0088\u0007\u0014\u0000"+
		"\u0000\u0088\u0089\u0007\u0001\u0000\u0000\u0089\u008a\u0007\u0003\u0000"+
		"\u0000\u008a\u008b\u0007\u0006\u0000\u0000\u008b\u008d\u0007\b\u0000\u0000"+
		"\u008c\u0082\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000"+
		"\u008d\"\u0001\u0000\u0000\u0000\u008e\u0090\u0007\u0015\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"$\u0001\u0000\u0000\u0000\u0093\u0097\u0005\"\u0000\u0000\u0094\u0096"+
		"\b\u0016\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\"\u0000\u0000\u009b&\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0007\u0017\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0006\u0013\u0000\u0000\u00a2(\u0001\u0000\u0000"+
		"\u0000\u0006\u0000\u0080\u008c\u0091\u0097\u009f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}