// Generated from C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/Grammar\Euler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EulerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, SEMI=2, ASSIGN=3, LT=4, BT=5, EQEQ=6, NOTEQ=7, LTEQ=8, BTEQ=9, 
		IF=10, THEN=11, ELSE=12, END=13, WHILE=14, DO=15, PRINT=16, PLUS=17, MINUS=18, 
		MULT=19, DIVID=20, MOD=21, LPAREN=22, RPAREN=23, LSQBRACK=24, RSQBRACK=25, 
		COMMA=26, NUMB=27, VEC=28, MTX=29, NUM=30, MATRIX=31, VECTOR=32, STRING=33, 
		ID=34, WHITESPACE=35, NEWLINE=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", "BTEQ", 
			"IF", "THEN", "ELSE", "END", "WHILE", "DO", "PRINT", "PLUS", "MINUS", 
			"MULT", "DIVID", "MOD", "LPAREN", "RPAREN", "LSQBRACK", "RSQBRACK", "COMMA", 
			"NUMB", "VEC", "MTX", "NUM", "MATRIX", "VECTOR", "STRING", "ID", "WHITESPACE", 
			"NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", 
			"'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'print'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", "','", "'num'", 
			"'vec'", "'mtx'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", 
			"BTEQ", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "PRINT", "PLUS", 
			"MINUS", "MULT", "DIVID", "MOD", "LPAREN", "RPAREN", "LSQBRACK", "RSQBRACK", 
			"COMMA", "NUMB", "VEC", "MTX", "NUM", "MATRIX", "VECTOR", "STRING", "ID", 
			"WHITESPACE", "NEWLINE"
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


	public EulerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Euler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\6\37\u00a3\n\37\r\37\16\37\u00a4\3\37\3\37\6\37\u00a9"+
		"\n\37\r\37\16\37\u00aa\5\37\u00ad\n\37\3 \3 \7 \u00b1\n \f \16 \u00b4"+
		"\13 \3 \3 \5 \u00b8\n \3 \7 \u00bb\n \f \16 \u00be\13 \3 \3 \7 \u00c2"+
		"\n \f \16 \u00c5\13 \3 \3 \5 \u00c9\n \6 \u00cb\n \r \16 \u00cc\3 \7 "+
		"\u00d0\n \f \16 \u00d3\13 \3 \3 \7 \u00d7\n \f \16 \u00da\13 \3 \3 \5"+
		" \u00de\n \3 \7 \u00e1\n \f \16 \u00e4\13 \3 \3 \7 \u00e8\n \f \16 \u00eb"+
		"\13 \3 \3 \5 \u00ef\n \6 \u00f1\n \r \16 \u00f2\3 \7 \u00f6\n \f \16 "+
		"\u00f9\13 \6 \u00fb\n \r \16 \u00fc\3 \7 \u0100\n \f \16 \u0103\13 \3"+
		" \3 \3!\3!\7!\u0109\n!\f!\16!\u010c\13!\3!\3!\5!\u0110\n!\3!\7!\u0113"+
		"\n!\f!\16!\u0116\13!\3!\3!\7!\u011a\n!\f!\16!\u011d\13!\3!\3!\5!\u0121"+
		"\n!\3!\7!\u0124\n!\f!\16!\u0127\13!\7!\u0129\n!\f!\16!\u012c\13!\3!\7"+
		"!\u012f\n!\f!\16!\u0132\13!\3!\3!\3\"\3\"\7\"\u0138\n\"\f\"\16\"\u013b"+
		"\13\"\3\"\3\"\3#\7#\u0140\n#\f#\16#\u0143\13#\3#\3#\7#\u0147\n#\f#\16"+
		"#\u014a\13#\3$\3$\6$\u014e\n$\r$\16$\u014f\5$\u0152\n$\3$\3$\3%\5%\u0157"+
		"\n%\3%\3%\6%\u015b\n%\r%\16%\u015c\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\7\3\2\62;"+
		"\7\2\"\"\62;C\\aac|\5\2\62;C\\c|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0180\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\r"+
		"U\3\2\2\2\17X\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27d\3\2\2\2"+
		"\31i\3\2\2\2\33n\3\2\2\2\35r\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#\u0081\3\2"+
		"\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b"+
		"\3\2\2\2/\u008d\3\2\2\2\61\u008f\3\2\2\2\63\u0091\3\2\2\2\65\u0093\3\2"+
		"\2\2\67\u0095\3\2\2\29\u0099\3\2\2\2;\u009d\3\2\2\2=\u00a2\3\2\2\2?\u00ae"+
		"\3\2\2\2A\u0106\3\2\2\2C\u0135\3\2\2\2E\u0141\3\2\2\2G\u0151\3\2\2\2I"+
		"\u015a\3\2\2\2KL\7&\2\2L\4\3\2\2\2MN\7=\2\2N\6\3\2\2\2OP\7?\2\2P\b\3\2"+
		"\2\2QR\7>\2\2R\n\3\2\2\2ST\7@\2\2T\f\3\2\2\2UV\7?\2\2VW\7?\2\2W\16\3\2"+
		"\2\2XY\7#\2\2YZ\7?\2\2Z\20\3\2\2\2[\\\7>\2\2\\]\7?\2\2]\22\3\2\2\2^_\7"+
		"@\2\2_`\7?\2\2`\24\3\2\2\2ab\7k\2\2bc\7h\2\2c\26\3\2\2\2de\7v\2\2ef\7"+
		"j\2\2fg\7g\2\2gh\7p\2\2h\30\3\2\2\2ij\7g\2\2jk\7n\2\2kl\7u\2\2lm\7g\2"+
		"\2m\32\3\2\2\2no\7g\2\2op\7p\2\2pq\7f\2\2q\34\3\2\2\2rs\7y\2\2st\7j\2"+
		"\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w\36\3\2\2\2xy\7f\2\2yz\7q\2\2z \3\2\2\2"+
		"{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\"\3\2\2"+
		"\2\u0081\u0082\7-\2\2\u0082$\3\2\2\2\u0083\u0084\7/\2\2\u0084&\3\2\2\2"+
		"\u0085\u0086\7,\2\2\u0086(\3\2\2\2\u0087\u0088\7\61\2\2\u0088*\3\2\2\2"+
		"\u0089\u008a\7\'\2\2\u008a,\3\2\2\2\u008b\u008c\7*\2\2\u008c.\3\2\2\2"+
		"\u008d\u008e\7+\2\2\u008e\60\3\2\2\2\u008f\u0090\7]\2\2\u0090\62\3\2\2"+
		"\2\u0091\u0092\7_\2\2\u0092\64\3\2\2\2\u0093\u0094\7.\2\2\u0094\66\3\2"+
		"\2\2\u0095\u0096\7p\2\2\u0096\u0097\7w\2\2\u0097\u0098\7o\2\2\u00988\3"+
		"\2\2\2\u0099\u009a\7x\2\2\u009a\u009b\7g\2\2\u009b\u009c\7e\2\2\u009c"+
		":\3\2\2\2\u009d\u009e\7o\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7z\2\2\u00a0"+
		"<\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00a8"+
		"\7\60\2\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad>\3\2\2\2\u00ae\u00b2\7}\2\2\u00af\u00b1"+
		"\5G$\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\5="+
		"\37\2\u00b6\u00b8\5E#\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bc\3\2\2\2\u00b9\u00bb\5G$\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00ca\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c3\7.\2\2\u00c0\u00c2\5G$\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\5=\37\2\u00c7\u00c9\5E#\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00bf\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2"+
		"\2\2\u00ce\u00d0\5G$\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00fa\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d8\7=\2\2\u00d5\u00d7\5G$\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00de\5=\37\2\u00dc\u00de\5E#\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\5G$\2\u00e0\u00df\3\2\2"+
		"\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00f0"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\7.\2\2\u00e6\u00e8\5G$\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\5=\37\2\u00ed"+
		"\u00ef\5E#\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f1\3\2\2"+
		"\2\u00f0\u00e5\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\5G$\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00d4\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u0100\5G"+
		"$\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\177"+
		"\2\2\u0105@\3\2\2\2\u0106\u010a\7>\2\2\u0107\u0109\5G$\2\u0108\u0107\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010f\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0110\5=\37\2\u010e\u0110\5E"+
		"#\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0114\3\2\2\2\u0111"+
		"\u0113\5G$\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u012a\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011b"+
		"\7.\2\2\u0118\u011a\5G$\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0120\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u0121\5=\37\2\u011f\u0121\5E#\2\u0120\u011e\3\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0124\5G$\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u0117\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012f\5G$\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7@\2\2\u0134B\3\2\2\2\u0135\u0139\7$\2\2\u0136\u0138\t\3\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$\2\2\u013d"+
		"D\3\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0148\t\5\2\2\u0145\u0147\t\4\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149F\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014b\u0152\5I%\2\u014c\u014e\t\6\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014d\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\b$\2\2\u0154H\3\2\2\2\u0155\u0157\7\17\2\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\7\f\2\2\u0159"+
		"\u015b\7\17\2\2\u015a\u0156\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dJ\3\2\2\2&\2\u00a4"+
		"\u00aa\u00ac\u00b2\u00b7\u00bc\u00c3\u00c8\u00cc\u00d1\u00d8\u00dd\u00e2"+
		"\u00e9\u00ee\u00f2\u00f7\u00fc\u0101\u010a\u010f\u0114\u011b\u0120\u0125"+
		"\u012a\u0130\u0139\u0141\u0148\u014f\u0151\u0156\u015a\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}