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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, WS=50, LINE_COMMENT=51, NOME=52, 
		CADEIA=53, NUMERO=54;
	public static final int
		RULE_trecho = 0, RULE_bloco = 1, RULE_comando = 2, RULE_ultimocomando = 3, 
		RULE_nomedafuncao = 4, RULE_listavar = 5, RULE_var = 6, RULE_varsufix = 7, 
		RULE_listadenomes = 8, RULE_listaexp = 9, RULE_exp = 10, RULE_expprefixo = 11, 
		RULE_chamadadefuncao = 12, RULE_args = 13, RULE_funcao = 14, RULE_corpodafuncao = 15, 
		RULE_listapar = 16, RULE_construtortabela = 17, RULE_listadecampos = 18, 
		RULE_campo = 19, RULE_separadordecampos = 20, RULE_opbin = 21, RULE_opunaria = 22;
	public static final String[] ruleNames = {
		"trecho", "bloco", "comando", "ultimocomando", "nomedafuncao", "listavar", 
		"var", "varsufix", "listadenomes", "listaexp", "exp", "expprefixo", "chamadadefuncao", 
		"args", "funcao", "corpodafuncao", "listapar", "construtortabela", "listadecampos", 
		"campo", "separadordecampos", "opbin", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'atr'", "'do'", "'end'", "'while'", "'reapeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "'='", "','", "'in'", 
		"'function'", "'local'", "'nome'", "'return'", "'break'", "'.'", "':'", 
		"'['", "']'", "'nil'", "'false'", "'true'", "'...'", "'('", "')'", "'{'", 
		"'}'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'..'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'~='", "'and'", "'or'", "'nor'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "LINE_COMMENT", "NOME", "CADEIA", "NUMERO"
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
	public static class TrechoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
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
		enterRule(_localctx, 0, RULE_trecho);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__5:
			case T__7:
			case T__11:
			case T__15:
			case T__16:
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				comando();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(47);
					match(T__0);
					}
				}

				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				ultimocomando();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(51);
					match(T__0);
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
		enterRule(_localctx, 2, RULE_bloco);
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

	public static class ComandoContext extends ParserRuleContext {
		public NomedafuncaoContext nomedafuncao;
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
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
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				listavar();
				setState(59);
				match(T__1);
				setState(60);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__2);
				setState(64);
				bloco();
				setState(65);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(T__4);
				setState(68);
				exp(0);
				setState(69);
				match(T__2);
				setState(70);
				bloco();
				setState(71);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(T__5);
				setState(74);
				bloco();
				setState(75);
				match(T__6);
				setState(76);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				match(T__7);
				setState(79);
				exp(0);
				setState(80);
				match(T__8);
				setState(81);
				bloco();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(82);
					match(T__9);
					setState(83);
					exp(0);
					setState(84);
					match(T__8);
					setState(85);
					bloco();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(92);
					match(T__10);
					setState(93);
					bloco();
					}
				}

				setState(96);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(T__11);
				setState(99);
				var();
				setState(100);
				match(T__12);
				setState(101);
				exp(0);
				setState(102);
				match(T__13);
				setState(103);
				exp(0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(104);
					match(T__13);
					setState(105);
					exp(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__2);
				setState(112);
				bloco();
				setState(113);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				match(T__11);
				setState(116);
				listadenomes();
				setState(117);
				match(T__14);
				setState(118);
				listaexp();
				setState(119);
				match(T__2);
				setState(120);
				bloco();
				setState(121);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				match(T__15);
				setState(124);
				((ComandoContext)_localctx).nomedafuncao = nomedafuncao();
				setState(125);
				corpodafuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomedafuncao!=null?_input.getText(((ComandoContext)_localctx).nomedafuncao.start,((ComandoContext)_localctx).nomedafuncao.stop):null),Tipo.FUNCAO); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(T__16);
				setState(129);
				match(T__15);
				setState(130);
				match(T__17);
				setState(131);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				match(T__16);
				setState(133);
				listadenomes();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(134);
					match(T__1);
					setState(135);
					listaexp();
					}
				}

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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ultimocomando);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__18);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__33) | (1L << T__47) | (1L << T__48) | (1L << NOME) | (1L << CADEIA) | (1L << NUMERO))) != 0)) {
					{
					setState(141);
					listaexp();
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__19);
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(NOME);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(148);
				match(T__20);
				setState(149);
				match(NOME);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(155);
				match(T__21);
				setState(156);
				match(NOME);
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

	public static class ListavarContext extends ParserRuleContext {
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((ListavarContext)_localctx).var = var();
			 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(161);
				match(T__13);
				setState(162);
				((ListavarContext)_localctx).var = var();
				}
				}
				setState(167);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public VarsufixContext varsufix() {
			return getRuleContext(VarsufixContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_var);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(NOME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(NOME);
				setState(170);
				varsufix();
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

	public static class VarsufixContext extends ParserRuleContext {
		public VarContext var;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarsufixContext varsufix() {
			return getRuleContext(VarsufixContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarsufixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsufix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarsufix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarsufix(this);
		}
	}

	public final VarsufixContext varsufix() throws RecognitionException {
		VarsufixContext _localctx = new VarsufixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varsufix);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__22);
				setState(174);
				exp(0);
				setState(175);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__22);
				setState(178);
				exp(0);
				setState(179);
				match(T__23);
				setState(180);
				varsufix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__20);
				setState(183);
				((VarsufixContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((VarsufixContext)_localctx).var!=null?_input.getText(((VarsufixContext)_localctx).var.start,((VarsufixContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
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

	public static class ListadenomesContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(NOME);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(T__13);
					setState(190);
					match(NOME);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			exp(0);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(197);
				match(T__13);
				setState(198);
				exp(0);
				}
				}
				setState(203);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LuaParser.NUMERO, 0); }
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
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
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(205);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(206);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(207);
				match(T__26);
				}
				break;
			case NUMERO:
				{
				setState(208);
				match(NUMERO);
				}
				break;
			case CADEIA:
				{
				setState(209);
				match(CADEIA);
				}
				break;
			case T__27:
				{
				setState(210);
				match(T__27);
				}
				break;
			case T__15:
				{
				setState(211);
				funcao();
				}
				break;
			case T__28:
			case NOME:
				{
				setState(212);
				expprefixo();
				}
				break;
			case T__30:
				{
				setState(213);
				construtortabela();
				}
				break;
			case T__33:
			case T__47:
			case T__48:
				{
				setState(214);
				opunaria();
				setState(215);
				exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(219);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(220);
					opbin();
					setState(221);
					exp(3);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expprefixo);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				((ExpprefixoContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ExpprefixoContext)_localctx).var!=null?_input.getText(((ExpprefixoContext)_localctx).var.start,((ExpprefixoContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__28);
				setState(233);
				exp(0);
				setState(234);
				match(T__29);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamadadefuncao);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((ChamadadefuncaoContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadadefuncaoContext)_localctx).var!=null?_input.getText(((ChamadadefuncaoContext)_localctx).var.start,((ChamadadefuncaoContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				setState(240);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((ChamadadefuncaoContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadadefuncaoContext)_localctx).var!=null?_input.getText(((ChamadadefuncaoContext)_localctx).var.start,((ChamadadefuncaoContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				setState(244);
				match(T__21);
				setState(245);
				match(NOME);
				setState(246);
				args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
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
		enterRule(_localctx, 26, RULE_args);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__28);
				setState(251);
				listaexp();
				setState(252);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				construtortabela();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(CADEIA);
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__15);
			setState(259);
			corpodafuncao();
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_corpodafuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__28);
			setState(262);
			listapar();
			setState(263);
			match(T__29);
			setState(264);
			bloco();
			setState(265);
			match(T__3);
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

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listapar);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				listadenomes();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(268);
					match(T__13);
					setState(269);
					match(T__27);
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__27);
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

	public static class ConstrutortabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutortabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtortabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutortabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutortabela(this);
		}
	}

	public final ConstrutortabelaContext construtortabela() throws RecognitionException {
		ConstrutortabelaContext _localctx = new ConstrutortabelaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_construtortabela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__30);
			setState(276);
			listadecampos();
			setState(277);
			match(T__31);
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

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			campo();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					separadordecampos();
					setState(281);
					campo();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__13) {
				{
				setState(288);
				separadordecampos();
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_campo);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__22);
				setState(292);
				exp(0);
				setState(293);
				match(T__23);
				setState(294);
				match(T__12);
				setState(295);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(NOME);
				setState(298);
				match(T__12);
				setState(299);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				exp(0);
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__13) ) {
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

	public static class OpbinContext extends ParserRuleContext {
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbin(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunaria(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__47) | (1L << T__48))) != 0)) ) {
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
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\2\3\2\5\2\67\n\2\5\29\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\5\4a\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u008b\n\4\5\4\u008d\n\4\3\5\3\5\5\5\u0091\n\5\3"+
		"\5\5\5\u0094\n\5\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6"+
		"\5\6\u00a0\n\6\3\7\3\7\3\7\3\7\7\7\u00a6\n\7\f\7\16\7\u00a9\13\7\3\b\3"+
		"\b\3\b\5\b\u00ae\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00bd\n\t\3\n\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\13\3"+
		"\13\3\13\7\13\u00ca\n\13\f\13\16\13\u00cd\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00dc\n\f\3\f\3\f\3\f\3\f\7\f\u00e2"+
		"\n\f\f\f\16\f\u00e5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ef\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fb\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0103\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0111\n\22\3\22\5\22\u0114\n\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u011e\n\24\f\24\16\24\u0121"+
		"\13\24\3\24\5\24\u0124\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0130\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\3\26\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\4\2\3\3\20\20\3\2"+
		"#\61\4\2$$\62\63\2\u0150\28\3\2\2\2\4:\3\2\2\2\6\u008c\3\2\2\2\b\u0093"+
		"\3\2\2\2\n\u0095\3\2\2\2\f\u00a1\3\2\2\2\16\u00ad\3\2\2\2\20\u00bc\3\2"+
		"\2\2\22\u00be\3\2\2\2\24\u00c6\3\2\2\2\26\u00db\3\2\2\2\30\u00ee\3\2\2"+
		"\2\32\u00fa\3\2\2\2\34\u0102\3\2\2\2\36\u0104\3\2\2\2 \u0107\3\2\2\2\""+
		"\u0113\3\2\2\2$\u0115\3\2\2\2&\u0119\3\2\2\2(\u012f\3\2\2\2*\u0131\3\2"+
		"\2\2,\u0133\3\2\2\2.\u0135\3\2\2\2\60\62\5\6\4\2\61\63\7\3\2\2\62\61\3"+
		"\2\2\2\62\63\3\2\2\2\639\3\2\2\2\64\66\5\b\5\2\65\67\7\3\2\2\66\65\3\2"+
		"\2\2\66\67\3\2\2\2\679\3\2\2\28\60\3\2\2\28\64\3\2\2\29\3\3\2\2\2:;\5"+
		"\2\2\2;\5\3\2\2\2<=\5\f\7\2=>\7\4\2\2>?\5\24\13\2?\u008d\3\2\2\2@\u008d"+
		"\5\32\16\2AB\7\5\2\2BC\5\4\3\2CD\7\6\2\2D\u008d\3\2\2\2EF\7\7\2\2FG\5"+
		"\26\f\2GH\7\5\2\2HI\5\4\3\2IJ\7\6\2\2J\u008d\3\2\2\2KL\7\b\2\2LM\5\4\3"+
		"\2MN\7\t\2\2NO\5\26\f\2O\u008d\3\2\2\2PQ\7\n\2\2QR\5\26\f\2RS\7\13\2\2"+
		"S[\5\4\3\2TU\7\f\2\2UV\5\26\f\2VW\7\13\2\2WX\5\4\3\2XZ\3\2\2\2YT\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2][\3\2\2\2^_\7\r\2\2_a\5\4"+
		"\3\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\6\2\2c\u008d\3\2\2\2de\7\16\2\2"+
		"ef\5\16\b\2fg\7\17\2\2gh\5\26\f\2hi\7\20\2\2in\5\26\f\2jk\7\20\2\2km\5"+
		"\26\f\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr"+
		"\7\5\2\2rs\5\4\3\2st\7\6\2\2t\u008d\3\2\2\2uv\7\16\2\2vw\5\22\n\2wx\7"+
		"\21\2\2xy\5\24\13\2yz\7\5\2\2z{\5\4\3\2{|\7\6\2\2|\u008d\3\2\2\2}~\7\22"+
		"\2\2~\177\5\n\6\2\177\u0080\5 \21\2\u0080\u0081\b\4\1\2\u0081\u008d\3"+
		"\2\2\2\u0082\u0083\7\23\2\2\u0083\u0084\7\22\2\2\u0084\u0085\7\24\2\2"+
		"\u0085\u008d\5 \21\2\u0086\u0087\7\23\2\2\u0087\u008a\5\22\n\2\u0088\u0089"+
		"\7\4\2\2\u0089\u008b\5\24\13\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008d\3\2\2\2\u008c<\3\2\2\2\u008c@\3\2\2\2\u008cA\3\2\2\2\u008c"+
		"E\3\2\2\2\u008cK\3\2\2\2\u008cP\3\2\2\2\u008cd\3\2\2\2\u008cu\3\2\2\2"+
		"\u008c}\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0086\3\2\2\2\u008d\7\3\2\2"+
		"\2\u008e\u0090\7\25\2\2\u008f\u0091\5\24\13\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0094\7\26\2\2\u0093\u008e\3"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094\t\3\2\2\2\u0095\u009a\7\66\2\2\u0096"+
		"\u0097\7\27\2\2\u0097\u0099\7\66\2\2\u0098\u0096\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u00a0\7\66\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\5\16\b\2\u00a2"+
		"\u00a7\b\7\1\2\u00a3\u00a4\7\20\2\2\u00a4\u00a6\5\16\b\2\u00a5\u00a3\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\r\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ae\7\66\2\2\u00ab\u00ac\7\66\2"+
		"\2\u00ac\u00ae\5\20\t\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\17\3\2\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\7\32"+
		"\2\2\u00b2\u00bd\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5\5\26\f\2\u00b5"+
		"\u00b6\7\32\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\7"+
		"\27\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\b\t\1\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00af\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\21\3\2\2"+
		"\2\u00be\u00c3\7\66\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c2\7\66\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\23\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5\26\f\2\u00c7\u00c8"+
		"\7\20\2\2\u00c8\u00ca\5\26\f\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\25\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\b\f\1\2\u00cf\u00dc\7\33\2\2\u00d0\u00dc\7\34\2\2"+
		"\u00d1\u00dc\7\35\2\2\u00d2\u00dc\78\2\2\u00d3\u00dc\7\67\2\2\u00d4\u00dc"+
		"\7\36\2\2\u00d5\u00dc\5\36\20\2\u00d6\u00dc\5\30\r\2\u00d7\u00dc\5$\23"+
		"\2\u00d8\u00d9\5.\30\2\u00d9\u00da\5\26\f\3\u00da\u00dc\3\2\2\2\u00db"+
		"\u00ce\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d1\3\2\2\2\u00db\u00d2\3\2"+
		"\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d5\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00e3\3\2"+
		"\2\2\u00dd\u00de\f\4\2\2\u00de\u00df\5,\27\2\u00df\u00e0\5\26\f\5\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7"+
		"\5\16\b\2\u00e7\u00e8\b\r\1\2\u00e8\u00ef\3\2\2\2\u00e9\u00ef\5\32\16"+
		"\2\u00ea\u00eb\7\37\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7 \2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2"+
		"\2\2\u00ef\31\3\2\2\2\u00f0\u00f1\5\16\b\2\u00f1\u00f2\b\16\1\2\u00f2"+
		"\u00f3\5\34\17\2\u00f3\u00fb\3\2\2\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6"+
		"\b\16\1\2\u00f6\u00f7\7\30\2\2\u00f7\u00f8\7\66\2\2\u00f8\u00f9\5\34\17"+
		"\2\u00f9\u00fb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fb\33"+
		"\3\2\2\2\u00fc\u00fd\7\37\2\2\u00fd\u00fe\5\24\13\2\u00fe\u00ff\7 \2\2"+
		"\u00ff\u0103\3\2\2\2\u0100\u0103\5$\23\2\u0101\u0103\7\67\2\2\u0102\u00fc"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\35\3\2\2\2\u0104"+
		"\u0105\7\22\2\2\u0105\u0106\5 \21\2\u0106\37\3\2\2\2\u0107\u0108\7\37"+
		"\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7 \2\2\u010a\u010b\5\4\3\2\u010b"+
		"\u010c\7\6\2\2\u010c!\3\2\2\2\u010d\u0110\5\22\n\2\u010e\u010f\7\20\2"+
		"\2\u010f\u0111\7\36\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0114\7\36\2\2\u0113\u010d\3\2\2\2\u0113\u0112\3"+
		"\2\2\2\u0114#\3\2\2\2\u0115\u0116\7!\2\2\u0116\u0117\5&\24\2\u0117\u0118"+
		"\7\"\2\2\u0118%\3\2\2\2\u0119\u011f\5(\25\2\u011a\u011b\5*\26\2\u011b"+
		"\u011c\5(\25\2\u011c\u011e\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0124\5*\26\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\'\3\2\2\2\u0125\u0126\7\31\2\2\u0126\u0127\5\26\f\2\u0127\u0128"+
		"\7\32\2\2\u0128\u0129\7\17\2\2\u0129\u012a\5\26\f\2\u012a\u0130\3\2\2"+
		"\2\u012b\u012c\7\66\2\2\u012c\u012d\7\17\2\2\u012d\u0130\5\26\f\2\u012e"+
		"\u0130\5\26\f\2\u012f\u0125\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012e\3"+
		"\2\2\2\u0130)\3\2\2\2\u0131\u0132\t\2\2\2\u0132+\3\2\2\2\u0133\u0134\t"+
		"\3\2\2\u0134-\3\2\2\2\u0135\u0136\t\4\2\2\u0136/\3\2\2\2\35\62\668[`n"+
		"\u008a\u008c\u0090\u0093\u009a\u009f\u00a7\u00ad\u00bc\u00c3\u00cb\u00db"+
		"\u00e3\u00ee\u00fa\u0102\u0110\u0113\u011f\u0123\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}