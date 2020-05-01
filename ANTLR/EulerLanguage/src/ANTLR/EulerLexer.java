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
		IF=10, THEN=11, ELSE=12, END=13, WHILE=14, DO=15, NUMKW=16, VECKW=17, 
		MTXKW=18, PRINT=19, PLUS=20, MINUS=21, MULT=22, DIVID=23, MOD=24, LPAREN=25, 
		RPAREN=26, LSQBRACK=27, RSQBRACK=28, COMMA=29, NUM=30, MATRIX=31, VECTOR=32, 
		STRING=33, ID=34, WHITESPACE=35, COMMENT1=36, COMMENT2=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", "BTEQ", 
			"IF", "THEN", "ELSE", "END", "WHILE", "DO", "NUMKW", "VECKW", "MTXKW", 
			"PRINT", "PLUS", "MINUS", "MULT", "DIVID", "MOD", "LPAREN", "RPAREN", 
			"LSQBRACK", "RSQBRACK", "COMMA", "NUM", "MATRIX", "VECTOR", "STRING", 
			"ID", "WHITESPACE", "COMMENT1", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", 
			"'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'number'", "'vec'", 
			"'mtx'", "'print'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", 
			"'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", 
			"BTEQ", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "NUMKW", "VECKW", 
			"MTXKW", "PRINT", "PLUS", "MINUS", "MULT", "DIVID", "MOD", "LPAREN", 
			"RPAREN", "LSQBRACK", "RSQBRACK", "COMMA", "NUM", "MATRIX", "VECTOR", 
			"STRING", "ID", "WHITESPACE", "COMMENT1", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00a8\n\37\r\37\16\37\u00a9\3"+
		"\37\3\37\6\37\u00ae\n\37\r\37\16\37\u00af\5\37\u00b2\n\37\3 \3 \7 \u00b6"+
		"\n \f \16 \u00b9\13 \3 \3 \5 \u00bd\n \3 \7 \u00c0\n \f \16 \u00c3\13"+
		" \3 \3 \7 \u00c7\n \f \16 \u00ca\13 \3 \3 \5 \u00ce\n \7 \u00d0\n \f "+
		"\16 \u00d3\13 \3 \7 \u00d6\n \f \16 \u00d9\13 \3 \3 \7 \u00dd\n \f \16"+
		" \u00e0\13 \3 \3 \5 \u00e4\n \3 \7 \u00e7\n \f \16 \u00ea\13 \3 \3 \7"+
		" \u00ee\n \f \16 \u00f1\13 \3 \3 \5 \u00f5\n \7 \u00f7\n \f \16 \u00fa"+
		"\13 \3 \7 \u00fd\n \f \16 \u0100\13 \7 \u0102\n \f \16 \u0105\13 \3 \7"+
		" \u0108\n \f \16 \u010b\13 \3 \3 \3!\3!\7!\u0111\n!\f!\16!\u0114\13!\3"+
		"!\3!\5!\u0118\n!\3!\7!\u011b\n!\f!\16!\u011e\13!\3!\3!\7!\u0122\n!\f!"+
		"\16!\u0125\13!\3!\3!\5!\u0129\n!\3!\7!\u012c\n!\f!\16!\u012f\13!\7!\u0131"+
		"\n!\f!\16!\u0134\13!\3!\7!\u0137\n!\f!\16!\u013a\13!\3!\3!\3\"\3\"\7\""+
		"\u0140\n\"\f\"\16\"\u0143\13\"\3\"\3\"\3#\7#\u0148\n#\f#\16#\u014b\13"+
		"#\3#\3#\7#\u014f\n#\f#\16#\u0152\13#\3$\6$\u0155\n$\r$\16$\u0156\3$\3"+
		"$\3%\3%\3%\3%\7%\u015f\n%\f%\16%\u0162\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\7&\u016d\n&\f&\16&\u0170\13&\3&\3&\3\u0160\2\'\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2"+
		"\b\3\2\62;\7\2\"\"\62<C\\aac|\5\2\62;C\\c|\4\2C\\c|\5\2\13\f\17\17\"\""+
		"\4\2\f\f\17\17\2\u0193\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7"+
		"Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21]\3\2\2\2\23"+
		"`\3\2\2\2\25c\3\2\2\2\27f\3\2\2\2\31k\3\2\2\2\33p\3\2\2\2\35t\3\2\2\2"+
		"\37z\3\2\2\2!}\3\2\2\2#\u0084\3\2\2\2%\u0088\3\2\2\2\'\u008c\3\2\2\2)"+
		"\u0092\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u0098\3\2\2\2\61\u009a\3"+
		"\2\2\2\63\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a0\3\2\2\29\u00a2\3\2\2"+
		"\2;\u00a4\3\2\2\2=\u00a7\3\2\2\2?\u00b3\3\2\2\2A\u010e\3\2\2\2C\u013d"+
		"\3\2\2\2E\u0149\3\2\2\2G\u0154\3\2\2\2I\u015a\3\2\2\2K\u0168\3\2\2\2M"+
		"N\7&\2\2N\4\3\2\2\2OP\7=\2\2P\6\3\2\2\2QR\7?\2\2R\b\3\2\2\2ST\7>\2\2T"+
		"\n\3\2\2\2UV\7@\2\2V\f\3\2\2\2WX\7?\2\2XY\7?\2\2Y\16\3\2\2\2Z[\7#\2\2"+
		"[\\\7?\2\2\\\20\3\2\2\2]^\7>\2\2^_\7?\2\2_\22\3\2\2\2`a\7@\2\2ab\7?\2"+
		"\2b\24\3\2\2\2cd\7k\2\2de\7h\2\2e\26\3\2\2\2fg\7v\2\2gh\7j\2\2hi\7g\2"+
		"\2ij\7p\2\2j\30\3\2\2\2kl\7g\2\2lm\7n\2\2mn\7u\2\2no\7g\2\2o\32\3\2\2"+
		"\2pq\7g\2\2qr\7p\2\2rs\7f\2\2s\34\3\2\2\2tu\7y\2\2uv\7j\2\2vw\7k\2\2w"+
		"x\7n\2\2xy\7g\2\2y\36\3\2\2\2z{\7f\2\2{|\7q\2\2| \3\2\2\2}~\7p\2\2~\177"+
		"\7w\2\2\177\u0080\7o\2\2\u0080\u0081\7d\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7t\2\2\u0083\"\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7e\2\2\u0087$\3\2\2\2\u0088\u0089\7o\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7z\2\2\u008b&\3\2\2\2\u008c\u008d\7r\2\2\u008d\u008e\7t\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7-\2\2\u0093*\3\2\2\2\u0094\u0095\7/\2\2\u0095,\3\2\2\2\u0096\u0097\7"+
		",\2\2\u0097.\3\2\2\2\u0098\u0099\7\61\2\2\u0099\60\3\2\2\2\u009a\u009b"+
		"\7\'\2\2\u009b\62\3\2\2\2\u009c\u009d\7*\2\2\u009d\64\3\2\2\2\u009e\u009f"+
		"\7+\2\2\u009f\66\3\2\2\2\u00a0\u00a1\7]\2\2\u00a18\3\2\2\2\u00a2\u00a3"+
		"\7_\2\2\u00a3:\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5<\3\2\2\2\u00a6\u00a8\t"+
		"\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ad\7\60\2\2\u00ac\u00ae\t"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2>\3\2\2\2\u00b3\u00b7\7}\2\2\u00b4\u00b6\5G$\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bc\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\5=\37\2\u00bb\u00bd\5E"+
		"#\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be"+
		"\u00c0\5G$\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00d1\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8"+
		"\7.\2\2\u00c5\u00c7\5G$\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00ce\5=\37\2\u00cc\u00ce\5E#\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c4\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d6\5G$\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u0103\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00de\7=\2\2\u00db\u00dd\5G$\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e4\5=\37\2\u00e2\u00e4\5E#\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\5G$\2\u00e6\u00e5\3\2\2"+
		"\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f8"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\7.\2\2\u00ec\u00ee\5G$\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\5=\37\2\u00f3"+
		"\u00f5\5E#\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f7\3\2\2"+
		"\2\u00f6\u00eb\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fe\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\5G$\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00da\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0109\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5G$\2\u0107\u0106\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010d\7\177\2\2\u010d@\3\2\2\2\u010e\u0112\7>\2\2"+
		"\u010f\u0111\5G$\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0117\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0118\5=\37\2\u0116\u0118\5E#\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2"+
		"\2\u0118\u011c\3\2\2\2\u0119\u011b\5G$\2\u011a\u0119\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0132\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0123\7.\2\2\u0120\u0122\5G$\2\u0121\u0120\3\2\2"+
		"\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0129\5=\37\2\u0127\u0129\5E#\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012d\3\2\2\2\u012a\u012c\5G"+
		"$\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u011f\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0138\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\5G$\2\u0136\u0135\3\2\2"+
		"\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7@\2\2\u013cB\3\2\2\2\u013d\u0141"+
		"\7$\2\2\u013e\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0145\7$\2\2\u0145D\3\2\2\2\u0146\u0148\t\4\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0150\t\5\2\2\u014d\u014f\t\4"+
		"\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151F\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\t\6\2\2"+
		"\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b$\2\2\u0159H\3\2\2\2\u015a\u015b"+
		"\7\61\2\2\u015b\u015c\7,\2\2\u015c\u0160\3\2\2\2\u015d\u015f\13\2\2\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7,\2\2\u0164"+
		"\u0165\7\61\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b%\2\2\u0167J\3\2\2\2"+
		"\u0168\u0169\7\61\2\2\u0169\u016a\7\61\2\2\u016a\u016e\3\2\2\2\u016b\u016d"+
		"\n\7\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\b&"+
		"\2\2\u0172L\3\2\2\2$\2\u00a9\u00af\u00b1\u00b7\u00bc\u00c1\u00c8\u00cd"+
		"\u00d1\u00d7\u00de\u00e3\u00e8\u00ef\u00f4\u00f8\u00fe\u0103\u0109\u0112"+
		"\u0117\u011c\u0123\u0128\u012d\u0132\u0138\u0141\u0149\u0150\u0156\u0160"+
		"\u016e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}