// Generated from C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/Grammar\Euler.g4 by ANTLR 4.8
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
		IF=10, THEN=11, ELSE=12, END=13, WHILE=14, DO=15, PRINT=16, NEWLINE=17, 
		WHITESPACE=18, PLUS=19, MINUS=20, MULT=21, DIVID=22, MOD=23, LPAREN=24, 
		RPAREN=25, LSQBRACK=26, RSQBRACK=27, COMMA=28, NUMB=29, VEC=30, MTX=31, 
		NUM=32, MATRIX=33, VECTOR=34, STRING=35, ID=36;
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
			"'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'print'", null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", 
			"','", "'num'", "'vec'", "'mtx'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", 
			"BTEQ", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "PRINT", "NEWLINE", 
			"WHITESPACE", "PLUS", "MINUS", "MULT", "DIVID", "MOD", "LPAREN", "RPAREN", 
			"LSQBRACK", "RSQBRACK", "COMMA", "NUMB", "VEC", "MTX", "NUM", "MATRIX", 
			"VECTOR", "STRING", "ID"
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
		public TerminalNode DOLLAR() { return getToken(EulerParser.DOLLAR, 0); }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0)) {
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
			setState(44);
			match(DOLLAR);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				expr();
				setState(47);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				dcl();
				setState(50);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				whilestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				assignstmt();
				setState(55);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				printstmt();
				setState(58);
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
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
	 
		public DclContext() { }
		public void copyFrom(DclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VecAssignContext extends DclContext {
		public TerminalNode VEC() { return getToken(EulerParser.VEC, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public TerminalNode VECTOR() { return getToken(EulerParser.VECTOR, 0); }
		public VecAssignContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterVecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitVecAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitVecAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAssignContext extends DclContext {
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdAssignContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterIdAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitIdAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitIdAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdInitContext extends DclContext {
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public IdInitContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterIdInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitIdInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitIdInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MtxAssignContext extends DclContext {
		public TerminalNode MTX() { return getToken(EulerParser.MTX, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public TerminalNode MATRIX() { return getToken(EulerParser.MATRIX, 0); }
		public MtxAssignContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterMtxAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitMtxAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitMtxAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(NUM);
				setState(63);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IdAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(NUM);
				setState(65);
				match(ID);
				setState(66);
				match(ASSIGN);
				setState(67);
				expr();
				}
				break;
			case 3:
				_localctx = new VecAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(VEC);
				setState(69);
				match(ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				match(VECTOR);
				}
				break;
			case 4:
				_localctx = new MtxAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(MTX);
				setState(73);
				match(ID);
				setState(74);
				match(ASSIGN);
				setState(75);
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
			setState(78);
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
		public ElsestmtsContext elsestmts() {
			return getRuleContext(ElsestmtsContext.class,0);
		}
		public TerminalNode END() { return getToken(EulerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
			setState(80);
			match(IF);
			setState(81);
			logstmt();
			setState(82);
			match(THEN);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				stmt();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
			setState(88);
			elsestmts();
			setState(89);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						elseifstmts();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(97);
				match(ELSE);
				setState(98);
				match(THEN);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					stmt();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					elseifstmts();
					}
					}
					setState(107); 
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
			setState(111);
			match(ELSE);
			setState(112);
			match(IF);
			setState(113);
			logstmt();
			setState(114);
			match(THEN);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				stmt();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
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
			setState(120);
			match(PRINT);
			setState(121);
			stringstmt();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(122);
				match(PLUS);
				setState(123);
				stringstmt();
				}
				}
				setState(128);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(STRING);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(132);
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
		public TerminalNode COMMA() { return getToken(EulerParser.COMMA, 0); }
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
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LSQBRACK);
				setState(138);
				match(NUM);
				setState(139);
				match(RSQBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(LSQBRACK);
				setState(141);
				match(NUM);
				setState(142);
				match(COMMA);
				setState(143);
				match(NUM);
				setState(144);
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
			setState(147);
			match(WHILE);
			setState(148);
			logstmt();
			setState(149);
			match(DO);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				stmt();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
			setState(155);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(158);
				valindex();
				}
			}

			setState(161);
			match(ASSIGN);
			setState(162);
			expr();
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
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public AriopContext ariop() {
			return getRuleContext(AriopContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
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
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				multiexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				multiexpr();
				setState(166);
				ariop();
				setState(167);
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
		public PrimeexprContext primeexpr() {
			return getRuleContext(PrimeexprContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
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
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				primeexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				primeexpr();
				setState(173);
				mulop();
				setState(174);
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(179);
					valindex();
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(LPAREN);
				setState(184);
				addexpr();
				setState(185);
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
			setState(189);
			addexpr();
			setState(190);
			logop();
			setState(191);
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
			setState(193);
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
			setState(195);
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
			setState(197);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\6\6W\n\6\r\6\16\6X\3\6\3\6\3\6\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7\3\7"+
		"\3\7\6\7g\n\7\r\7\16\7h\3\7\6\7l\n\7\r\7\16\7m\5\7p\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\6\bw\n\b\r\b\16\bx\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13"+
		"\t\3\n\3\n\3\n\3\n\5\n\u0088\n\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\6\f\u009a\n\f\r\f\16\f"+
		"\u009b\3\f\3\f\3\r\3\r\5\r\u00a2\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00ac\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\20\3\20"+
		"\5\20\u00b7\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00be\n\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\5\3\2\6\13\3\2\25\26\3\2\27\31\2\u00d1\2+\3"+
		"\2\2\2\4>\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fo\3\2\2\2\16q\3\2"+
		"\2\2\20z\3\2\2\2\22\u0089\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30"+
		"\u009f\3\2\2\2\32\u00ab\3\2\2\2\34\u00b2\3\2\2\2\36\u00bd\3\2\2\2 \u00bf"+
		"\3\2\2\2\"\u00c3\3\2\2\2$\u00c5\3\2\2\2&\u00c7\3\2\2\2(*\5\4\3\2)(\3\2"+
		"\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\3\2\2/\3\3"+
		"\2\2\2\60\61\5\b\5\2\61\62\7\4\2\2\62?\3\2\2\2\63\64\5\6\4\2\64\65\7\4"+
		"\2\2\65?\3\2\2\2\66?\5\n\6\2\67?\5\26\f\289\5\30\r\29:\7\4\2\2:?\3\2\2"+
		"\2;<\5\20\t\2<=\7\4\2\2=?\3\2\2\2>\60\3\2\2\2>\63\3\2\2\2>\66\3\2\2\2"+
		">\67\3\2\2\2>8\3\2\2\2>;\3\2\2\2?\5\3\2\2\2@A\7\"\2\2AO\7&\2\2BC\7\"\2"+
		"\2CD\7&\2\2DE\7\5\2\2EO\5\b\5\2FG\7 \2\2GH\7&\2\2HI\7\5\2\2IO\7$\2\2J"+
		"K\7!\2\2KL\7&\2\2LM\7\5\2\2MO\7#\2\2N@\3\2\2\2NB\3\2\2\2NF\3\2\2\2NJ\3"+
		"\2\2\2O\7\3\2\2\2PQ\5\32\16\2Q\t\3\2\2\2RS\7\f\2\2ST\5 \21\2TV\7\r\2\2"+
		"UW\5\4\3\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\f\7\2"+
		"[\\\7\17\2\2\\\13\3\2\2\2]_\5\16\b\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\16\2\2df\7\r\2\2eg\5\4\3\2fe\3\2\2\2gh"+
		"\3\2\2\2hf\3\2\2\2hi\3\2\2\2ip\3\2\2\2jl\5\16\b\2kj\3\2\2\2lm\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2np\3\2\2\2o`\3\2\2\2ok\3\2\2\2p\r\3\2\2\2qr\7\16\2"+
		"\2rs\7\f\2\2st\5 \21\2tv\7\r\2\2uw\5\4\3\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y\17\3\2\2\2z{\7\22\2\2{\u0080\5\22\n\2|}\7\25\2\2}\177\5"+
		"\22\n\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\21\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u008a\7%\2\2\u0084\u008a\7"+
		"\"\2\2\u0085\u0087\7&\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2"+
		"\2\2\u0089\u0085\3\2\2\2\u008a\23\3\2\2\2\u008b\u008c\7\34\2\2\u008c\u008d"+
		"\7\"\2\2\u008d\u0094\7\35\2\2\u008e\u008f\7\34\2\2\u008f\u0090\7\"\2\2"+
		"\u0090\u0091\7\36\2\2\u0091\u0092\7\"\2\2\u0092\u0094\7\35\2\2\u0093\u008b"+
		"\3\2\2\2\u0093\u008e\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\20\2\2\u0096"+
		"\u0097\5 \21\2\u0097\u0099\7\21\2\2\u0098\u009a\5\4\3\2\u0099\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7\17\2\2\u009e\27\3\2\2\2\u009f\u00a1\7&\2"+
		"\2\u00a0\u00a2\5\24\13\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5\5\b\5\2\u00a5\31\3\2\2"+
		"\2\u00a6\u00ac\5\34\17\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\5$\23\2\u00a9"+
		"\u00aa\5\32\16\2\u00aa\u00ac\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3"+
		"\2\2\2\u00ac\33\3\2\2\2\u00ad\u00b3\5\36\20\2\u00ae\u00af\5\36\20\2\u00af"+
		"\u00b0\5&\24\2\u00b0\u00b1\5\34\17\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3"+
		"\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b6\7&\2\2\u00b5\u00b7"+
		"\5\24\13\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00be\3\2\2\2"+
		"\u00b8\u00be\7\"\2\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb\5\32\16\2\u00bb"+
		"\u00bc\7\33\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b8\3"+
		"\2\2\2\u00bd\u00b9\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00c0\5\32\16\2\u00c0"+
		"\u00c1\5\"\22\2\u00c1\u00c2\5\32\16\2\u00c2!\3\2\2\2\u00c3\u00c4\t\2\2"+
		"\2\u00c4#\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6%\3\2\2\2\u00c7\u00c8\t\4\2"+
		"\2\u00c8\'\3\2\2\2\25+>NX`hmox\u0080\u0087\u0089\u0093\u009b\u00a1\u00ab"+
		"\u00b2\u00b6\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}