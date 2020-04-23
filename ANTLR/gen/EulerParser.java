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
		RULE_program = 0, RULE_dcl = 1, RULE_stmt = 2, RULE_expr = 3, RULE_ifstmt = 4, 
		RULE_elsestmts = 5, RULE_elseifstmts = 6, RULE_printstmt = 7, RULE_stringstmt = 8, 
		RULE_appendsting = 9, RULE_valindex = 10, RULE_whilestmt = 11, RULE_assignstmt = 12, 
		RULE_addexpr = 13, RULE_multiexpr = 14, RULE_primeexpr = 15, RULE_logstmt = 16, 
		RULE_logop = 17, RULE_ariop = 18, RULE_mulop = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcl", "stmt", "expr", "ifstmt", "elsestmts", "elseifstmts", 
			"printstmt", "stringstmt", "appendsting", "valindex", "whilestmt", "assignstmt", 
			"addexpr", "multiexpr", "primeexpr", "logstmt", "logop", "ariop", "mulop"
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
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					dcl();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << NUMB) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				stmt();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		public TerminalNode SEMI() { return getToken(EulerParser.SEMI, 0); }
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
		public TerminalNode NUMB() { return getToken(EulerParser.NUMB, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EulerParser.SEMI, 0); }
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
		public TerminalNode NUMB() { return getToken(EulerParser.NUMB, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(EulerParser.SEMI, 0); }
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
		public TerminalNode SEMI() { return getToken(EulerParser.SEMI, 0); }
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
		enterRule(_localctx, 2, RULE_dcl);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(NUMB);
				setState(55);
				match(ID);
				setState(56);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new IdAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(NUMB);
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				expr();
				setState(61);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new VecAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(VEC);
				setState(64);
				match(ID);
				setState(65);
				match(ASSIGN);
				setState(66);
				match(VECTOR);
				setState(67);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new MtxAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(MTX);
				setState(69);
				match(ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				match(MATRIX);
				setState(72);
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
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				expr();
				setState(76);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				dcl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				whilestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				assignstmt();
				setState(82);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				printstmt();
				setState(85);
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
			setState(89);
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
			setState(91);
			match(IF);
			setState(92);
			logstmt();
			setState(93);
			match(THEN);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				stmt();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << NUMB) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
			setState(99);
			elsestmts();
			setState(100);
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
		public ElseifstmtsContext elseifstmts() {
			return getRuleContext(ElseifstmtsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(EulerParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				elseifstmts();
				setState(103);
				match(ELSE);
				setState(104);
				match(THEN);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					stmt();
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << NUMB) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				elseifstmts();
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
		public List<TerminalNode> ELSE() { return getTokens(EulerParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(EulerParser.ELSE, i);
		}
		public List<TerminalNode> IF() { return getTokens(EulerParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(EulerParser.IF, i);
		}
		public List<LogstmtContext> logstmt() {
			return getRuleContexts(LogstmtContext.class);
		}
		public LogstmtContext logstmt(int i) {
			return getRuleContext(LogstmtContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(EulerParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(EulerParser.THEN, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(ELSE);
					setState(114);
					match(IF);
					setState(115);
					logstmt();
					setState(116);
					match(THEN);
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(117);
						stmt();
						}
						}
						setState(120); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << NUMB) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public StringstmtContext stringstmt() {
			return getRuleContext(StringstmtContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PRINT);
			setState(128);
			stringstmt();
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
		public AppendstingContext appendsting() {
			return getRuleContext(AppendstingContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EulerParser.NEWLINE, 0); }
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(130);
					appendsting();
					}
					break;
				}
				setState(133);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(134);
					appendsting();
					}
					break;
				}
				setState(137);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(138);
					appendsting();
					}
					break;
				}
				setState(141);
				match(ID);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(142);
					valindex();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(145);
					appendsting();
					}
					break;
				}
				setState(148);
				match(NEWLINE);
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

	public static class AppendstingContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EulerParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(EulerParser.PLUS, 0); }
		public AppendstingContext appendsting() {
			return getRuleContext(AppendstingContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EulerParser.NEWLINE, 0); }
		public AppendstingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendsting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterAppendsting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitAppendsting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitAppendsting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendstingContext appendsting() throws RecognitionException {
		AppendstingContext _localctx = new AppendstingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_appendsting);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(STRING);
				setState(152);
				match(PLUS);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(153);
					appendsting();
					}
					break;
				}
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(NUM);
				setState(157);
				match(PLUS);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(158);
					appendsting();
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(ID);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(162);
					valindex();
					}
				}

				setState(165);
				match(PLUS);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(166);
					appendsting();
					}
					break;
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(NEWLINE);
				setState(170);
				match(PLUS);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(171);
					appendsting();
					}
					break;
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
		enterRule(_localctx, 20, RULE_valindex);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(LSQBRACK);
				setState(177);
				match(NUM);
				setState(178);
				match(RSQBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(LSQBRACK);
				setState(180);
				match(NUM);
				setState(181);
				match(COMMA);
				setState(182);
				match(NUM);
				setState(183);
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
		enterRule(_localctx, 22, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			logstmt();
			setState(188);
			match(DO);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				stmt();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << NUMB) | (1L << VEC) | (1L << MTX) | (1L << NUM) | (1L << ID))) != 0) );
			setState(194);
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
		enterRule(_localctx, 24, RULE_assignstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(197);
				valindex();
				}
			}

			setState(200);
			match(ASSIGN);
			setState(201);
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
		enterRule(_localctx, 26, RULE_addexpr);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				multiexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				multiexpr();
				setState(205);
				ariop();
				setState(206);
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
		enterRule(_localctx, 28, RULE_multiexpr);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				primeexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				primeexpr();
				setState(212);
				mulop();
				setState(213);
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
		enterRule(_localctx, 30, RULE_primeexpr);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ID);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(218);
					valindex();
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(LPAREN);
				setState(223);
				addexpr();
				setState(224);
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
		enterRule(_localctx, 32, RULE_logstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			addexpr();
			setState(229);
			logop();
			setState(230);
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
		enterRule(_localctx, 34, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << BT) | (1L << EQEQ) | (1L << NOTEQ) | (1L << LTEQ) | (1L << BTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
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
		enterRule(_localctx, 36, RULE_ariop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 38, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6b\n\6\r\6"+
		"\16\6c\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7m\n\7\r\7\16\7n\3\7\5\7r\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\6\by\n\b\r\b\16\bz\7\b}\n\b\f\b\16\b\u0080\13\b\3\t\3"+
		"\t\3\t\3\n\5\n\u0086\n\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\5\n\u008e\n\n\3"+
		"\n\3\n\5\n\u0092\n\n\3\n\5\n\u0095\n\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13"+
		"\5\13\u009d\n\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\13\3\13\5\13\u00a6\n"+
		"\13\3\13\3\13\5\13\u00aa\n\13\3\13\3\13\3\13\5\13\u00af\n\13\5\13\u00b1"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\3\r\3\r\6"+
		"\r\u00c1\n\r\r\r\16\r\u00c2\3\r\3\r\3\16\3\16\5\16\u00c9\n\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d3\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00da\n\20\3\21\3\21\5\21\u00de\n\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00e5\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2\6\13\3\2"+
		"\25\26\3\2\27\31\2\u0103\2-\3\2\2\2\4K\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\n"+
		"]\3\2\2\2\fq\3\2\2\2\16~\3\2\2\2\20\u0081\3\2\2\2\22\u0097\3\2\2\2\24"+
		"\u00b0\3\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3\2\2\2\32\u00c6\3\2\2\2\34\u00d2"+
		"\3\2\2\2\36\u00d9\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$\u00ea\3\2\2"+
		"\2&\u00ec\3\2\2\2(\u00ee\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7"+
		"\3\2\2\67\3\3\2\2\289\7\37\2\29:\7&\2\2:L\7\4\2\2;<\7\37\2\2<=\7&\2\2"+
		"=>\7\5\2\2>?\5\b\5\2?@\7\4\2\2@L\3\2\2\2AB\7 \2\2BC\7&\2\2CD\7\5\2\2D"+
		"E\7$\2\2EL\7\4\2\2FG\7!\2\2GH\7&\2\2HI\7\5\2\2IJ\7#\2\2JL\7\4\2\2K8\3"+
		"\2\2\2K;\3\2\2\2KA\3\2\2\2KF\3\2\2\2L\5\3\2\2\2MN\5\b\5\2NO\7\4\2\2OZ"+
		"\3\2\2\2PZ\5\4\3\2QZ\5\n\6\2RZ\5\30\r\2ST\5\32\16\2TU\7\4\2\2UZ\3\2\2"+
		"\2VW\5\20\t\2WX\7\4\2\2XZ\3\2\2\2YM\3\2\2\2YP\3\2\2\2YQ\3\2\2\2YR\3\2"+
		"\2\2YS\3\2\2\2YV\3\2\2\2Z\7\3\2\2\2[\\\5\34\17\2\\\t\3\2\2\2]^\7\f\2\2"+
		"^_\5\"\22\2_a\7\r\2\2`b\5\6\4\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2de\3\2\2\2ef\5\f\7\2fg\7\17\2\2g\13\3\2\2\2hi\5\16\b\2ij\7\16\2\2jl"+
		"\7\r\2\2km\5\6\4\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2p"+
		"r\5\16\b\2qh\3\2\2\2qp\3\2\2\2r\r\3\2\2\2st\7\16\2\2tu\7\f\2\2uv\5\"\22"+
		"\2vx\7\r\2\2wy\5\6\4\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|s\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\17\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\7\22\2\2\u0082\u0083\5\22\n\2\u0083\21\3\2\2\2\u0084"+
		"\u0086\5\24\13\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0098\7%\2\2\u0088\u008a\5\24\13\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0098\7\"\2\2\u008c\u008e\5\24"+
		"\13\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\7&\2\2\u0090\u0092\5\26\f\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0098\3\2\2\2\u0093\u0095\5\24\13\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\23\2\2\u0097\u0085\3"+
		"\2\2\2\u0097\u0089\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0094\3\2\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\7%\2\2\u009a\u009c\7\25\2\2\u009b\u009d\5\24\13"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00b1\3\2\2\2\u009e\u009f"+
		"\7\"\2\2\u009f\u00a1\7\25\2\2\u00a0\u00a2\5\24\13\2\u00a1\u00a0\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\u00b1\3\2\2\2\u00a3\u00a5\7&\2\2\u00a4\u00a6"+
		"\5\26\f\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a9\7\25\2\2\u00a8\u00aa\5\24\13\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00ae\7"+
		"\25\2\2\u00ad\u00af\5\24\13\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00b1\3\2\2\2\u00b0\u0099\3\2\2\2\u00b0\u009e\3\2\2\2\u00b0\u00a3"+
		"\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"\u00b4\7\"\2\2\u00b4\u00bb\7\35\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00b7\7"+
		"\"\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00bb\7\35\2\2\u00ba"+
		"\u00b2\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7\20\2"+
		"\2\u00bd\u00be\5\"\22\2\u00be\u00c0\7\21\2\2\u00bf\u00c1\5\6\4\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\17\2\2\u00c5\31\3\2\2\2\u00c6\u00c8"+
		"\7&\2\2\u00c7\u00c9\5\26\f\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cc\5\b\5\2\u00cc\33\3\2\2"+
		"\2\u00cd\u00d3\5\36\20\2\u00ce\u00cf\5\36\20\2\u00cf\u00d0\5&\24\2\u00d0"+
		"\u00d1\5\34\17\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3"+
		"\2\2\2\u00d3\35\3\2\2\2\u00d4\u00da\5 \21\2\u00d5\u00d6\5 \21\2\u00d6"+
		"\u00d7\5(\25\2\u00d7\u00d8\5\36\20\2\u00d8\u00da\3\2\2\2\u00d9\u00d4\3"+
		"\2\2\2\u00d9\u00d5\3\2\2\2\u00da\37\3\2\2\2\u00db\u00dd\7&\2\2\u00dc\u00de"+
		"\5\26\f\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e5\3\2\2\2"+
		"\u00df\u00e5\7\"\2\2\u00e0\u00e1\7\32\2\2\u00e1\u00e2\5\34\17\2\u00e2"+
		"\u00e3\7\33\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00df\3"+
		"\2\2\2\u00e4\u00e0\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e7\5\34\17\2\u00e7"+
		"\u00e8\5$\23\2\u00e8\u00e9\5\34\17\2\u00e9#\3\2\2\2\u00ea\u00eb\t\2\2"+
		"\2\u00eb%\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed\'\3\2\2\2\u00ee\u00ef\t\4"+
		"\2\2\u00ef)\3\2\2\2\36-\63KYcnqz~\u0085\u0089\u008d\u0091\u0094\u0097"+
		"\u009c\u00a1\u00a5\u00a9\u00ae\u00b0\u00ba\u00c2\u00c8\u00d2\u00d9\u00dd"+
		"\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}