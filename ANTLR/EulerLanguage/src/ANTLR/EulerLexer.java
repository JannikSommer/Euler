// Generated from C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/Grammar\Euler.g4 by ANTLR 4.8
package ANTLR;
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
		COMMA=26, NUM=27, MATRIX=28, VECTOR=29, STRING=30, ID=31, WHITESPACE=32;
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
			"NUM", "MATRIX", "VECTOR", "STRING", "ID", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", 
			"'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'print'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", 
			"BTEQ", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "PRINT", "PLUS", 
			"MINUS", "MULT", "DIVID", "MOD", "LPAREN", "RPAREN", "LSQBRACK", "RSQBRACK", 
			"COMMA", "NUM", "MATRIX", "VECTOR", "STRING", "ID", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6"+
		"\34\u008f\n\34\r\34\16\34\u0090\3\34\3\34\6\34\u0095\n\34\r\34\16\34\u0096"+
		"\5\34\u0099\n\34\3\35\3\35\7\35\u009d\n\35\f\35\16\35\u00a0\13\35\3\35"+
		"\3\35\5\35\u00a4\n\35\3\35\7\35\u00a7\n\35\f\35\16\35\u00aa\13\35\3\35"+
		"\3\35\7\35\u00ae\n\35\f\35\16\35\u00b1\13\35\3\35\3\35\5\35\u00b5\n\35"+
		"\6\35\u00b7\n\35\r\35\16\35\u00b8\3\35\7\35\u00bc\n\35\f\35\16\35\u00bf"+
		"\13\35\3\35\3\35\7\35\u00c3\n\35\f\35\16\35\u00c6\13\35\3\35\3\35\5\35"+
		"\u00ca\n\35\3\35\7\35\u00cd\n\35\f\35\16\35\u00d0\13\35\3\35\3\35\7\35"+
		"\u00d4\n\35\f\35\16\35\u00d7\13\35\3\35\3\35\5\35\u00db\n\35\6\35\u00dd"+
		"\n\35\r\35\16\35\u00de\3\35\7\35\u00e2\n\35\f\35\16\35\u00e5\13\35\6\35"+
		"\u00e7\n\35\r\35\16\35\u00e8\3\35\7\35\u00ec\n\35\f\35\16\35\u00ef\13"+
		"\35\3\35\3\35\3\36\3\36\7\36\u00f5\n\36\f\36\16\36\u00f8\13\36\3\36\3"+
		"\36\5\36\u00fc\n\36\3\36\7\36\u00ff\n\36\f\36\16\36\u0102\13\36\3\36\3"+
		"\36\7\36\u0106\n\36\f\36\16\36\u0109\13\36\3\36\3\36\5\36\u010d\n\36\3"+
		"\36\7\36\u0110\n\36\f\36\16\36\u0113\13\36\7\36\u0115\n\36\f\36\16\36"+
		"\u0118\13\36\3\36\7\36\u011b\n\36\f\36\16\36\u011e\13\36\3\36\3\36\3\37"+
		"\3\37\7\37\u0124\n\37\f\37\16\37\u0127\13\37\3\37\3\37\3 \7 \u012c\n "+
		"\f \16 \u012f\13 \3 \3 \7 \u0133\n \f \16 \u0136\13 \3!\6!\u0139\n!\r"+
		"!\16!\u013a\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"\3\2\7\3\2\62;\7\2\"\"\62;C\\aac|\5\2\62"+
		";C\\c|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\r"+
		"M\3\2\2\2\17P\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2\2"+
		"\31a\3\2\2\2\33f\3\2\2\2\35j\3\2\2\2\37p\3\2\2\2!s\3\2\2\2#y\3\2\2\2%"+
		"{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0085"+
		"\3\2\2\2\61\u0087\3\2\2\2\63\u0089\3\2\2\2\65\u008b\3\2\2\2\67\u008e\3"+
		"\2\2\29\u009a\3\2\2\2;\u00f2\3\2\2\2=\u0121\3\2\2\2?\u012d\3\2\2\2A\u0138"+
		"\3\2\2\2CD\7&\2\2D\4\3\2\2\2EF\7=\2\2F\6\3\2\2\2GH\7?\2\2H\b\3\2\2\2I"+
		"J\7>\2\2J\n\3\2\2\2KL\7@\2\2L\f\3\2\2\2MN\7?\2\2NO\7?\2\2O\16\3\2\2\2"+
		"PQ\7#\2\2QR\7?\2\2R\20\3\2\2\2ST\7>\2\2TU\7?\2\2U\22\3\2\2\2VW\7@\2\2"+
		"WX\7?\2\2X\24\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\26\3\2\2\2\\]\7v\2\2]^\7j\2\2"+
		"^_\7g\2\2_`\7p\2\2`\30\3\2\2\2ab\7g\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\32"+
		"\3\2\2\2fg\7g\2\2gh\7p\2\2hi\7f\2\2i\34\3\2\2\2jk\7y\2\2kl\7j\2\2lm\7"+
		"k\2\2mn\7n\2\2no\7g\2\2o\36\3\2\2\2pq\7f\2\2qr\7q\2\2r \3\2\2\2st\7r\2"+
		"\2tu\7t\2\2uv\7k\2\2vw\7p\2\2wx\7v\2\2x\"\3\2\2\2yz\7-\2\2z$\3\2\2\2{"+
		"|\7/\2\2|&\3\2\2\2}~\7,\2\2~(\3\2\2\2\177\u0080\7\61\2\2\u0080*\3\2\2"+
		"\2\u0081\u0082\7\'\2\2\u0082,\3\2\2\2\u0083\u0084\7*\2\2\u0084.\3\2\2"+
		"\2\u0085\u0086\7+\2\2\u0086\60\3\2\2\2\u0087\u0088\7]\2\2\u0088\62\3\2"+
		"\2\2\u0089\u008a\7_\2\2\u008a\64\3\2\2\2\u008b\u008c\7.\2\2\u008c\66\3"+
		"\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0098\3\2\2\2\u0092\u0094\7\60"+
		"\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u00998\3\2\2\2\u009a\u009e\7}\2\2\u009b\u009d"+
		"\5A!\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\5\67"+
		"\34\2\u00a2\u00a4\5? \2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a8\3\2\2\2\u00a5\u00a7\5A!\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b6\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00af\7.\2\2\u00ac\u00ae\5A!\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\5\67\34\2\u00b3\u00b5\5? \2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ab\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bd\3\2\2\2\u00ba\u00bc\5A!\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00e6\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c4\7=\2\2\u00c1\u00c3\5A!\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c9\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\5\67\34\2\u00c8\u00ca\5? \2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\5A"+
		"!\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00dc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7."+
		"\2\2\u00d2\u00d4\5A!\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\5\67\34\2\u00d9\u00db\5? \2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\5A"+
		"!\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00c0\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ed\3\2\2\2\u00ea\u00ec\5A!\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f1\7\177\2\2\u00f1:\3\2\2\2\u00f2\u00f6\7>\2\2\u00f3"+
		"\u00f5\5A!\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2"+
		"\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc"+
		"\5\67\34\2\u00fa\u00fc\5? \2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u0100\3\2\2\2\u00fd\u00ff\5A!\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0116\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0107\7.\2\2\u0104\u0106\5A!\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010d\5\67\34\2\u010b\u010d\5? \2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u0110\5A"+
		"!\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0103\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011c\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\5A!\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7@\2\2\u0120<\3\2\2\2\u0121\u0125"+
		"\7$\2\2\u0122\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\7$\2\2\u0129>\3\2\2\2\u012a\u012c\t\4\2\2\u012b\u012a"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\t\5\2\2\u0131\u0133\t\4"+
		"\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135@\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\t\6\2\2"+
		"\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b!\2\2\u013dB\3\2\2\2\"\2\u0090"+
		"\u0096\u0098\u009e\u00a3\u00a8\u00af\u00b4\u00b8\u00bd\u00c4\u00c9\u00ce"+
		"\u00d5\u00da\u00de\u00e3\u00e8\u00ed\u00f6\u00fb\u0100\u0107\u010c\u0111"+
		"\u0116\u011c\u0125\u012d\u0134\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}