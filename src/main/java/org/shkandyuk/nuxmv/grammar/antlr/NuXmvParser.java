// Generated from NuXmvParser.g4 by ANTLR 4.13.1

    package org.shkandyuk.nuxmv.grammar.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NuXmvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, DEFINE=2, MDEFINE=3, CONSTANTS=4, VAR=5, IVAR=6, PROCESS=7, 
		CASE=8, ESAC=9, FROZENVAR=10, TRANS=11, INVAR=12, SPEC=13, CTLSPEC=14, 
		LTLSPEC=15, PSLSPEC=16, COMPUTE=17, NAME=18, INVARSPEC=19, FAIRNESS=20, 
		JUSTICE=21, COMPASSION=22, ISA=23, ASSIGN=24, CONSTRAINT=25, SIMPWFF=26, 
		CTLWFF=27, LTLWFF=28, PSLWFF=29, COMPWFF=30, IN=31, MIN=32, MAX=33, MIRROR=34, 
		PRED=35, PREDICATES=36, BI_WORD1=37, BI_BOOL=38, BI_SIGNED=39, BI_UNSIGNED=40, 
		BI_EXTEND=41, BI_RESIZE=42, BI_SIZEOF=43, BI_UWCONST=44, BI_SWCONST=45, 
		BI_INIT=46, BI_SELF=47, BI_COUNT=48, BI_ABS=49, BI_MAX=50, BI_MIN=51, 
		T_ARRAY=52, T_OF=53, T_BOOLEAN=54, T_INTEGER=55, T_REAL=56, T_WORD=57, 
		OP_EX=58, OP_AX=59, OP_EF=60, OP_AF=61, OP_EG=62, OP_AG=63, OP_E=64, OP_F=65, 
		OP_O=66, OP_G=67, OP_H=68, OP_X=69, OP_Y=70, OP_Z=71, OP_A=72, OP_U=73, 
		OP_S=74, OP_V=75, OP_T=76, OP_BU=77, OP_EBF=78, OP_ABF=79, OP_EBG=80, 
		OP_ABG=81, OP_NEXT=82, OP_MOD=83, OP_UNION=84, OP_IN=85, OP_XOR=86, OP_XNOR=87, 
		OP_AND=88, OP_OR=89, EXCLAMATION=90, DOT=91, PLUS=92, MINUS=93, MINUS_ARROW=94, 
		L_ARROW=95, R_ARROW=96, ASTERISK=97, SLASH=98, EXCLAMATION_EQ=99, IDENTIFICATOR=100, 
		ASSIGN_OP=101, STATE_ASSIGN=102, L_SQUARE_BRACKET=103, R_SQUARE_BRACKET=104, 
		L_BRACKET=105, R_BRACKET=106, L_BRACE=107, R_BRACE=108, SEMICOLON=109, 
		COLON=110, COMMA=111, INTEGER=112, BIN=113, OCT=114, DEC=115, HEX=116, 
		COMMENT=117, LINE_COMMENT=118, WS=119, BR=120, BAD_CHARACTER=121;
	public static final int
		RULE_root = 0, RULE_module = 1, RULE_variables_declarations = 2, RULE_variables_list = 3, 
		RULE_moduleBody = 4, RULE_varDeclaration = 5, RULE_assignment = 6, RULE_assign_statment = 7, 
		RULE_init = 8, RULE_init_statement = 9, RULE_next = 10, RULE_next_statement = 11, 
		RULE_spec = 12, RULE_definment = 13, RULE_expressions = 14, RULE_expression = 15, 
		RULE_unar_ops = 16, RULE_spec_operators = 17, RULE_bit_ops = 18, RULE_bin_ops = 19, 
		RULE_case = 20, RULE_case_statment = 21, RULE_type = 22, RULE_value_list = 23, 
		RULE_value = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "module", "variables_declarations", "variables_list", "moduleBody", 
			"varDeclaration", "assignment", "assign_statment", "init", "init_statement", 
			"next", "next_statement", "spec", "definment", "expressions", "expression", 
			"unar_ops", "spec_operators", "bit_ops", "bin_ops", "case", "case_statment", 
			"type", "value_list", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MODULE'", "'DEFINE'", "'MDEFINE'", "'CONSTANTS'", "'VAR'", "'IVAR'", 
			"'process'", "'case'", "'esac'", "'FROZENVAR'", "'TRANS'", "'INVAR'", 
			"'SPEC'", "'CTLSPEC'", "'LTLSPEC'", "'PSLSPEC'", "'COMPUTE'", "'NAME'", 
			"'INVARSPEC'", "'FAIRNESS'", "'JUSTICE'", "'COMPASSION'", "'ISA'", "'ASSIGN'", 
			"'CONSTRAINT'", "'SIMPWFF'", "'CTLWFF'", "'LTLWFF'", "'PSLWFF'", "'COMPWFF'", 
			"'IN'", "'MIN'", "'MAX'", "'MIRROR'", "'PRED'", "'PREDICATES'", "'word1'", 
			"'bool'", "'signed'", "'unsigned'", "'extend'", "'resize'", "'sizeof'", 
			"'uwconst'", "'swconst'", "'init'", "'self'", "'count'", "'abs'", "'max'", 
			"'min'", "'array'", "'of'", "'boolean'", "'integer'", "'real'", "'word'", 
			"'EX'", "'AX'", "'EF'", "'AF'", "'EG'", "'AG'", "'E'", "'F'", "'O'", 
			"'G'", "'H'", "'X'", "'Y'", "'Z'", "'A'", "'U'", "'S'", "'V'", "'T'", 
			"'BU'", "'EBF'", "'ABF'", "'EBG'", "'ABG'", "'next'", "'mod'", "'union'", 
			"'in'", "'xor'", "'xnor'", "'&'", "'|'", "'!'", "'.'", "'+'", "'-'", 
			"'->'", "'<'", "'>'", "'*'", "'/'", "'!='", null, "':='", "'='", "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "';'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODULE", "DEFINE", "MDEFINE", "CONSTANTS", "VAR", "IVAR", "PROCESS", 
			"CASE", "ESAC", "FROZENVAR", "TRANS", "INVAR", "SPEC", "CTLSPEC", "LTLSPEC", 
			"PSLSPEC", "COMPUTE", "NAME", "INVARSPEC", "FAIRNESS", "JUSTICE", "COMPASSION", 
			"ISA", "ASSIGN", "CONSTRAINT", "SIMPWFF", "CTLWFF", "LTLWFF", "PSLWFF", 
			"COMPWFF", "IN", "MIN", "MAX", "MIRROR", "PRED", "PREDICATES", "BI_WORD1", 
			"BI_BOOL", "BI_SIGNED", "BI_UNSIGNED", "BI_EXTEND", "BI_RESIZE", "BI_SIZEOF", 
			"BI_UWCONST", "BI_SWCONST", "BI_INIT", "BI_SELF", "BI_COUNT", "BI_ABS", 
			"BI_MAX", "BI_MIN", "T_ARRAY", "T_OF", "T_BOOLEAN", "T_INTEGER", "T_REAL", 
			"T_WORD", "OP_EX", "OP_AX", "OP_EF", "OP_AF", "OP_EG", "OP_AG", "OP_E", 
			"OP_F", "OP_O", "OP_G", "OP_H", "OP_X", "OP_Y", "OP_Z", "OP_A", "OP_U", 
			"OP_S", "OP_V", "OP_T", "OP_BU", "OP_EBF", "OP_ABF", "OP_EBG", "OP_ABG", 
			"OP_NEXT", "OP_MOD", "OP_UNION", "OP_IN", "OP_XOR", "OP_XNOR", "OP_AND", 
			"OP_OR", "EXCLAMATION", "DOT", "PLUS", "MINUS", "MINUS_ARROW", "L_ARROW", 
			"R_ARROW", "ASTERISK", "SLASH", "EXCLAMATION_EQ", "IDENTIFICATOR", "ASSIGN_OP", 
			"STATE_ASSIGN", "L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "SEMICOLON", "COLON", "COMMA", "INTEGER", 
			"BIN", "OCT", "DEC", "HEX", "COMMENT", "LINE_COMMENT", "WS", "BR", "BAD_CHARACTER"
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
	public String getGrammarFileName() { return "NuXmvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NuXmvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NuXmvParser.EOF, 0); }
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULE) {
				{
				{
				setState(50);
				module();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(NuXmvParser.MODULE, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public Variables_declarationsContext variables_declarations() {
			return getRuleContext(Variables_declarationsContext.class,0);
		}
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(MODULE);
			setState(59);
			match(IDENTIFICATOR);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(60);
				variables_declarations();
				}
			}

			setState(63);
			moduleBody();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPEC || _la==LTLSPEC) {
				{
				{
				setState(64);
				spec();
				}
				}
				setState(69);
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
	public static class Variables_declarationsContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public Variables_listContext variables_list() {
			return getRuleContext(Variables_listContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Variables_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_declarations; }
	}

	public final Variables_declarationsContext variables_declarations() throws RecognitionException {
		Variables_declarationsContext _localctx = new Variables_declarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(L_BRACKET);
			setState(71);
			variables_list();
			setState(72);
			match(R_BRACKET);
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
	public static class Variables_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NuXmvParser.COMMA, 0); }
		public Variables_listContext variables_list() {
			return getRuleContext(Variables_listContext.class,0);
		}
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public Variables_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_list; }
	}

	public final Variables_listContext variables_list() throws RecognitionException {
		Variables_listContext _localctx = new Variables_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables_list);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				expression(0);
				setState(75);
				match(COMMA);
				setState(76);
				variables_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(IDENTIFICATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleBodyContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DefinmentContext definment() {
			return getRuleContext(DefinmentContext.class,0);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			varDeclaration();
			setState(82);
			assignment();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(83);
				definment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(NuXmvParser.VAR, 0); }
		public List<TerminalNode> IDENTIFICATOR() { return getTokens(NuXmvParser.IDENTIFICATOR); }
		public TerminalNode IDENTIFICATOR(int i) {
			return getToken(NuXmvParser.IDENTIFICATOR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NuXmvParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NuXmvParser.COLON, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(NuXmvParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(NuXmvParser.SEMICOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> L_BRACE() { return getTokens(NuXmvParser.L_BRACE); }
		public TerminalNode L_BRACE(int i) {
			return getToken(NuXmvParser.L_BRACE, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> R_BRACE() { return getTokens(NuXmvParser.R_BRACE); }
		public TerminalNode R_BRACE(int i) {
			return getToken(NuXmvParser.R_BRACE, i);
		}
		public List<Variables_declarationsContext> variables_declarations() {
			return getRuleContexts(Variables_declarationsContext.class);
		}
		public Variables_declarationsContext variables_declarations(int i) {
			return getRuleContext(Variables_declarationsContext.class,i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VAR);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATOR) {
				{
				{
				setState(87);
				match(IDENTIFICATOR);
				setState(88);
				match(COLON);
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ARRAY:
				case T_BOOLEAN:
				case T_INTEGER:
				case T_REAL:
					{
					setState(89);
					type();
					}
					break;
				case L_BRACE:
					{
					setState(90);
					match(L_BRACE);
					setState(91);
					expressions();
					setState(92);
					match(R_BRACE);
					}
					break;
				case IDENTIFICATOR:
					{
					setState(94);
					match(IDENTIFICATOR);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==L_BRACKET) {
						{
						{
						setState(95);
						variables_declarations();
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103);
				match(SEMICOLON);
				}
				}
				setState(108);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NuXmvParser.ASSIGN, 0); }
		public List<Assign_statmentContext> assign_statment() {
			return getRuleContexts(Assign_statmentContext.class);
		}
		public Assign_statmentContext assign_statment(int i) {
			return getRuleContext(Assign_statmentContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			match(ASSIGN);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BI_INIT || _la==OP_NEXT) {
				{
				{
				setState(110);
				assign_statment(0);
				}
				}
				setState(115);
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
	public static class Assign_statmentContext extends ParserRuleContext {
		public Init_statementContext init_statement() {
			return getRuleContext(Init_statementContext.class,0);
		}
		public TerminalNode STATE_ASSIGN() { return getToken(NuXmvParser.STATE_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NuXmvParser.COLON, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public Assign_statmentContext assign_statment() {
			return getRuleContext(Assign_statmentContext.class,0);
		}
		public Assign_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statment; }
	}

	public final Assign_statmentContext assign_statment() throws RecognitionException {
		return assign_statment(0);
	}

	private Assign_statmentContext assign_statment(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assign_statmentContext _localctx = new Assign_statmentContext(_ctx, _parentState);
		Assign_statmentContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_assign_statment, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(117);
				init_statement();
				setState(118);
				match(STATE_ASSIGN);
				setState(119);
				expression(0);
				}
				break;
			case 2:
				{
				setState(121);
				init_statement();
				setState(122);
				match(ASSIGN_OP);
				setState(123);
				expression(0);
				setState(124);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(126);
				next_statement();
				setState(127);
				match(STATE_ASSIGN);
				setState(128);
				expression(0);
				}
				break;
			case 4:
				{
				setState(130);
				next_statement();
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				expression(0);
				setState(133);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				setState(135);
				init();
				}
				break;
			case 6:
				{
				setState(136);
				next();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Assign_statmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assign_statment);
						setState(139);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(140);
						match(COLON);
						setState(141);
						expression(0);
						setState(142);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new Assign_statmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assign_statment);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						match(ASSIGN_OP);
						setState(146);
						expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Assign_statmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assign_statment);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
						match(STATE_ASSIGN);
						setState(149);
						expression(0);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public Init_statementContext init_statement() {
			return getRuleContext(Init_statementContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			init_statement();
			setState(156);
			match(ASSIGN_OP);
			setState(157);
			expression(0);
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
	public static class Init_statementContext extends ParserRuleContext {
		public TerminalNode BI_INIT() { return getToken(NuXmvParser.BI_INIT, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_statement; }
	}

	public final Init_statementContext init_statement() throws RecognitionException {
		Init_statementContext _localctx = new Init_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(BI_INIT);
			setState(160);
			match(L_BRACKET);
			setState(161);
			expression(0);
			setState(162);
			match(R_BRACKET);
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
	public static class NextContext extends ParserRuleContext {
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			next_statement();
			setState(165);
			expression(0);
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
	public static class Next_statementContext extends ParserRuleContext {
		public TerminalNode OP_NEXT() { return getToken(NuXmvParser.OP_NEXT, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_next_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(OP_NEXT);
			setState(168);
			match(L_BRACKET);
			setState(169);
			expression(0);
			setState(170);
			match(R_BRACKET);
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
	public static class SpecContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LTLSPEC() { return getToken(NuXmvParser.LTLSPEC, 0); }
		public TerminalNode SPEC() { return getToken(NuXmvParser.SPEC, 0); }
		public Spec_operatorsContext spec_operators() {
			return getRuleContext(Spec_operatorsContext.class,0);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==SPEC || _la==LTLSPEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16777215L) != 0)) {
				{
				setState(173);
				spec_operators();
				}
			}

			setState(176);
			expression(0);
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
	public static class DefinmentContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(NuXmvParser.DEFINE, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(NuXmvParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(NuXmvParser.SEMICOLON, i);
		}
		public DefinmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definment; }
	}

	public final DefinmentContext definment() throws RecognitionException {
		DefinmentContext _localctx = new DefinmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(DEFINE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 4883457L) != 0)) {
				{
				{
				setState(179);
				expressions();
				setState(180);
				match(SEMICOLON);
				}
				}
				setState(186);
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
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NuXmvParser.COMMA, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public TerminalNode STATE_ASSIGN() { return getToken(NuXmvParser.STATE_ASSIGN, 0); }
		public Bit_opsContext bit_ops() {
			return getRuleContext(Bit_opsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressions);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				expression(0);
				setState(189);
				_la = _input.LA(1);
				if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 1027L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				expression(0);
				setState(193);
				bit_ops();
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(194);
					expression(0);
					}
					break;
				case 2:
					{
					setState(195);
					expressions();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(NuXmvParser.L_BRACE, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(NuXmvParser.R_BRACE, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Unar_opsContext unar_ops() {
			return getRuleContext(Unar_opsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public TerminalNode STATE_ASSIGN() { return getToken(NuXmvParser.STATE_ASSIGN, 0); }
		public TerminalNode ASTERISK() { return getToken(NuXmvParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(NuXmvParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(NuXmvParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NuXmvParser.MINUS, 0); }
		public Spec_operatorsContext spec_operators() {
			return getRuleContext(Spec_operatorsContext.class,0);
		}
		public TerminalNode MINUS_ARROW() { return getToken(NuXmvParser.MINUS_ARROW, 0); }
		public Bit_opsContext bit_ops() {
			return getRuleContext(Bit_opsContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NuXmvParser.DOT, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				{
				setState(202);
				match(L_BRACE);
				setState(203);
				value_list();
				setState(204);
				match(R_BRACE);
				}
				break;
			case L_BRACKET:
				{
				setState(206);
				match(L_BRACKET);
				setState(207);
				expression(0);
				setState(208);
				match(R_BRACKET);
				}
				break;
			case EXCLAMATION:
				{
				setState(210);
				unar_ops();
				setState(211);
				expression(3);
				}
				break;
			case IDENTIFICATOR:
			case INTEGER:
				{
				setState(213);
				value();
				}
				break;
			case CASE:
				{
				setState(214);
				case_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(218);
						match(STATE_ASSIGN);
						setState(219);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(221);
						_la = _input.LA(1);
						if ( !(_la==ASTERISK || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(227);
						spec_operators();
						setState(228);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(231);
						match(MINUS_ARROW);
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16777215L) != 0)) {
							{
							setState(232);
							spec_operators();
							}
						}

						setState(235);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						bit_ops();
						setState(240);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case CASE:
						case EXCLAMATION:
						case IDENTIFICATOR:
						case L_BRACKET:
						case L_BRACE:
						case INTEGER:
							{
							setState(238);
							expression(0);
							}
							break;
						case SPEC:
						case LTLSPEC:
							{
							setState(239);
							spec();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(243);
						match(DOT);
						setState(244);
						match(IDENTIFICATOR);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unar_opsContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(NuXmvParser.EXCLAMATION, 0); }
		public Unar_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unar_ops; }
	}

	public final Unar_opsContext unar_ops() throws RecognitionException {
		Unar_opsContext _localctx = new Unar_opsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unar_ops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(EXCLAMATION);
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
	public static class Spec_operatorsContext extends ParserRuleContext {
		public TerminalNode OP_EX() { return getToken(NuXmvParser.OP_EX, 0); }
		public TerminalNode OP_EG() { return getToken(NuXmvParser.OP_EG, 0); }
		public TerminalNode OP_EF() { return getToken(NuXmvParser.OP_EF, 0); }
		public TerminalNode OP_AX() { return getToken(NuXmvParser.OP_AX, 0); }
		public TerminalNode OP_AG() { return getToken(NuXmvParser.OP_AG, 0); }
		public TerminalNode OP_AF() { return getToken(NuXmvParser.OP_AF, 0); }
		public TerminalNode OP_BU() { return getToken(NuXmvParser.OP_BU, 0); }
		public TerminalNode OP_EBF() { return getToken(NuXmvParser.OP_EBF, 0); }
		public TerminalNode OP_EBG() { return getToken(NuXmvParser.OP_EBG, 0); }
		public TerminalNode OP_ABF() { return getToken(NuXmvParser.OP_ABF, 0); }
		public TerminalNode OP_ABG() { return getToken(NuXmvParser.OP_ABG, 0); }
		public TerminalNode OP_E() { return getToken(NuXmvParser.OP_E, 0); }
		public TerminalNode OP_F() { return getToken(NuXmvParser.OP_F, 0); }
		public TerminalNode OP_O() { return getToken(NuXmvParser.OP_O, 0); }
		public TerminalNode OP_G() { return getToken(NuXmvParser.OP_G, 0); }
		public TerminalNode OP_U() { return getToken(NuXmvParser.OP_U, 0); }
		public TerminalNode OP_H() { return getToken(NuXmvParser.OP_H, 0); }
		public TerminalNode OP_X() { return getToken(NuXmvParser.OP_X, 0); }
		public TerminalNode OP_Y() { return getToken(NuXmvParser.OP_Y, 0); }
		public TerminalNode OP_Z() { return getToken(NuXmvParser.OP_Z, 0); }
		public TerminalNode OP_A() { return getToken(NuXmvParser.OP_A, 0); }
		public TerminalNode OP_S() { return getToken(NuXmvParser.OP_S, 0); }
		public TerminalNode OP_V() { return getToken(NuXmvParser.OP_V, 0); }
		public TerminalNode OP_T() { return getToken(NuXmvParser.OP_T, 0); }
		public Spec_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_operators; }
	}

	public final Spec_operatorsContext spec_operators() throws RecognitionException {
		Spec_operatorsContext _localctx = new Spec_operatorsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_spec_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16777215L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bit_opsContext extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(NuXmvParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(NuXmvParser.OP_OR, 0); }
		public TerminalNode OP_XOR() { return getToken(NuXmvParser.OP_XOR, 0); }
		public TerminalNode OP_XNOR() { return getToken(NuXmvParser.OP_XNOR, 0); }
		public TerminalNode OP_IN() { return getToken(NuXmvParser.OP_IN, 0); }
		public TerminalNode OP_MOD() { return getToken(NuXmvParser.OP_MOD, 0); }
		public Bit_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_ops; }
	}

	public final Bit_opsContext bit_ops() throws RecognitionException {
		Bit_opsContext _localctx = new Bit_opsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bit_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 125L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_opsContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION_EQ() { return getToken(NuXmvParser.EXCLAMATION_EQ, 0); }
		public Bin_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_ops; }
	}

	public final Bin_opsContext bin_ops() throws RecognitionException {
		Bin_opsContext _localctx = new Bin_opsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bin_ops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(EXCLAMATION_EQ);
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
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(NuXmvParser.CASE, 0); }
		public TerminalNode ESAC() { return getToken(NuXmvParser.ESAC, 0); }
		public List<Case_statmentContext> case_statment() {
			return getRuleContexts(Case_statmentContext.class);
		}
		public Case_statmentContext case_statment(int i) {
			return getRuleContext(Case_statmentContext.class,i);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(CASE);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==BI_INIT || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 1384382721L) != 0)) {
				{
				{
				setState(259);
				case_statment();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(ESAC);
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
	public static class Case_statmentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NuXmvParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public Assign_statmentContext assign_statment() {
			return getRuleContext(Assign_statmentContext.class,0);
		}
		public Case_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statment; }
	}

	public final Case_statmentContext case_statment() throws RecognitionException {
		Case_statmentContext _localctx = new Case_statmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_statment);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(267);
					expressions();
					}
					break;
				case 2:
					{
					setState(268);
					expression(0);
					}
					break;
				}
				setState(271);
				match(COLON);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(272);
					case_();
					}
					break;
				case 2:
					{
					setState(273);
					expressions();
					}
					break;
				case 3:
					{
					setState(274);
					expression(0);
					}
					break;
				}
				setState(277);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				next();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				assign_statment(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_BOOLEAN() { return getToken(NuXmvParser.T_BOOLEAN, 0); }
		public TerminalNode T_INTEGER() { return getToken(NuXmvParser.T_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(NuXmvParser.T_REAL, 0); }
		public TerminalNode T_ARRAY() { return getToken(NuXmvParser.T_ARRAY, 0); }
		public TerminalNode L_SQUARE_BRACKET() { return getToken(NuXmvParser.L_SQUARE_BRACKET, 0); }
		public TerminalNode R_SQUARE_BRACKET() { return getToken(NuXmvParser.R_SQUARE_BRACKET, 0); }
		public TerminalNode T_OF() { return getToken(NuXmvParser.T_OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T_BOOLEAN);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(T_REAL);
				}
				break;
			case T_ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(T_ARRAY);
				setState(288);
				match(L_SQUARE_BRACKET);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFICATOR || _la==INTEGER) {
					{
					setState(289);
					value_list();
					}
				}

				setState(292);
				match(R_SQUARE_BRACKET);
				setState(293);
				match(T_OF);
				setState(294);
				type();
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
	public static class Value_listContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NuXmvParser.COMMA, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value_list);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				value();
				setState(299);
				match(COMMA);
				setState(300);
				value_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public TerminalNode INTEGER() { return getToken(NuXmvParser.INTEGER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICATOR || _la==INTEGER) ) {
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
		case 7:
			return assign_statment_sempred((Assign_statmentContext)_localctx, predIndex);
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean assign_statment_sempred(Assign_statmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001y\u0133\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001E\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005"+
		"\u0003\u0005f\b\u0005\u0001\u0005\u0005\u0005i\b\u0005\n\u0005\f\u0005"+
		"l\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006\n\u0006\f\u0006"+
		"s\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008a\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0097\b\u0007\n\u0007\f\u0007\u009a\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0003\f\u00af\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00b7\b\r\n\r\f\r\u00ba\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c5\b\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00d8\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00ea\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00f1\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00f6\b\u000f\n\u000f\f\u000f\u00f9\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0105\b\u0014\n"+
		"\u0014\f\u0014\u0108\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u010e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0114\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u011b\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0123\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0128\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012f\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0000\u0002\u000e\u001e\u0019\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0\u0000\b\u0002\u0000eenn\u0002\u0000\r\r\u000f\u000f\u0002\u0000"+
		"efoo\u0001\u0000ab\u0001\u0000\\]\u0001\u0000:Q\u0002\u0000SSUY\u0002"+
		"\u0000ddpp\u014a\u00005\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000"+
		"\u0000\u0004F\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\b"+
		"Q\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000"+
		"\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000\u0000"+
		"\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a4\u0001\u0000\u0000"+
		"\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00ac\u0001\u0000\u0000"+
		"\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00c7\u0001\u0000\u0000"+
		"\u0000\u001e\u00d7\u0001\u0000\u0000\u0000 \u00fa\u0001\u0000\u0000\u0000"+
		"\"\u00fc\u0001\u0000\u0000\u0000$\u00fe\u0001\u0000\u0000\u0000&\u0100"+
		"\u0001\u0000\u0000\u0000(\u0102\u0001\u0000\u0000\u0000*\u011a\u0001\u0000"+
		"\u0000\u0000,\u0127\u0001\u0000\u0000\u0000.\u012e\u0001\u0000\u0000\u0000"+
		"0\u0130\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0005\u0000\u0000\u00019\u0001\u0001\u0000\u0000\u0000:;\u0005\u0001"+
		"\u0000\u0000;=\u0005d\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?C\u0003"+
		"\b\u0004\u0000@B\u0003\u0018\f\u0000A@\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0003\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005i\u0000"+
		"\u0000GH\u0003\u0006\u0003\u0000HI\u0005j\u0000\u0000I\u0005\u0001\u0000"+
		"\u0000\u0000JK\u0003\u001e\u000f\u0000KL\u0005o\u0000\u0000LM\u0003\u0006"+
		"\u0003\u0000MP\u0001\u0000\u0000\u0000NP\u0005d\u0000\u0000OJ\u0001\u0000"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QR\u0003\n\u0005\u0000RT\u0003\f\u0006\u0000SU\u0003\u001a\r\u0000TS\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000"+
		"Vj\u0005\u0005\u0000\u0000WX\u0005d\u0000\u0000Xe\u0005n\u0000\u0000Y"+
		"f\u0003,\u0016\u0000Z[\u0005k\u0000\u0000[\\\u0003\u001c\u000e\u0000\\"+
		"]\u0005l\u0000\u0000]f\u0001\u0000\u0000\u0000^b\u0005d\u0000\u0000_a"+
		"\u0003\u0004\u0002\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000eY\u0001\u0000\u0000\u0000eZ\u0001"+
		"\u0000\u0000\u0000e^\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gi\u0005m\u0000\u0000hW\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u000b\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mq\u0005\u0018\u0000\u0000np\u0003"+
		"\u000e\u0007\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\r\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tu\u0006\u0007\uffff\uffff\u0000uv\u0003"+
		"\u0012\t\u0000vw\u0005f\u0000\u0000wx\u0003\u001e\u000f\u0000x\u008a\u0001"+
		"\u0000\u0000\u0000yz\u0003\u0012\t\u0000z{\u0005e\u0000\u0000{|\u0003"+
		"\u001e\u000f\u0000|}\u0005m\u0000\u0000}\u008a\u0001\u0000\u0000\u0000"+
		"~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005f\u0000\u0000\u0080\u0081"+
		"\u0003\u001e\u000f\u0000\u0081\u008a\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0003\u0016\u000b\u0000\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0085"+
		"\u0003\u001e\u000f\u0000\u0085\u0086\u0005m\u0000\u0000\u0086\u008a\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0003\u0010\b\u0000\u0088\u008a\u0003\u0014"+
		"\n\u0000\u0089t\u0001\u0000\u0000\u0000\u0089y\u0001\u0000\u0000\u0000"+
		"\u0089~\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u0098\u0001\u0000\u0000\u0000\u008b\u008c\n\t\u0000\u0000\u008c\u008d"+
		"\u0005n\u0000\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u008f\u0005"+
		"m\u0000\u0000\u008f\u0097\u0001\u0000\u0000\u0000\u0090\u0091\n\u0004"+
		"\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0097\u0003\u001e\u000f"+
		"\u0000\u0093\u0094\n\u0003\u0000\u0000\u0094\u0095\u0005f\u0000\u0000"+
		"\u0095\u0097\u0003\u001e\u000f\u0000\u0096\u008b\u0001\u0000\u0000\u0000"+
		"\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u000f\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0012\t\u0000\u009c"+
		"\u009d\u0005e\u0000\u0000\u009d\u009e\u0003\u001e\u000f\u0000\u009e\u0011"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005.\u0000\u0000\u00a0\u00a1\u0005"+
		"i\u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005j\u0000"+
		"\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u0016\u000b"+
		"\u0000\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u0015\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005R\u0000\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9"+
		"\u00aa\u0003\u001e\u000f\u0000\u00aa\u00ab\u0005j\u0000\u0000\u00ab\u0017"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0007\u0001\u0000\u0000\u00ad\u00af"+
		"\u0003\"\u0011\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003"+
		"\u001e\u000f\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b8\u0005"+
		"\u0002\u0000\u0000\u00b3\u00b4\u0003\u001c\u000e\u0000\u00b4\u00b5\u0005"+
		"m\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u001b\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00c8\u0003\u001e"+
		"\u000f\u0000\u00bc\u00bd\u0003\u001e\u000f\u0000\u00bd\u00be\u0007\u0002"+
		"\u0000\u0000\u00be\u00bf\u0003\u001c\u000e\u0000\u00bf\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c4\u0003$\u0012"+
		"\u0000\u00c2\u00c5\u0003\u001e\u000f\u0000\u00c3\u00c5\u0003\u001c\u000e"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00bb\u0001\u0000\u0000\u0000\u00c7\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c0\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\u000f\uffff"+
		"\uffff\u0000\u00ca\u00cb\u0005k\u0000\u0000\u00cb\u00cc\u0003.\u0017\u0000"+
		"\u00cc\u00cd\u0005l\u0000\u0000\u00cd\u00d8\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005i\u0000\u0000\u00cf\u00d0\u0003\u001e\u000f\u0000\u00d0\u00d1"+
		"\u0005j\u0000\u0000\u00d1\u00d8\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003"+
		" \u0010\u0000\u00d3\u00d4\u0003\u001e\u000f\u0003\u00d4\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u00030\u0018\u0000\u00d6\u00d8\u0003(\u0014\u0000"+
		"\u00d7\u00c9\u0001\u0000\u0000\u0000\u00d7\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\n\f\u0000\u0000\u00da\u00db\u0005f\u0000\u0000\u00db\u00f6"+
		"\u0003\u001e\u000f\r\u00dc\u00dd\n\t\u0000\u0000\u00dd\u00de\u0007\u0003"+
		"\u0000\u0000\u00de\u00f6\u0003\u001e\u000f\n\u00df\u00e0\n\b\u0000\u0000"+
		"\u00e0\u00e1\u0007\u0004\u0000\u0000\u00e1\u00f6\u0003\u001e\u000f\t\u00e2"+
		"\u00e3\n\u0006\u0000\u0000\u00e3\u00e4\u0003\"\u0011\u0000\u00e4\u00e5"+
		"\u0003\u001e\u000f\u0007\u00e5\u00f6\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\n\u0005\u0000\u0000\u00e7\u00e9\u0005^\u0000\u0000\u00e8\u00ea\u0003"+
		"\"\u0011\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f6\u0003\u001e"+
		"\u000f\u0006\u00ec\u00ed\n\u000b\u0000\u0000\u00ed\u00f0\u0003$\u0012"+
		"\u0000\u00ee\u00f1\u0003\u001e\u000f\u0000\u00ef\u00f1\u0003\u0018\f\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f6\u0001\u0000\u0000\u0000\u00f2\u00f3\n\n\u0000\u0000\u00f3"+
		"\u00f4\u0005[\u0000\u0000\u00f4\u00f6\u0005d\u0000\u0000\u00f5\u00d9\u0001"+
		"\u0000\u0000\u0000\u00f5\u00dc\u0001\u0000\u0000\u0000\u00f5\u00df\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e2\u0001\u0000\u0000\u0000\u00f5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00ec\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u001f\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"Z\u0000\u0000\u00fb!\u0001\u0000\u0000\u0000\u00fc\u00fd\u0007\u0005\u0000"+
		"\u0000\u00fd#\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0006\u0000\u0000"+
		"\u00ff%\u0001\u0000\u0000\u0000\u0100\u0101\u0005c\u0000\u0000\u0101\'"+
		"\u0001\u0000\u0000\u0000\u0102\u0106\u0005\b\u0000\u0000\u0103\u0105\u0003"+
		"*\u0015\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\t\u0000\u0000\u010a)\u0001\u0000\u0000"+
		"\u0000\u010b\u010e\u0003\u001c\u000e\u0000\u010c\u010e\u0003\u001e\u000f"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0113\u0005n\u0000\u0000"+
		"\u0110\u0114\u0003(\u0014\u0000\u0111\u0114\u0003\u001c\u000e\u0000\u0112"+
		"\u0114\u0003\u001e\u000f\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005m\u0000\u0000\u0116\u011b"+
		"\u0001\u0000\u0000\u0000\u0117\u011b\u0003\u001e\u000f\u0000\u0118\u011b"+
		"\u0003\u0014\n\u0000\u0119\u011b\u0003\u000e\u0007\u0000\u011a\u010d\u0001"+
		"\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b+\u0001\u0000"+
		"\u0000\u0000\u011c\u0128\u00056\u0000\u0000\u011d\u0128\u00057\u0000\u0000"+
		"\u011e\u0128\u00058\u0000\u0000\u011f\u0120\u00054\u0000\u0000\u0120\u0122"+
		"\u0005g\u0000\u0000\u0121\u0123\u0003.\u0017\u0000\u0122\u0121\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005h\u0000\u0000\u0125\u0126\u00055\u0000\u0000"+
		"\u0126\u0128\u0003,\u0016\u0000\u0127\u011c\u0001\u0000\u0000\u0000\u0127"+
		"\u011d\u0001\u0000\u0000\u0000\u0127\u011e\u0001\u0000\u0000\u0000\u0127"+
		"\u011f\u0001\u0000\u0000\u0000\u0128-\u0001\u0000\u0000\u0000\u0129\u012f"+
		"\u00030\u0018\u0000\u012a\u012b\u00030\u0018\u0000\u012b\u012c\u0005o"+
		"\u0000\u0000\u012c\u012d\u0003.\u0017\u0000\u012d\u012f\u0001\u0000\u0000"+
		"\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000"+
		"\u0000\u012f/\u0001\u0000\u0000\u0000\u0130\u0131\u0007\u0007\u0000\u0000"+
		"\u01311\u0001\u0000\u0000\u0000\u001c5=COTbejq\u0089\u0096\u0098\u00ae"+
		"\u00b8\u00c4\u00c7\u00d7\u00e9\u00f0\u00f5\u00f7\u0106\u010d\u0113\u011a"+
		"\u0122\u0127\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}