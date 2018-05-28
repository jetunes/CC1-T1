/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


grammar Lua;

@members {
   public static String grupo="<<Digite os RAs do grupo aqui>>";
}


// geral

trecho : comando ';'? | ultimocomando ';'?;

bloco : trecho;

comando :  listavar 'atr' listaexp |
		   chamadadefuncao |
		   'do' bloco 'end' |
		   'while' exp 'do' bloco 'end' |
		    'reapeat' bloco 'until' exp |
		    'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' |
		    'for' var '=' exp ',' exp (',' exp)* 'do' bloco 'end' |
		    'for' listadenomes 'in' listaexp 'do' bloco 'end' |
		    'function' nomedafuncao corpodafuncao
		    { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text,Tipo.FUNCAO); }|
		    'local' 'function' 'nome' corpodafuncao |
		    'local' listadenomes ('atr' listaexp)?;

ultimocomando : 'return' listaexp? | 'break';

nomedafuncao : NOME ('.' NOME)* (':' NOME)?;

listavar : var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } (',' var)*;

var :  NOME | NOME varsufix;

varsufix : '[' exp ']'|'[' exp ']' varsufix |'.' var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); };

listadenomes : NOME (',' NOME)*;

listaexp : exp (',' exp)*;

exp :  'nil' | 'false' | 'true' | NUMERO | CADEIA | '...' | funcao |
	   expprefixo | construtortabela | exp opbin exp | opunaria exp;

expprefixo :  var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } | chamadadefuncao | '(' exp ')';

chamadadefuncao : var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } args | var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } ':' NOME args;

args : '(' listaexp ')' | construtortabela | CADEIA;

funcao : 'function' corpodafuncao;

corpodafuncao : '(' listapar ')' bloco 'end';

listapar : listadenomes (',' '...')? | '...';

construtortabela :  '{' listadecampos '}';

listadecampos : campo (separadordecampos campo)* (separadordecampos)?;

campo : '[' exp ']' '=' exp | NOME '=' exp | exp;

separadordecampos : ',' | ';';

opbin : '+' | '-' | '*' | '/' | '^' | '%' | '..' |
		 '<' | '<=' | '>' | '>=' | '==' | '~=' |
		 'and' | 'or';

opunaria : '-' | 'nor' | '#';

//Pula espaço
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

//Discartar comentarios
LINE_COMMENT
: '--' ~[\r\n]* -> skip
;
NOME : ('a'..'z' | 'A'..'Z')+(('a'..'z' | 'A'..'Z') | ('0'..'9') | '_')*;
//Cadeia de caracteres
CADEIA : '"' (~('\\'|'\''|'"') )* '"'|'\'' (~('\\'|'\''|'"') )* '\'';

NUMERO: ('0'..'9')+;
