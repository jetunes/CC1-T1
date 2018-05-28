package t1;

import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser out = new SaidaParser();
// Descomente as linhas abaixo para testar o analisador gerado.
// Obs: a linha abaixo está configurada para usar como entrada o arquivo lua1.txt
// Modifique-a para testar os demais exemplos
        ANTLRInputStream input = new ANTLRInputStream(TestaAnalisadorSintatico.class.getResourceAsStream("exemplos/lua1.txt"));
        t1.LuaLexer lexer = new t1.LuaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        t1.LuaParser parser = new t1.LuaParser(tokens);
        parser.addErrorListener(new t1.T1ErrorListener(out));
        parser.trecho();
        if (!out.isModificado()) {
            out.println("Fim da analise. Sem erros sintaticos.");
            out.println("Tabela de simbolos:");

            TabelaDeSimbolos.imprimirTabela(out);
            System.out.print(out);
        } else {
            out.println("Fim da analise. Com erros sintaticos.");
        }
    }
}