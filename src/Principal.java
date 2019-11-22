import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java_cup.internal_error;

public class Principal {

	public static void main(String[] args) throws internal_error, IOException, Exception {
		String lexerPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Lexer.flex";
		String lexerCupPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/LexerCup.flex";
		String sintaxCupPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Sintax.cup";
		String[] sintatico = { "-parser", "Sintax", sintaxCupPath };

		gerar(lexerPath, lexerCupPath, sintatico);
		gerarCLI();
	}

	private static void gerarCLI() throws IOException {
		String retorno = "";
		//Scanner scan = new Scanner(System.in);

		//System.out.println("Digite o caminho do arquivo de entrada: ");

		retorno = analiseLexica("C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/teste");
		System.out.println(retorno);
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

	public static String analiseLexica(String path) throws FileNotFoundException {
		int cont = 1;
		Reader lector = new BufferedReader(new FileReader(path));
		
		Lexer lexer = new Lexer(lector);
		String resultado = "LINEA " + cont + "\t\t\t\tSIMBOLO\n";
		while (true) {
			Tokens token;
			try {
				token = lexer.yylex();

				if (token == null) {
					resultado += "FIM";
					break;
				}
				switch (token) {
					case Linha:
						cont++;
						resultado += "LINEA " + cont + "\n";
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
						resultado += "  <Simbolo não definido>\n";
						break;
					default:
						resultado += "  < " + lexer.lexeme + " >\n";
						break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}

}
