// Generated from D:/laby/protege/MathLangCompiler/src/main/java/compiler/grammar\stringGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stringGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, INT_TYPE=3, STRING_TYPE=4, SEMICOLON=5, OPAR=6, CPAR=7, 
		OANGLEBR=8, EQOANGLEBR=9, CANGLEBR=10, EQCANGLEBR=11, OBRACKET=12, CBRACKET=13, 
		COLON=14, NEGATION=15, INCR=16, DECR=17, EQ=18, NEQ=19, IS=20, MUL=21, 
		DIV=22, ADD=23, SUB=24, IN=25, POW=26, PRINT=27, PRITTY_PRINT=28, CONST=29, 
		IF=30, ELSE=31, WHILE=32, FOREACH=33, FOR=34, CASE=35, DEFAULT=36, MAIN=37, 
		FUNCTION=38, RETURN=39, INT=40, STRING=41, ID=42, COMMENT=43, SPACES=44, 
		MOD=45;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_expr = 4, 
		RULE_create = 5, RULE_create_int = 6, RULE_create_const_int = 7, RULE_create_string = 8, 
		RULE_create_const_string = 9, RULE_name_object_int = 10, RULE_name_object_string = 11, 
		RULE_if_stat = 12, RULE_condition_block = 13, RULE_stat_block = 14, RULE_while_stat = 15, 
		RULE_for_stat = 16, RULE_condition_for = 17, RULE_condition = 18, RULE_print = 19, 
		RULE_print_expr = 20, RULE_function_call = 21, RULE_param_call = 22, RULE_arg_call = 23, 
		RULE_function = 24, RULE_stat_block_with_return = 25, RULE_return_id = 26, 
		RULE_param = 27, RULE_arg = 28, RULE_type = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "main", "start", "instruction", "expr", "create", "create_int", 
			"create_const_int", "create_string", "create_const_string", "name_object_int", 
			"name_object_string", "if_stat", "condition_block", "stat_block", "while_stat", 
			"for_stat", "condition_for", "condition", "print", "print_expr", "function_call", 
			"param_call", "arg_call", "function", "stat_block_with_return", "return_id", 
			"param", "arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'integer'", "'string'", "';'", "'('", "')'", "'<'", 
			"'<='", "'>'", "'>='", "'{'", "'}'", "':'", "'!'", "'++'", "'--'", "'=='", 
			"'!='", "'is'", "'*'", "'/'", "'+'", "'-'", "'in'", "'^'", "'print'", 
			"'<<'", "'const'", "'if'", "'else'", "'while'", "'forEach'", "'for'", 
			"'case'", "'default'", "'main'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "INT_TYPE", "STRING_TYPE", "SEMICOLON", "OPAR", 
			"CPAR", "OANGLEBR", "EQOANGLEBR", "CANGLEBR", "EQCANGLEBR", "OBRACKET", 
			"CBRACKET", "COLON", "NEGATION", "INCR", "DECR", "EQ", "NEQ", "IS", "MUL", 
			"DIV", "ADD", "SUB", "IN", "POW", "PRINT", "PRITTY_PRINT", "CONST", "IF", 
			"ELSE", "WHILE", "FOREACH", "FOR", "CASE", "DEFAULT", "MAIN", "FUNCTION", 
			"RETURN", "INT", "STRING", "ID", "COMMENT", "SPACES", "MOD"
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
	public String getGrammarFileName() { return "stringGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public stringGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(stringGrammarParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << CONST))) != 0)) {
				{
				{
				setState(60);
				create();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(66);
				function();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(73);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(stringGrammarParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(stringGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(stringGrammarParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(MAIN);
			setState(76);
			match(OBRACKET);
			setState(77);
			start();
			setState(78);
			match(CBRACKET);
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

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << OPAR) | (1L << ADD) | (1L << SUB) | (1L << PRINT) | (1L << CONST) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				instruction();
				}
				}
				setState(85);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				for_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				function_call();
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExprContext extends ExprContext {
		public Name_object_stringContext name_object_string() {
			return getRuleContext(Name_object_stringContext.class,0);
		}
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(stringGrammarParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(stringGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(stringGrammarParser.DIV, 0); }
		public ModMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterModMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitModMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitModMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public PrimContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(stringGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(stringGrammarParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExrpContext extends ExprContext {
		public Name_object_intContext name_object_int() {
			return getRuleContext(Name_object_intContext.class,0);
		}
		public IntExrpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIntExrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIntExrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIntExrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(stringGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(stringGrammarParser.SUB, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(stringGrammarParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(ID);
				setState(97);
				match(OPAR);
				setState(98);
				expr(0);
				setState(99);
				match(CPAR);
				}
				break;
			case 2:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expr(7);
				}
				break;
			case 3:
				{
				_localctx = new PrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(OPAR);
				setState(104);
				expr(0);
				setState(105);
				match(CPAR);
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IntExrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				name_object_int();
				}
				break;
			case 6:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				name_object_string();
				}
				break;
			case 7:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				setState(111);
				match(ASSIGN);
				setState(112);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ModMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(116);
						((ModMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ModMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(119);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122);
						match(POW);
						setState(123);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreateContext extends ParserRuleContext {
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext create_const_int() {
			return getRuleContext(Create_const_intContext.class,0);
		}
		public Create_stringContext create_string() {
			return getRuleContext(Create_stringContext.class,0);
		}
		public Create_const_stringContext create_const_string() {
			return getRuleContext(Create_const_stringContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				create_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				create_const_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				create_string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				create_const_string();
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

	public static class Create_intContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(stringGrammarParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_intContext create_int() throws RecognitionException {
		Create_intContext _localctx = new Create_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(INT_TYPE);
			setState(136);
			match(ID);
			setState(137);
			match(ASSIGN);
			setState(138);
			expr(0);
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

	public static class Create_const_intContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(stringGrammarParser.CONST, 0); }
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_const_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_const_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_const_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_intContext create_const_int() throws RecognitionException {
		Create_const_intContext _localctx = new Create_const_intContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_const_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CONST);
			setState(141);
			create_int();
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

	public static class Create_stringContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(stringGrammarParser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_stringContext create_string() throws RecognitionException {
		Create_stringContext _localctx = new Create_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(STRING_TYPE);
			setState(144);
			match(ID);
			setState(145);
			match(ASSIGN);
			setState(146);
			expr(0);
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

	public static class Create_const_stringContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(stringGrammarParser.CONST, 0); }
		public Create_stringContext create_string() {
			return getRuleContext(Create_stringContext.class,0);
		}
		public Create_const_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_const_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_const_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_const_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_stringContext create_const_string() throws RecognitionException {
		Create_const_stringContext _localctx = new Create_const_stringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_const_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CONST);
			setState(149);
			create_string();
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

	public static class Name_object_intContext extends ParserRuleContext {
		public Name_object_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_int; }
	 
		public Name_object_intContext() { }
		public void copyFrom(Name_object_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectIntContext extends Name_object_intContext {
		public TerminalNode INT() { return getToken(stringGrammarParser.INT, 0); }
		public NameObjectIntContext(Name_object_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterNameObjectInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitNameObjectInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitNameObjectInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_intContext name_object_int() throws RecognitionException {
		Name_object_intContext _localctx = new Name_object_intContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_int);
		try {
			_localctx = new NameObjectIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(INT);
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

	public static class Name_object_stringContext extends ParserRuleContext {
		public Name_object_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_string; }
	 
		public Name_object_stringContext() { }
		public void copyFrom(Name_object_stringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectStringContext extends Name_object_stringContext {
		public TerminalNode STRING() { return getToken(stringGrammarParser.STRING, 0); }
		public NameObjectStringContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterNameObjectString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitNameObjectString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitNameObjectString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_stringContext name_object_string() throws RecognitionException {
		Name_object_stringContext _localctx = new Name_object_stringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_object_string);
		try {
			_localctx = new NameObjectStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(STRING);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(stringGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(stringGrammarParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(stringGrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(stringGrammarParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IF);
			setState(156);
			condition_block();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(ELSE);
					setState(158);
					match(IF);
					setState(159);
					condition_block();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(165);
				match(ELSE);
				setState(166);
				stat_block();
				}
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(stringGrammarParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(OPAR);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(170);
				match(NEGATION);
				}
			}

			setState(173);
			condition();
			setState(174);
			match(CPAR);
			setState(175);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(stringGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(stringGrammarParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(OBRACKET);
			setState(178);
			start();
			setState(179);
			match(CBRACKET);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(stringGrammarParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			condition_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(stringGrammarParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public Condition_forContext condition_for() {
			return getRuleContext(Condition_forContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FOR);
			setState(185);
			match(OPAR);
			setState(186);
			condition_for();
			setState(187);
			match(CPAR);
			setState(188);
			stat_block();
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

	public static class Condition_forContext extends ParserRuleContext {
		public Condition_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for; }
	 
		public Condition_forContext() { }
		public void copyFrom(Condition_forContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondContext extends Condition_forContext {
		public Token oper;
		public List<TerminalNode> ID() { return getTokens(stringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(stringGrammarParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(stringGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(stringGrammarParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(stringGrammarParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(stringGrammarParser.DECR, 0); }
		public ForCondContext(Condition_forContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitForCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_forContext condition_for() throws RecognitionException {
		Condition_forContext _localctx = new Condition_forContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_for);
		int _la;
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(191);
			match(ASSIGN);
			setState(192);
			expr(0);
			setState(193);
			match(SEMICOLON);
			setState(194);
			condition();
			setState(195);
			match(SEMICOLON);
			setState(196);
			match(ID);
			setState(197);
			((ForCondContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
				((ForCondContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode IS() { return getToken(stringGrammarParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(stringGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(stringGrammarParser.NEQ, 0); }
		public TerminalNode OANGLEBR() { return getToken(stringGrammarParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(stringGrammarParser.CANGLEBR, 0); }
		public TerminalNode EQOANGLEBR() { return getToken(stringGrammarParser.EQOANGLEBR, 0); }
		public TerminalNode EQCANGLEBR() { return getToken(stringGrammarParser.EQCANGLEBR, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ID);
				setState(200);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OANGLEBR) | (1L << EQOANGLEBR) | (1L << CANGLEBR) | (1L << EQCANGLEBR) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(ID);
				setState(203);
				match(IS);
				setState(204);
				type();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(stringGrammarParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(PRINT);
			setState(208);
			print_expr();
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pretty_printContext extends Print_exprContext {
		public TerminalNode PRITTY_PRINT() { return getToken(stringGrammarParser.PRITTY_PRINT, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Pretty_printContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPretty_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPretty_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPretty_print(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_exprContext {
		public TerminalNode INT() { return getToken(stringGrammarParser.INT, 0); }
		public PrintIntContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrintInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrintInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends Print_exprContext {
		public TerminalNode STRING() { return getToken(stringGrammarParser.STRING, 0); }
		public PrintStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrintString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_expr);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ID);
				}
				break;
			case INT:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(STRING);
				}
				break;
			case PRITTY_PRINT:
				_localctx = new Pretty_printContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(PRITTY_PRINT);
				setState(214);
				match(ID);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ID);
			setState(218);
			param_call();
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(OPAR);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(221);
				arg_call();
				}
			}

			setState(224);
			match(CPAR);
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arg_call);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ID);
				setState(228);
				match(T__0);
				setState(229);
				arg_call();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(stringGrammarParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(stringGrammarParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(FUNCTION);
				setState(233);
				match(ID);
				setState(234);
				param();
				setState(235);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(FUNCTION);
				setState(238);
				type();
				setState(239);
				match(ID);
				setState(240);
				param();
				setState(241);
				stat_block_with_return();
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(stringGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(stringGrammarParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStat_block_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStat_block_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(OBRACKET);
			setState(246);
			start();
			setState(247);
			return_id();
			setState(248);
			match(CBRACKET);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(stringGrammarParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterReturn_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitReturn_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(RETURN);
			setState(251);
			match(ID);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(OPAR);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==STRING_TYPE) {
				{
				setState(254);
				arg();
				}
			}

			setState(257);
			match(CPAR);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arg);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				type();
				setState(260);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				type();
				setState(263);
				match(ID);
				setState(264);
				match(T__0);
				setState(265);
				arg();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(stringGrammarParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(stringGrammarParser.STRING_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==STRING_TYPE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"`\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\177\n\6\f\6"+
		"\16\6\u0082\13\6\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16\3\16\3\16\5\16"+
		"\u00aa\n\16\3\17\3\17\5\17\u00ae\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d0"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00e1\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00e9"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f6"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u0102\n\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u010e\n\36\3\37"+
		"\3\37\3\37\2\3\n \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<\2\7\3\2\31\32\4\2\27\30//\3\2\22\23\4\2\n\r\24\25\3\2\5\6\2"+
		"\u0114\2A\3\2\2\2\4M\3\2\2\2\6U\3\2\2\2\b_\3\2\2\2\ns\3\2\2\2\f\u0087"+
		"\3\2\2\2\16\u0089\3\2\2\2\20\u008e\3\2\2\2\22\u0091\3\2\2\2\24\u0096\3"+
		"\2\2\2\26\u0099\3\2\2\2\30\u009b\3\2\2\2\32\u009d\3\2\2\2\34\u00ab\3\2"+
		"\2\2\36\u00b3\3\2\2\2 \u00b7\3\2\2\2\"\u00ba\3\2\2\2$\u00c0\3\2\2\2&\u00cf"+
		"\3\2\2\2(\u00d1\3\2\2\2*\u00d9\3\2\2\2,\u00db\3\2\2\2.\u00de\3\2\2\2\60"+
		"\u00e8\3\2\2\2\62\u00f5\3\2\2\2\64\u00f7\3\2\2\2\66\u00fc\3\2\2\28\u00ff"+
		"\3\2\2\2:\u010d\3\2\2\2<\u010f\3\2\2\2>@\5\f\7\2?>\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\62\32\2ED\3\2\2\2FI\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\4\3\2KL\7\2\2\3L\3\3\2"+
		"\2\2MN\7\'\2\2NO\7\16\2\2OP\5\6\4\2PQ\7\17\2\2Q\5\3\2\2\2RT\5\b\5\2SR"+
		"\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WU\3\2\2\2X`\5\f\7\2"+
		"Y`\5\n\6\2Z`\5(\25\2[`\5\32\16\2\\`\5 \21\2]`\5\"\22\2^`\5,\27\2_X\3\2"+
		"\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\t\3"+
		"\2\2\2ab\b\6\1\2bc\7,\2\2cd\7\b\2\2de\5\n\6\2ef\7\t\2\2ft\3\2\2\2gh\t"+
		"\2\2\2ht\5\n\6\tij\7\b\2\2jk\5\n\6\2kl\7\t\2\2lt\3\2\2\2mt\7,\2\2nt\5"+
		"\26\f\2ot\5\30\r\2pq\7,\2\2qr\7\4\2\2rt\5\n\6\3sa\3\2\2\2sg\3\2\2\2si"+
		"\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2t\u0080\3\2\2\2uv\f\f"+
		"\2\2vw\t\3\2\2w\177\5\n\6\rxy\f\13\2\2yz\t\2\2\2z\177\5\n\6\f{|\f\4\2"+
		"\2|}\7\34\2\2}\177\5\n\6\5~u\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0088\5\16\b\2\u0084\u0088\5\20\t\2\u0085\u0088\5\22\n\2"+
		"\u0086\u0088\5\24\13\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\r\3\2\2\2\u0089\u008a\7\5\2\2\u008a"+
		"\u008b\7,\2\2\u008b\u008c\7\4\2\2\u008c\u008d\5\n\6\2\u008d\17\3\2\2\2"+
		"\u008e\u008f\7\37\2\2\u008f\u0090\5\16\b\2\u0090\21\3\2\2\2\u0091\u0092"+
		"\7\6\2\2\u0092\u0093\7,\2\2\u0093\u0094\7\4\2\2\u0094\u0095\5\n\6\2\u0095"+
		"\23\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\22\n\2\u0098\25\3\2\2\2"+
		"\u0099\u009a\7*\2\2\u009a\27\3\2\2\2\u009b\u009c\7+\2\2\u009c\31\3\2\2"+
		"\2\u009d\u009e\7 \2\2\u009e\u00a4\5\34\17\2\u009f\u00a0\7!\2\2\u00a0\u00a1"+
		"\7 \2\2\u00a1\u00a3\5\34\17\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7!\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00ad\7\b\2\2\u00ac\u00ae"+
		"\7\21\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00b0\5&\24\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\36\20\2\u00b2\35"+
		"\3\2\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7\17\2\2"+
		"\u00b6\37\3\2\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\5\34\17\2\u00b9!\3\2"+
		"\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5$\23\2\u00bd"+
		"\u00be\7\t\2\2\u00be\u00bf\5\36\20\2\u00bf#\3\2\2\2\u00c0\u00c1\7,\2\2"+
		"\u00c1\u00c2\7\4\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5"+
		"\5&\24\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7\7,\2\2\u00c7\u00c8\t\4\2\2\u00c8"+
		"%\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\t\5\2\2\u00cb\u00d0\5\n\6\2\u00cc"+
		"\u00cd\7,\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00d0\5<\37\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00cc\3\2\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3"+
		"\5*\26\2\u00d3)\3\2\2\2\u00d4\u00da\7,\2\2\u00d5\u00da\7*\2\2\u00d6\u00da"+
		"\7+\2\2\u00d7\u00d8\7\36\2\2\u00d8\u00da\7,\2\2\u00d9\u00d4\3\2\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da+\3\2\2\2"+
		"\u00db\u00dc\7,\2\2\u00dc\u00dd\5.\30\2\u00dd-\3\2\2\2\u00de\u00e0\7\b"+
		"\2\2\u00df\u00e1\5\60\31\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\7\t\2\2\u00e3/\3\2\2\2\u00e4\u00e9\7,\2\2\u00e5"+
		"\u00e6\7,\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e9\5\60\31\2\u00e8\u00e4\3"+
		"\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\61\3\2\2\2\u00ea\u00eb\7(\2\2\u00eb\u00ec"+
		"\7,\2\2\u00ec\u00ed\58\35\2\u00ed\u00ee\5\36\20\2\u00ee\u00f6\3\2\2\2"+
		"\u00ef\u00f0\7(\2\2\u00f0\u00f1\5<\37\2\u00f1\u00f2\7,\2\2\u00f2\u00f3"+
		"\58\35\2\u00f3\u00f4\5\64\33\2\u00f4\u00f6\3\2\2\2\u00f5\u00ea\3\2\2\2"+
		"\u00f5\u00ef\3\2\2\2\u00f6\63\3\2\2\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9"+
		"\5\6\4\2\u00f9\u00fa\5\66\34\2\u00fa\u00fb\7\17\2\2\u00fb\65\3\2\2\2\u00fc"+
		"\u00fd\7)\2\2\u00fd\u00fe\7,\2\2\u00fe\67\3\2\2\2\u00ff\u0101\7\b\2\2"+
		"\u0100\u0102\5:\36\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\7\t\2\2\u01049\3\2\2\2\u0105\u0106\5<\37\2\u0106"+
		"\u0107\7,\2\2\u0107\u010e\3\2\2\2\u0108\u0109\5<\37\2\u0109\u010a\7,\2"+
		"\2\u010a\u010b\7\3\2\2\u010b\u010c\5:\36\2\u010c\u010e\3\2\2\2\u010d\u0105"+
		"\3\2\2\2\u010d\u0108\3\2\2\2\u010e;\3\2\2\2\u010f\u0110\t\6\2\2\u0110"+
		"=\3\2\2\2\24AGU_s~\u0080\u0087\u00a4\u00a9\u00ad\u00cf\u00d9\u00e0\u00e8"+
		"\u00f5\u0101\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}