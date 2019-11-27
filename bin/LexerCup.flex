import java_cup.runtime.*;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacos em branco */
{espaco} {/*Ignore*/}

/* Comentarios */
( "{"*(.)*"}" ) {/*Ignore*/}

/* Barra */
( "\"" ) {return new Symbol(sym.Barra, yychar, yyline, yytext());}

/* Tipos de dados */
( Integer | Real | String ) {return new Symbol(sym.T_dado, yychar, yyline, yytext());}

/* Tipo de dado String */
( String ) {return new Symbol(sym.Cadeia, yychar, yyline, yytext());}

/* Palavra reservada Begin */
( Begin ) {return new Symbol(sym.Begin, yychar, yyline, yytext());}

/* Palavra reservada End */
( End ) {return new Symbol(sym.End, yychar, yyline, yytext());}

/* Palavra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palavra reservada Then */
( then ) {return new Symbol(sym.Then, yychar, yyline, yytext());}

/* Palavra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palavra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palavra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palavra reservada Until */
( until ) {return new Symbol(sym.Until, yychar, yyline, yytext());}

/* Palavra reservada Repeat */
( repeat ) {return new Symbol(sym.Repeat, yychar, yyline, yytext());}

/* Palavra reservada All */
( All ) {return new Symbol(sym.All, yychar, yyline, yytext());}

/* Operador Igual */
( ":=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Soma */
( "+" ) {return new Symbol(sym.Soma, yychar, yyline, yytext());}

/* Operador Subtracao */
( "-" ) {return new Symbol(sym.Subtracao, yychar, yyline, yytext());}

/* Operador Multiplicacao */
( "*" ) {return new Symbol(sym.Multiplicacao, yychar, yyline, yytext());}

/* Operador Divisao */
( "/" ) {return new Symbol(sym.Divisao, yychar, yyline, yytext());}

/* Operadores logicos */
( "and" | "or" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionais */
( ">" | "<" | "=" | ">=" | "<=" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parenteses de abertura */
( "(" ) {return new Symbol(sym.Parenteses_a, yychar, yyline, yytext());}

/* Parenteses de fechamento */
( ")" ) {return new Symbol(sym.Parenteses_f, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "Program" ) {return new Symbol(sym.Program, yychar, yyline, yytext());}

/* Ponto e virgula */
( ";" ) {return new Symbol(sym.PontoVirgula, yychar, yyline, yytext());}

/* Ponto */
( "." ) {return new Symbol(sym.Ponto, yychar, yyline, yytext());}

/* Virgula */
( "," ) {return new Symbol(sym.Virgula, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+|({D}"."{D}) {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Erro de analise */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}