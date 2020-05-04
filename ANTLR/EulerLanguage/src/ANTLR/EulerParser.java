// Generated from C:/Users/theml/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/Grammar\Euler.g4 by ANTLR 4.8
package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EulerParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_dcl = 2, RULE_expr = 3, RULE_ifstmt = 4, 
		RULE_elsestmts = 5, RULE_elseifstmts = 6, RULE_printstmt = 7, RULE_stringstmt = 8, 
		RULE_valindex = 9, RULE_whilestmt = 10, RULE_assignstmt = 11, RULE_addexpr = 12, 
		RULE_multiexpr = 13, RULE_primeexpr = 14, RULE_logstmt = 15, RULE_logop = 16, 
		RULE_ariop = 17, RULE_mulop = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "dcl", "expr", "ifstmt", "elsestmts", "elseifstmts", 
			"printstmt", "stringstmt", "valindex", "whilestmt", "assignstmt", "addexpr", 
			"multiexpr", "primeexpr", "logstmt", "logop", "ariop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", 
			"'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'num'", "'vec'", 
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

	@Override
	public String getGrammarFileName() { return "Euler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EulerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				stmt();
				}
				}
				setState(43);
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EulerParser.SEMI, 0); }
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				expr();
				setState(45);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				dcl();
				setState(48);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				whilestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				assignstmt();
				setState(53);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				printstmt();
				setState(56);
				match(SEMI);
				}
				break;
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

	public static class DclContext extends ParserRuleContext {
		public TerminalNode NUMKW() { return getToken(EulerParser.NUMKW, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VECKW() { return getToken(EulerParser.VECKW, 0); }
		public TerminalNode VECTOR() { return getToken(EulerParser.VECTOR, 0); }
		public TerminalNode MTXKW() { return getToken(EulerParser.MTXKW, 0); }
		public TerminalNode MATRIX() { return getToken(EulerParser.MATRIX, 0); }
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(NUMKW);
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				expr();
				}
				break;
			case VECKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(VECKW);
				setState(65);
				match(ID);
				setState(66);
				match(ASSIGN);
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VECTOR:
					{
					setState(67);
					match(VECTOR);
					}
					break;
				case LPAREN:
				case NUM:
				case ID:
					{
					setState(68);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case MTXKW:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(MTXKW);
				setState(72);
				match(ID);
				setState(73);
				match(ASSIGN);
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MATRIX:
					{
					setState(74);
					match(MATRIX);
					}
					break;
				case LPAREN:
				case NUM:
				case ID:
					{
					setState(75);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ExprContext extends ParserRuleContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			addexpr();
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EulerParser.IF, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
		public TerminalNode END() { return getToken(EulerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElsestmtsContext elsestmts() {
			return getRuleContext(ElsestmtsContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			logstmt();
			setState(84);
			match(THEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(85);
				stmt();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(91);
				elsestmts();
				}
			}

			setState(94);
			match(END);
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

	public static class ElsestmtsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EulerParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
		public List<ElseifstmtsContext> elseifstmts() {
			return getRuleContexts(ElseifstmtsContext.class);
		}
		public ElseifstmtsContext elseifstmts(int i) {
			return getRuleContext(ElseifstmtsContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElsestmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterElsestmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitElsestmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitElsestmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestmtsContext elsestmts() throws RecognitionException {
		ElsestmtsContext _localctx = new ElsestmtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsestmts);
		int _la;
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						elseifstmts();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(102);
				match(ELSE);
				setState(103);
				match(THEN);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					{
					setState(104);
					stmt();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					elseifstmts();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELSE );
				}
				break;
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

	public static class ElseifstmtsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EulerParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(EulerParser.IF, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseifstmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterElseifstmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitElseifstmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitElseifstmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstmtsContext elseifstmts() throws RecognitionException {
		ElseifstmtsContext _localctx = new ElseifstmtsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseifstmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ELSE);
			setState(118);
			match(IF);
			setState(119);
			logstmt();
			setState(120);
			match(THEN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(121);
				stmt();
				}
				}
				setState(126);
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EulerParser.PRINT, 0); }
		public List<StringstmtContext> stringstmt() {
			return getRuleContexts(StringstmtContext.class);
		}
		public StringstmtContext stringstmt(int i) {
			return getRuleContext(StringstmtContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(EulerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(EulerParser.PLUS, i);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitPrintstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PRINT);
			setState(128);
			stringstmt();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(129);
				match(PLUS);
				setState(130);
				stringstmt();
				}
				}
				setState(135);
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

	public static class StringstmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EulerParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public StringstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterStringstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitStringstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitStringstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringstmtContext stringstmt() throws RecognitionException {
		StringstmtContext _localctx = new StringstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringstmt);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(STRING);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(139);
					valindex();
					}
				}

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

	public static class ValindexContext extends ParserRuleContext {
		public TerminalNode LSQBRACK() { return getToken(EulerParser.LSQBRACK, 0); }
		public List<TerminalNode> NUM() { return getTokens(EulerParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(EulerParser.NUM, i);
		}
		public TerminalNode RSQBRACK() { return getToken(EulerParser.RSQBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EulerParser.COMMA, i);
		}
		public ValindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterValindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitValindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitValindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValindexContext valindex() throws RecognitionException {
		ValindexContext _localctx = new ValindexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valindex);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(LSQBRACK);
				setState(145);
				match(NUM);
				setState(146);
				match(RSQBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LSQBRACK);
				setState(148);
				match(NUM);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					match(NUM);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(RSQBRACK);
				}
				break;
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

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EulerParser.WHILE, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode DO() { return getToken(EulerParser.DO, 0); }
		public TerminalNode END() { return getToken(EulerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(WHILE);
			setState(160);
			logstmt();
			setState(161);
			match(DO);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(162);
				stmt();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(END);
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

	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode VECTOR() { return getToken(EulerParser.VECTOR, 0); }
		public TerminalNode MATRIX() { return getToken(EulerParser.MATRIX, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignstmt);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(171);
					valindex();
					}
				}

				setState(174);
				match(ASSIGN);
				setState(175);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(ID);
				setState(177);
				match(ASSIGN);
				setState(178);
				match(VECTOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(ID);
				setState(180);
				match(ASSIGN);
				setState(181);
				match(MATRIX);
				}
				break;
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

	public static class AddexprContext extends ParserRuleContext {
		public Token op;
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(EulerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EulerParser.MINUS, 0); }
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitAddexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addexpr);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				multiexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				multiexpr();
				setState(186);
				((AddexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((AddexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				addexpr();
				}
				break;
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

	public static class MultiexprContext extends ParserRuleContext {
		public Token op;
		public PrimeexprContext primeexpr() {
			return getRuleContext(PrimeexprContext.class,0);
		}
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public TerminalNode MULT() { return getToken(EulerParser.MULT, 0); }
		public TerminalNode DIVID() { return getToken(EulerParser.DIVID, 0); }
		public TerminalNode MOD() { return getToken(EulerParser.MOD, 0); }
		public MultiexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterMultiexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitMultiexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitMultiexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiexprContext multiexpr() throws RecognitionException {
		MultiexprContext _localctx = new MultiexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiexpr);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				primeexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				primeexpr();
				setState(193);
				((MultiexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVID) | (1L << MOD))) != 0)) ) {
					((MultiexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				multiexpr();
				}
				break;
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

	public static class PrimeexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode LPAREN() { return getToken(EulerParser.LPAREN, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EulerParser.RPAREN, 0); }
		public PrimeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterPrimeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitPrimeexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitPrimeexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeexprContext primeexpr() throws RecognitionException {
		PrimeexprContext _localctx = new PrimeexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primeexpr);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(199);
					valindex();
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(LPAREN);
				setState(204);
				addexpr();
				setState(205);
				match(RPAREN);
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

	public static class LogstmtContext extends ParserRuleContext {
		public List<AddexprContext> addexpr() {
			return getRuleContexts(AddexprContext.class);
		}
		public AddexprContext addexpr(int i) {
			return getRuleContext(AddexprContext.class,i);
		}
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public LogstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterLogstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitLogstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitLogstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogstmtContext logstmt() throws RecognitionException {
		LogstmtContext _localctx = new LogstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			addexpr();
			setState(210);
			logop();
			setState(211);
			addexpr();
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

	public static class LogopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode EQEQ() { return getToken(EulerParser.EQEQ, 0); }
		public TerminalNode BT() { return getToken(EulerParser.BT, 0); }
		public TerminalNode LT() { return getToken(EulerParser.LT, 0); }
		public TerminalNode BTEQ() { return getToken(EulerParser.BTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(EulerParser.LTEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(EulerParser.NOTEQ, 0); }
		public LogopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterLogop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitLogop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitLogop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			((LogopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << BT) | (1L << EQEQ) | (1L << NOTEQ) | (1L << LTEQ) | (1L << BTEQ))) != 0)) ) {
				((LogopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AriopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(EulerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EulerParser.MINUS, 0); }
		public AriopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ariop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterAriop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitAriop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitAriop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AriopContext ariop() throws RecognitionException {
		AriopContext _localctx = new AriopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ariop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((AriopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((AriopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MulopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode MULT() { return getToken(EulerParser.MULT, 0); }
		public TerminalNode DIVID() { return getToken(EulerParser.DIVID, 0); }
		public TerminalNode MOD() { return getToken(EulerParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((MulopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVID) | (1L << MOD))) != 0)) ) {
				((MulopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\5\4Q\n\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\5\6_\n\6\3\6\3\6\3\7\7\7d\n"+
		"\7\f\7\16\7g\13\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\6\7r\n\7\r\7"+
		"\16\7s\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3\t\3"+
		"\t\3\t\3\t\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\n\3\n\3\n\3\n\5\n\u008f"+
		"\n\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009a\n\13"+
		"\f\13\16\13\u009d\13\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\f\3\f\7\f\u00a6"+
		"\n\f\f\f\16\f\u00a9\13\f\3\f\3\f\3\r\3\r\5\r\u00af\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00b9\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00c0\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\5\20\u00cb\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\5\3\2\26\27\3\2\30\32\3\2\6\13\2\u00ea\2+\3\2\2\2\4<\3\2\2\2\6"+
		"P\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2\20\u0081\3\2\2"+
		"\2\22\u0090\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00b8\3\2\2\2"+
		"\32\u00bf\3\2\2\2\34\u00c6\3\2\2\2\36\u00d1\3\2\2\2 \u00d3\3\2\2\2\"\u00d7"+
		"\3\2\2\2$\u00d9\3\2\2\2&\u00db\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2./\5\b\5\2/\60\7\4\2\2\60=\3\2"+
		"\2\2\61\62\5\6\4\2\62\63\7\4\2\2\63=\3\2\2\2\64=\5\n\6\2\65=\5\26\f\2"+
		"\66\67\5\30\r\2\678\7\4\2\28=\3\2\2\29:\5\20\t\2:;\7\4\2\2;=\3\2\2\2<"+
		".\3\2\2\2<\61\3\2\2\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=\5"+
		"\3\2\2\2>?\7\22\2\2?@\7$\2\2@A\7\5\2\2AQ\5\b\5\2BC\7\23\2\2CD\7$\2\2D"+
		"G\7\5\2\2EH\7\"\2\2FH\5\b\5\2GE\3\2\2\2GF\3\2\2\2HQ\3\2\2\2IJ\7\24\2\2"+
		"JK\7$\2\2KN\7\5\2\2LO\7!\2\2MO\5\b\5\2NL\3\2\2\2NM\3\2\2\2OQ\3\2\2\2P"+
		">\3\2\2\2PB\3\2\2\2PI\3\2\2\2Q\7\3\2\2\2RS\5\32\16\2S\t\3\2\2\2TU\7\f"+
		"\2\2UV\5 \21\2VZ\7\r\2\2WY\5\4\3\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\5\f\7\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a"+
		"\7\17\2\2a\13\3\2\2\2bd\5\16\b\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2"+
		"\2fh\3\2\2\2ge\3\2\2\2hi\7\16\2\2im\7\r\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2nv\3\2\2\2om\3\2\2\2pr\5\16\b\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2ue\3\2\2\2uq\3\2\2\2v\r\3\2\2\2wx"+
		"\7\16\2\2xy\7\f\2\2yz\5 \21\2z~\7\r\2\2{}\5\4\3\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\17\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\7\25\2\2\u0082\u0087\5\22\n\2\u0083\u0084\7\26\2\2\u0084\u0086\5\22\n"+
		"\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\21\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0091\7#\2\2\u008b"+
		"\u0091\7 \2\2\u008c\u008e\7$\2\2\u008d\u008f\5\24\13\2\u008e\u008d\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\7\35\2"+
		"\2\u0093\u0094\7 \2\2\u0094\u00a0\7\36\2\2\u0095\u0096\7\35\2\2\u0096"+
		"\u009b\7 \2\2\u0097\u0098\7\37\2\2\u0098\u009a\7 \2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\7\36\2\2\u009f\u0092\3"+
		"\2\2\2\u009f\u0095\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2"+
		"\u00a3\5 \21\2\u00a3\u00a7\7\21\2\2\u00a4\u00a6\5\4\3\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\27\3\2\2"+
		"\2\u00ac\u00ae\7$\2\2\u00ad\u00af\5\24\13\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b9\5\b"+
		"\5\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b9\7\"\2\2\u00b5"+
		"\u00b6\7$\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b9\7!\2\2\u00b8\u00ac\3\2\2"+
		"\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00c0"+
		"\5\34\17\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\t\2\2\2\u00bd\u00be\5\32"+
		"\16\2\u00be\u00c0\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0"+
		"\33\3\2\2\2\u00c1\u00c7\5\36\20\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\t"+
		"\3\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00ca\7$\2\2\u00c9\u00cb\5\24\13"+
		"\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d2\3\2\2\2\u00cc\u00d2"+
		"\7 \2\2\u00cd\u00ce\7\33\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\7\34\2"+
		"\2\u00d0\u00d2\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd"+
		"\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\5\"\22\2\u00d5"+
		"\u00d6\5\32\16\2\u00d6!\3\2\2\2\u00d7\u00d8\t\4\2\2\u00d8#\3\2\2\2\u00d9"+
		"\u00da\t\2\2\2\u00da%\3\2\2\2\u00db\u00dc\t\3\2\2\u00dc\'\3\2\2\2\32+"+
		"<GNPZ^emsu~\u0087\u008e\u0090\u009b\u009f\u00a7\u00ae\u00b8\u00bf\u00c6"+
		"\u00ca\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}