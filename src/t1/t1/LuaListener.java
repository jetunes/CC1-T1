// Generated from /home/jessica/Área de Trabalho/ufscar/CC1/T1/CC1-T1/src/t1/Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LuaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LuaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando_ultimo}.
	 * @param ctx the parse tree
	 */
	void enterComando_ultimo(LuaParser.Comando_ultimoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando_ultimo}.
	 * @param ctx the parse tree
	 */
	void exitComando_ultimo(LuaParser.Comando_ultimoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LuaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LuaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(LuaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(LuaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#do_decl}.
	 * @param ctx the parse tree
	 */
	void enterDo_decl(LuaParser.Do_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#do_decl}.
	 * @param ctx the parse tree
	 */
	void exitDo_decl(LuaParser.Do_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#repeat_decl}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_decl(LuaParser.Repeat_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#repeat_decl}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_decl(LuaParser.Repeat_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#for_decl}.
	 * @param ctx the parse tree
	 */
	void enterFor_decl(LuaParser.For_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#for_decl}.
	 * @param ctx the parse tree
	 */
	void exitFor_decl(LuaParser.For_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#if_decl}.
	 * @param ctx the parse tree
	 */
	void enterIf_decl(LuaParser.If_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#if_decl}.
	 * @param ctx the parse tree
	 */
	void exitIf_decl(LuaParser.If_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#log_exp}.
	 * @param ctx the parse tree
	 */
	void enterLog_exp(LuaParser.Log_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#log_exp}.
	 * @param ctx the parse tree
	 */
	void exitLog_exp(LuaParser.Log_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao_decl}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_decl(LuaParser.Funcao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao_decl}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_decl(LuaParser.Funcao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao_corpo}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_corpo(LuaParser.Funcao_corpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao_corpo}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_corpo(LuaParser.Funcao_corpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao_chamada}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_chamada(LuaParser.Funcao_chamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao_chamada}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_chamada(LuaParser.Funcao_chamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LuaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao_nome}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_nome(LuaParser.Funcao_nomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao_nome}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_nome(LuaParser.Funcao_nomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao_nome_tabela}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_nome_tabela(LuaParser.Funcao_nome_tabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao_nome_tabela}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_nome_tabela(LuaParser.Funcao_nome_tabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(LuaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(LuaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(LuaParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(LuaParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#lista_valor}.
	 * @param ctx the parse tree
	 */
	void enterLista_valor(LuaParser.Lista_valorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#lista_valor}.
	 * @param ctx the parse tree
	 */
	void exitLista_valor(LuaParser.Lista_valorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(LuaParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(LuaParser.Lista_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LuaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(LuaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(LuaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operador1}.
	 * @param ctx the parse tree
	 */
	void enterOperador1(LuaParser.Operador1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operador1}.
	 * @param ctx the parse tree
	 */
	void exitOperador1(LuaParser.Operador1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operador2}.
	 * @param ctx the parse tree
	 */
	void enterOperador2(LuaParser.Operador2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operador2}.
	 * @param ctx the parse tree
	 */
	void exitOperador2(LuaParser.Operador2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#operador_un}.
	 * @param ctx the parse tree
	 */
	void enterOperador_un(LuaParser.Operador_unContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#operador_un}.
	 * @param ctx the parse tree
	 */
	void exitOperador_un(LuaParser.Operador_unContext ctx);
}