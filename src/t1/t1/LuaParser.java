// Generated from /home/jessica/Área de Trabalho/ufscar/CC1/T1/CC1-T1/src/t1/Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ENDL=3, FUNCTION=4, IF=5, THEN=6, ELSE=7, REPEAT=8, UNTIL=9, 
		FOR=10, DO=11, MINUS=12, PLUS=13, TIMES=14, DIVIDED=15, NOR=16, HASH=17, 
		LOCAL=18, ATRIBUICAO=19, COMPARACAO=20, LPAREN=21, RPAREN=22, END=23, 
		RETURN=24, FALSE=25, COMENTARIO_INICIO=26, UNDERSCORE=27, DOT=28, SEMI_C=29, 
		CADEIA=30, ID=31, NUMERO=32;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando_ultimo = 3, 
		RULE_comando = 4, RULE_comentario = 5, RULE_retorno = 6, RULE_do_decl = 7, 
		RULE_repeat_decl = 8, RULE_for_decl = 9, RULE_if_decl = 10, RULE_log_exp = 11, 
		RULE_funcao_decl = 12, RULE_funcao_corpo = 13, RULE_funcao_chamada = 14, 
		RULE_args = 15, RULE_funcao_nome = 16, RULE_funcao_nome_tabela = 17, RULE_var = 18, 
		RULE_valor = 19, RULE_atr = 20, RULE_lista_valor = 21, RULE_lista_var = 22, 
		RULE_exp = 23, RULE_atribuicao = 24, RULE_operador1 = 25, RULE_operador2 = 26, 
		RULE_operador_un = 27;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "comando_ultimo", "comando", "comentario", 
		"retorno", "do_decl", "repeat_decl", "for_decl", "if_decl", "log_exp", 
		"funcao_decl", "funcao_corpo", "funcao_chamada", "args", "funcao_nome", 
		"funcao_nome_tabela", "var", "valor", "atr", "lista_valor", "lista_var", 
		"exp", "atribuicao", "operador1", "operador2", "operador_un"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, "'function'", "'if'", "'then'", "'else'", "'repeat'", 
		"'until'", "'for'", "'do'", "'-'", "'+'", "'*'", "'/'", "'nor'", "'#'", 
		"'local'", "'='", null, "'('", "')'", "'end'", "'return'", "'false'", 
		null, "'_'", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ENDL", "FUNCTION", "IF", "THEN", "ELSE", "REPEAT", 
		"UNTIL", "FOR", "DO", "MINUS", "PLUS", "TIMES", "DIVIDED", "NOR", "HASH", 
		"LOCAL", "ATRIBUICAO", "COMPARACAO", "LPAREN", "RPAREN", "END", "RETURN", 
		"FALSE", "COMENTARIO_INICIO", "UNDERSCORE", "DOT", "SEMI_C", "CADEIA", 
		"ID", "NUMERO"
	};
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<Digite os RAs do grupo aqui>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			trecho();
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_ultimoContext comando_ultimo() {
			return getRuleContext(Comando_ultimoContext.class,0);
		}
		public List<TerminalNode> SEMI_C() { return getTokens(LuaParser.SEMI_C); }
		public TerminalNode SEMI_C(int i) {
			return getToken(LuaParser.SEMI_C, i);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << DO) | (1L << LOCAL) | (1L << COMENTARIO_INICIO) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				comando();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_C) {
					{
					setState(59);
					match(SEMI_C);
					}
				}

				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(67);
				comando_ultimo();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_C) {
					{
					setState(68);
					match(SEMI_C);
					}
				}

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

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			trecho();
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

	public static class Comando_ultimoContext extends ParserRuleContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public Comando_ultimoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_ultimo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando_ultimo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando_ultimo(this);
		}
	}

	public final Comando_ultimoContext comando_ultimo() throws RecognitionException {
		Comando_ultimoContext _localctx = new Comando_ultimoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando_ultimo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			retorno();
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

	public static class ComandoContext extends ParserRuleContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public If_declContext if_decl() {
			return getRuleContext(If_declContext.class,0);
		}
		public Funcao_declContext funcao_decl() {
			return getRuleContext(Funcao_declContext.class,0);
		}
		public Funcao_chamadaContext funcao_chamada() {
			return getRuleContext(Funcao_chamadaContext.class,0);
		}
		public Repeat_declContext repeat_decl() {
			return getRuleContext(Repeat_declContext.class,0);
		}
		public Do_declContext do_decl() {
			return getRuleContext(Do_declContext.class,0);
		}
		public For_declContext for_decl() {
			return getRuleContext(For_declContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				atr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				comentario();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				if_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				funcao_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				funcao_chamada();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				repeat_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				do_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				for_decl();
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_INICIO() { return getToken(LuaParser.COMENTARIO_INICIO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(COMENTARIO_INICIO);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LuaParser.RETURN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(RETURN);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(90);
				valor();
				}
				break;
			case 2:
				{
				setState(91);
				exp();
				}
				break;
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

	public static class Do_declContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public Do_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterDo_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitDo_decl(this);
		}
	}

	public final Do_declContext do_decl() throws RecognitionException {
		Do_declContext _localctx = new Do_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_do_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DO);
			setState(95);
			bloco();
			setState(96);
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

	public static class Repeat_declContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(LuaParser.REPEAT, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(LuaParser.UNTIL, 0); }
		public Log_expContext log_exp() {
			return getRuleContext(Log_expContext.class,0);
		}
		public Repeat_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRepeat_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRepeat_decl(this);
		}
	}

	public final Repeat_declContext repeat_decl() throws RecognitionException {
		Repeat_declContext _localctx = new Repeat_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repeat_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(REPEAT);
			setState(99);
			bloco();
			setState(100);
			match(UNTIL);
			setState(101);
			log_exp();
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

	public static class For_declContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LuaParser.FOR, 0); }
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public TerminalNode SEMI_C() { return getToken(LuaParser.SEMI_C, 0); }
		public For_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFor_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFor_decl(this);
		}
	}

	public final For_declContext for_decl() throws RecognitionException {
		For_declContext _localctx = new For_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FOR);
			setState(104);
			atr();
			setState(105);
			match(DO);
			setState(106);
			bloco();
			setState(107);
			match(END);
			setState(108);
			match(SEMI_C);
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

	public static class If_declContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LuaParser.IF, 0); }
		public Log_expContext log_exp() {
			return getRuleContext(Log_expContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LuaParser.THEN, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public TerminalNode ELSE() { return getToken(LuaParser.ELSE, 0); }
		public If_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterIf_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitIf_decl(this);
		}
	}

	public final If_declContext if_decl() throws RecognitionException {
		If_declContext _localctx = new If_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			log_exp();
			setState(112);
			match(THEN);
			setState(113);
			bloco();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(114);
				match(ELSE);
				setState(115);
				bloco();
				}
			}

			setState(118);
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

	public static class Log_expContext extends ParserRuleContext {
		public TerminalNode COMPARACAO() { return getToken(LuaParser.COMPARACAO, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Log_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterLog_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitLog_exp(this);
		}
	}

	public final Log_expContext log_exp() throws RecognitionException {
		Log_expContext _localctx = new Log_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_log_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(120);
				valor();
				}
				break;
			case 2:
				{
				setState(121);
				exp();
				}
				break;
			}
			setState(124);
			match(COMPARACAO);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				valor();
				}
				break;
			case 2:
				{
				setState(126);
				exp();
				}
				break;
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

	public static class Funcao_declContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LuaParser.FUNCTION, 0); }
		public Funcao_nomeContext funcao_nome() {
			return getRuleContext(Funcao_nomeContext.class,0);
		}
		public Funcao_corpoContext funcao_corpo() {
			return getRuleContext(Funcao_corpoContext.class,0);
		}
		public Funcao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao_decl(this);
		}
	}

	public final Funcao_declContext funcao_decl() throws RecognitionException {
		Funcao_declContext _localctx = new Funcao_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FUNCTION);
			setState(130);
			funcao_nome();
			setState(131);
			funcao_corpo();
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

	public static class Funcao_corpoContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LuaParser.LPAREN, 0); }
		public Lista_valorContext lista_valor() {
			return getRuleContext(Lista_valorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuaParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public TerminalNode SEMI_C() { return getToken(LuaParser.SEMI_C, 0); }
		public Funcao_corpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao_corpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao_corpo(this);
		}
	}

	public final Funcao_corpoContext funcao_corpo() throws RecognitionException {
		Funcao_corpoContext _localctx = new Funcao_corpoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcao_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LPAREN);
			setState(134);
			lista_valor();
			setState(135);
			match(RPAREN);
			setState(136);
			bloco();
			setState(137);
			match(END);
			setState(138);
			match(SEMI_C);
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

	public static class Funcao_chamadaContext extends ParserRuleContext {
		public Funcao_nomeContext funcao_nome() {
			return getRuleContext(Funcao_nomeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Funcao_chamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao_chamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao_chamada(this);
		}
	}

	public final Funcao_chamadaContext funcao_chamada() throws RecognitionException {
		Funcao_chamadaContext _localctx = new Funcao_chamadaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcao_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			funcao_nome();
			setState(141);
			args();
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LuaParser.LPAREN, 0); }
		public Lista_valorContext lista_valor() {
			return getRuleContext(Lista_valorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuaParser.RPAREN, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LPAREN);
			setState(144);
			lista_valor();
			setState(145);
			match(RPAREN);
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

	public static class Funcao_nomeContext extends ParserRuleContext {
		public Funcao_nome_tabelaContext funcao_nome_tabela;
		public Funcao_nome_tabelaContext funcao_nome_tabela() {
			return getRuleContext(Funcao_nome_tabelaContext.class,0);
		}
		public Funcao_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao_nome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao_nome(this);
		}
	}

	public final Funcao_nomeContext funcao_nome() throws RecognitionException {
		Funcao_nomeContext _localctx = new Funcao_nomeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcao_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((Funcao_nomeContext)_localctx).funcao_nome_tabela = funcao_nome_tabela();
			 TabelaDeSimbolos.adicionarSimbolo((((Funcao_nomeContext)_localctx).funcao_nome_tabela!=null?_input.getText(((Funcao_nomeContext)_localctx).funcao_nome_tabela.start,((Funcao_nomeContext)_localctx).funcao_nome_tabela.stop):null), Tipo.FUNCAO); 
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

	public static class Funcao_nome_tabelaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LuaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LuaParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(LuaParser.DOT, 0); }
		public Funcao_nome_tabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_nome_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao_nome_tabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao_nome_tabela(this);
		}
	}

	public final Funcao_nome_tabelaContext funcao_nome_tabela() throws RecognitionException {
		Funcao_nome_tabelaContext _localctx = new Funcao_nome_tabelaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcao_nome_tabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(151);
				match(DOT);
				setState(152);
				match(ID);
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

	public static class VarContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((VarContext)_localctx).ID = match(ID);
			 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).ID!=null?((VarContext)_localctx).ID.getText():null), Tipo.VARIAVEL); 
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LuaParser.NUMERO, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Funcao_chamadaContext funcao_chamada() {
			return getRuleContext(Funcao_chamadaContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public TerminalNode FALSE() { return getToken(LuaParser.FALSE, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				funcao_chamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(CADEIA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(FALSE);
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

	public static class AtrContext extends ParserRuleContext {
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public Lista_valorContext lista_valor() {
			return getRuleContext(Lista_valorContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(LuaParser.LOCAL, 0); }
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitAtr(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(165);
				match(LOCAL);
				}
			}

			setState(168);
			lista_var();
			setState(169);
			match(ATRIBUICAO);
			setState(170);
			lista_valor();
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

	public static class Lista_valorContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Lista_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterLista_valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitLista_valor(this);
		}
	}

	public final Lista_valorContext lista_valor() throws RecognitionException {
		Lista_valorContext _localctx = new Lista_valorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lista_valor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(172);
						valor();
						}
						break;
					case 2:
						{
						setState(173);
						exp();
						}
						break;
					}
					setState(176);
					match(T__0);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(183);
				valor();
				}
				break;
			case 2:
				{
				setState(184);
				exp();
				}
				break;
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

	public static class Lista_varContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitLista_var(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lista_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					var();
					setState(188);
					match(T__0);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(195);
			var();
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

	public static class ExpContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public Operador1Context operador1() {
			return getRuleContext(Operador1Context.class,0);
		}
		public Operador2Context operador2() {
			return getRuleContext(Operador2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Operador_unContext operador_un() {
			return getRuleContext(Operador_unContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LuaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LuaParser.RPAREN, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case CADEIA:
			case ID:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				valor();
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
				case PLUS:
					{
					setState(198);
					operador1();
					}
					break;
				case TIMES:
				case DIVIDED:
					{
					setState(199);
					operador2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(202);
					valor();
					}
					break;
				case 2:
					{
					setState(203);
					exp();
					}
					break;
				}
				}
				break;
			case MINUS:
			case NOR:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				operador_un();
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(207);
					valor();
					}
					break;
				case 2:
					{
					setState(208);
					exp();
					}
					break;
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(LPAREN);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(212);
					valor();
					}
					break;
				case 2:
					{
					setState(213);
					exp();
					}
					break;
				}
				setState(216);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ATRIBUICAO() { return getToken(LuaParser.ATRIBUICAO, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ATRIBUICAO);
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

	public static class Operador1Context extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(LuaParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(LuaParser.PLUS, 0); }
		public Operador1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperador1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperador1(this);
		}
	}

	public final Operador1Context operador1() throws RecognitionException {
		Operador1Context _localctx = new Operador1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_operador1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
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

	public static class Operador2Context extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(LuaParser.TIMES, 0); }
		public TerminalNode DIVIDED() { return getToken(LuaParser.DIVIDED, 0); }
		public Operador2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperador2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperador2(this);
		}
	}

	public final Operador2Context operador2() throws RecognitionException {
		Operador2Context _localctx = new Operador2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_operador2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIVIDED) ) {
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

	public static class Operador_unContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(LuaParser.MINUS, 0); }
		public TerminalNode NOR() { return getToken(LuaParser.NOR, 0); }
		public TerminalNode HASH() { return getToken(LuaParser.HASH, 0); }
		public Operador_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_un; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperador_un(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperador_un(this);
		}
	}

	public final Operador_unContext operador_un() throws RecognitionException {
		Operador_unContext _localctx = new Operador_unContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operador_un);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOR) | (1L << HASH))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\5\3?\n\3\7\3"+
		"A\n\3\f\3\16\3D\13\3\3\3\3\3\5\3H\n\3\5\3J\n\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\b\3\b\3\b\5\b_\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\r\3\r\5\r}\n\r\3\r\3\r\3\r\5\r\u0082"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u009c\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00a6\n\25\3\26\5\26\u00a9"+
		"\n\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00b1\n\27\3\27\3\27\7\27\u00b5"+
		"\n\27\f\27\16\27\u00b8\13\27\3\27\3\27\5\27\u00bc\n\27\3\30\3\30\3\30"+
		"\7\30\u00c1\n\30\f\30\16\30\u00c4\13\30\3\30\3\30\3\31\3\31\3\31\5\31"+
		"\u00cb\n\31\3\31\3\31\5\31\u00cf\n\31\3\31\3\31\3\31\5\31\u00d4\n\31\3"+
		"\31\3\31\3\31\5\31\u00d9\n\31\3\31\3\31\5\31\u00dd\n\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\16\17\3\2\20\21\4\2\16\16\22\23\2"+
		"\u00e9\2:\3\2\2\2\4B\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\nW\3\2\2\2\fY\3\2\2"+
		"\2\16[\3\2\2\2\20`\3\2\2\2\22d\3\2\2\2\24i\3\2\2\2\26p\3\2\2\2\30|\3\2"+
		"\2\2\32\u0083\3\2\2\2\34\u0087\3\2\2\2\36\u008e\3\2\2\2 \u0091\3\2\2\2"+
		"\"\u0095\3\2\2\2$\u0098\3\2\2\2&\u009d\3\2\2\2(\u00a5\3\2\2\2*\u00a8\3"+
		"\2\2\2,\u00b6\3\2\2\2.\u00c2\3\2\2\2\60\u00dc\3\2\2\2\62\u00de\3\2\2\2"+
		"\64\u00e0\3\2\2\2\66\u00e2\3\2\2\28\u00e4\3\2\2\2:;\5\4\3\2;\3\3\2\2\2"+
		"<>\5\n\6\2=?\7\37\2\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@<\3\2\2\2AD\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2CI\3\2\2\2DB\3\2\2\2EG\5\b\5\2FH\7\37\2\2GF\3\2"+
		"\2\2GH\3\2\2\2HJ\3\2\2\2IE\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KL\5\4\3\2L\7\3"+
		"\2\2\2MN\5\16\b\2N\t\3\2\2\2OX\5*\26\2PX\5\f\7\2QX\5\26\f\2RX\5\32\16"+
		"\2SX\5\36\20\2TX\5\22\n\2UX\5\20\t\2VX\5\24\13\2WO\3\2\2\2WP\3\2\2\2W"+
		"Q\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\13\3\2\2"+
		"\2YZ\7\34\2\2Z\r\3\2\2\2[^\7\32\2\2\\_\5(\25\2]_\5\60\31\2^\\\3\2\2\2"+
		"^]\3\2\2\2_\17\3\2\2\2`a\7\r\2\2ab\5\6\4\2bc\7\31\2\2c\21\3\2\2\2de\7"+
		"\n\2\2ef\5\6\4\2fg\7\13\2\2gh\5\30\r\2h\23\3\2\2\2ij\7\f\2\2jk\5*\26\2"+
		"kl\7\r\2\2lm\5\6\4\2mn\7\31\2\2no\7\37\2\2o\25\3\2\2\2pq\7\7\2\2qr\5\30"+
		"\r\2rs\7\b\2\2sv\5\6\4\2tu\7\t\2\2uw\5\6\4\2vt\3\2\2\2vw\3\2\2\2wx\3\2"+
		"\2\2xy\7\31\2\2y\27\3\2\2\2z}\5(\25\2{}\5\60\31\2|z\3\2\2\2|{\3\2\2\2"+
		"}~\3\2\2\2~\u0081\7\26\2\2\177\u0082\5(\25\2\u0080\u0082\5\60\31\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2\2\u0083\u0084\7\6\2\2"+
		"\u0084\u0085\5\"\22\2\u0085\u0086\5\34\17\2\u0086\33\3\2\2\2\u0087\u0088"+
		"\7\27\2\2\u0088\u0089\5,\27\2\u0089\u008a\7\30\2\2\u008a\u008b\5\6\4\2"+
		"\u008b\u008c\7\31\2\2\u008c\u008d\7\37\2\2\u008d\35\3\2\2\2\u008e\u008f"+
		"\5\"\22\2\u008f\u0090\5 \21\2\u0090\37\3\2\2\2\u0091\u0092\7\27\2\2\u0092"+
		"\u0093\5,\27\2\u0093\u0094\7\30\2\2\u0094!\3\2\2\2\u0095\u0096\5$\23\2"+
		"\u0096\u0097\b\22\1\2\u0097#\3\2\2\2\u0098\u009b\7!\2\2\u0099\u009a\7"+
		"\36\2\2\u009a\u009c\7!\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"%\3\2\2\2\u009d\u009e\7!\2\2\u009e\u009f\b\24\1\2\u009f\'\3\2\2\2\u00a0"+
		"\u00a6\7\"\2\2\u00a1\u00a6\5&\24\2\u00a2\u00a6\5\36\20\2\u00a3\u00a6\7"+
		" \2\2\u00a4\u00a6\7\33\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6)\3\2\2\2"+
		"\u00a7\u00a9\7\24\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\5.\30\2\u00ab\u00ac\7\25\2\2\u00ac\u00ad\5,\27\2"+
		"\u00ad+\3\2\2\2\u00ae\u00b1\5(\25\2\u00af\u00b1\5\60\31\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\3\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\5(\25\2\u00ba\u00bc\5\60\31\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc-\3\2\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7\3\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5&"+
		"\24\2\u00c6/\3\2\2\2\u00c7\u00ca\5(\25\2\u00c8\u00cb\5\64\33\2\u00c9\u00cb"+
		"\5\66\34\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2"+
		"\u00cc\u00cf\5(\25\2\u00cd\u00cf\5\60\31\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00dd\3\2\2\2\u00d0\u00d3\58\35\2\u00d1\u00d4\5(\25\2\u00d2"+
		"\u00d4\5\60\31\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00dd\3"+
		"\2\2\2\u00d5\u00d8\7\27\2\2\u00d6\u00d9\5(\25\2\u00d7\u00d9\5\60\31\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\7\30\2\2\u00db\u00dd\3\2\2\2\u00dc\u00c7\3\2\2\2\u00dc\u00d0\3\2\2\2"+
		"\u00dc\u00d5\3\2\2\2\u00dd\61\3\2\2\2\u00de\u00df\7\25\2\2\u00df\63\3"+
		"\2\2\2\u00e0\u00e1\t\2\2\2\u00e1\65\3\2\2\2\u00e2\u00e3\t\3\2\2\u00e3"+
		"\67\3\2\2\2\u00e4\u00e5\t\4\2\2\u00e59\3\2\2\2\27>BGIW^v|\u0081\u009b"+
		"\u00a5\u00a8\u00b0\u00b6\u00bb\u00c2\u00ca\u00ce\u00d3\u00d8\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}