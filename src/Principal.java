import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java_cup.internal_error;
import java_cup.runtime.Symbol;

public class Principal {
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws internal_error, IOException, Exception {
		
		String lexerPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Lexer.flex";
		String lexerCupPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/LexerCup.flex";
		String sintaxCupPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Sintax.cup";
		String[] sintatico = { "-parser", "Sintax", sintaxCupPath };

		gerar(lexerPath, lexerCupPath, sintatico);
		gerarCLI();
	}

	private static void gerarCLI() throws FileNotFoundException {
		String retorno = "";

		System.out.println("Digite o caminho do arquivo de entrada: ");
		String path = scan.next();
		
		System.out.println("\n\n");
		try {			
			analiseLexica("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/teste");
			System.out.println("\n\n");
			analiseSintatica("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/teste");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void gerar(String lexerPath, String lexerCupPath, String[] sintatico)
			throws internal_error, IOException, Exception {
		File arquivo;
		arquivo = new File(lexerPath);
		JFlex.Main.generate(arquivo);

		arquivo = new File(lexerCupPath);
		JFlex.Main.generate(arquivo);

		java_cup.Main.main(sintatico);

		Path rotaSym = Paths.get("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/sym.java");

		if (Files.exists(rotaSym)) {
			Files.delete(rotaSym);
		}

		Files.move(Paths.get("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/sym.java"),
				Paths.get("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/sym.java"));

		Path rotaSin = Paths.get("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Sintax.java");

		if (Files.exists(rotaSin)) {
			Files.delete(rotaSin);
		}

		Files.move(Paths.get("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/Sintax.java"),
				Paths.get("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Sintax.java"));
	}
	
	public static void analiseSintatica(String path) throws FileNotFoundException {
		Reader lector = new BufferedReader(new FileReader(path));
		
		Sintax s = new Sintax(new LexerCup(lector));
		
		try {
			s.parse();
			System.out.println("Compilação finalizada com sucesso.");
		} catch (Exception e) {
			Symbol sym = s.getS();
			System.out.println("Erro de sintáxe. Linha: " + (sym.right + 1) + " Coluna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
		}
	}

	public static void analiseLexica(String path) throws RuntimeException, IOException {
		int cont = 1;
		Reader lector = new BufferedReader(new FileReader(path));

		Lexer lexer = new Lexer(lector);
		String resultado = "LINHA " + cont + "\t\t\t\tSIMBOLO\n";
		while (true) {
			Tokens token;
			token = lexer.yylex();

			if (token == null) {
				resultado += "FIM";
				break;
			}
			switch (token) {
			case Linha:
				cont++;
				resultado += "LINHA " + cont + "\n";
				break;
			case Barra:
				resultado += "  <Barras>\t\t" + lexer.lexeme + "\n";
				break;
			case Cadeia:
				resultado += "  <Tipo de dado>\t" + lexer.lexeme + "\n";
				break;
			case T_dado:
				resultado += "  <Tipo de dado>\t" + lexer.lexeme + "\n";
				break;
			case If:
				resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
				break;
			case Else:
				resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
				break;
			case Do:
				resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
				break;
			case While:
				resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
				break;
			case Igual:
				resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
				break;
			case Soma:
				resultado += "  <Operador soma>\t" + lexer.lexeme + "\n";
				break;
			case Subtracao:
				resultado += "  <Operador subtracao>\t" + lexer.lexeme + "\n";
				break;
			case Multiplicacao:
				resultado += "  <Operador multiplicacao>\t" + lexer.lexeme + "\n";
				break;
			case Divisao:
				resultado += "  <Operador divisao>\t" + lexer.lexeme + "\n";
				break;
			case Op_logico:
				resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
				break;
			case Op_relacional:
				resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
				break;
			case Op_booleano:
				resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
				break;
			case Parenteses_a:
				resultado += "  <Parenteses de abertura>\t" + lexer.lexeme + "\n";
				break;
			case Parenteses_f:
				resultado += "  <Parenteses de fechamento>\t" + lexer.lexeme + "\n";
				break;
			case Program:
				resultado += "  <Reservada program>\t" + lexer.lexeme + "\n";
				break;
			case PontoVirgula:
				resultado += "  <Ponto e virgula>\t" + lexer.lexeme + "\n";
				break;
			case Identificador:
				resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
				break;
			case Numero:
				resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
				break;
			case ERROR:
				resultado += "  <IDENTIFICADOR OU SIMBOLO INVÁLIDO>\n";
				break;
			default:
				resultado += "  < " + lexer.lexeme + " >\n";
				break;
			}
		}
		
		System.out.println(resultado);
	}

}
