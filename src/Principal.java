import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        String lexerPath = "C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Lexer.flex";
        gerarLexer(lexerPath);
        gerarCLI();
	}
	
	public static void gerarLexer(String lexerPath){
        File arquivo = new File(lexerPath);
        JFlex.Main.generate(arquivo);
    }
	
	public static String gerarAnaliseLexica(String pathEntrada) {
        try {
            Reader lector = new BufferedReader(new FileReader(pathEntrada));
            
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIM";
                    break;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo não definido\n";
                        break;
                    case Identificador: case Numero: case Reservadas:
                        resultado += lexer.lexeme + ": " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
            
            return resultado;
        } catch (FileNotFoundException ex) {
        	System.out.println("Arquivo de entrada não encontrado");
        } catch (IOException ex) {
        	System.out.println("ERRO!");
        }
        
        return "";
	}
	
	public static void gerarCLI() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String pathEntrada = scan.next();
		
		String tokens = gerarAnaliseLexica(pathEntrada);
		System.out.println(tokens);
	}
}
