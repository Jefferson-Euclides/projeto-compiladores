%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%% 
end |
if | 
then | 
else | 
do | 
until | 
repeat | 
integer | 
real | 
all | 
and | 
or  | 
string | 
Program |
begin |
int |
if |
else |
while {lexeme=yytext(); return Tokens.Reservadas;}
{espaco} {/*Ignore*/}
"{".*"}" {/*Ignore*/}
":=" {return Tokens.Igual;}
"+" {return Tokens.Soma;}
"-" {return Tokens.Subtracao;}
"*" {return Tokens.Multiplicacao;}
"/" {return Tokens.Divisao;}
"<=" {return Tokens.MenorIgual;}
">=" {return Tokens.MaiorIgual;}
"<>" {return Tokens.Diferente;}
">" {return Tokens.Maior;}
"<" {return Tokens.Menor;}
";" {return Tokens.PontoVirgula;}
"." {return Tokens.Ponto;}
"(" {return Tokens.AbreParenteses;}
")" {return Tokens.FechaParenteses;}
"," {return Tokens.Virgula;}
{L}({L}|{D})* {lexeme=yytext(); return Tokens.Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Tokens.Numero;}
 . {return Tokens.ERROR;}