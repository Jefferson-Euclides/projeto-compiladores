%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r]+
%{
    public String lexeme;
%}
%line
%column
%%

/* Espacos em branco */
{espaco} {/*Ignore*/}

/* Comentarios */
( "{"*(.)*"}" ) {/*Ignore*/}

/* Salto de linha */
( "\n" ) {return Tokens.Linha;}

/* Barra */
( "\"" ) {lexeme=yytext(); return Tokens.Barra;}

/* Tipos de dados */
( Integer | Real | String ) {lexeme=yytext(); return Tokens.T_dado;}

/* Tipo de dado String */
( String ) {lexeme=yytext(); return Tokens.Cadeia;}

/* Palavra reservada Begin */
( Begin ) {lexeme=yytext(); return Tokens.Begin;}

/* Palavra reservada End */
( End ) {lexeme=yytext(); return Tokens.End;}

/* Palavra reservada If */
( if ) {lexeme=yytext(); return Tokens.If;}

/* Palavra reservada Else */
( else ) {lexeme=yytext(); return Tokens.Else;}

/* Palavra reservada Then */
( then ) {lexeme=yytext(); return Tokens.Then;}

/* Palavra reservada While */
( while ) {lexeme=yytext(); return Tokens.While;}

/* Palavra reservada Do */
( do ) {lexeme=yytext(); return Tokens.Do;}

/* Palavra reservada Until */
( until ) {lexeme=yytext(); return Tokens.Until;}

/* Palavra reservada Repeat */
( repeat ) {lexeme=yytext(); return Tokens.Repeat;}

/* Palavra reservada All */
( All ) {lexeme=yytext(); return Tokens.All;}

/* Operador Igual */
( ":=" ) {lexeme=yytext(); return Tokens.Igual;}

/* Operador Soma */
( "+" ) {lexeme=yytext(); return Tokens.Soma;}

/* Operador Subtracao */
( "-" ) {lexeme=yytext(); return Tokens.Subtracao;}

/* Operador Multiplicacao */
( "*" ) {lexeme=yytext(); return Tokens.Multiplicacao;}

/* Operador Divisao */
( "/" ) {lexeme=yytext(); return Tokens.Divisao;}

/* Operadores logicos */
( "and" | "or" ) {lexeme=yytext(); return Tokens.Op_logico;}

/*Operadores Relacionais */
( ">" | "<" | "=" | ">=" | "<=" | "<>") {lexeme = yytext(); return Tokens.Op_relacional;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Tokens.Op_booleano;}

/* Parenteses de abertura */
( "(" ) {lexeme=yytext(); return Tokens.Parenteses_a;}

/* Parenteses de fechamento */
( ")" ) {lexeme=yytext(); return Tokens.Parenteses_f;}

/* Marcador de inicio de algoritmo */
( "Program" ) {lexeme=yytext(); return Tokens.Program;}

/* Ponto e virgula */
( ";" ) {lexeme=yytext(); return Tokens.PontoVirgula;}

/* Ponto */
( "." ) {lexeme=yytext(); return Tokens.Ponto;}

/* Virgula */
( "," ) {lexeme=yytext(); return Tokens.Virgula;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Tokens.Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Tokens.Numero;}

/* Erro na analise */
 . {throw new RuntimeException("Identificador ou simbolo inválido \"" + yytext() + "\" na linha: " + (yyline + 1) + ", coluna: " + (yycolumn + 1));}