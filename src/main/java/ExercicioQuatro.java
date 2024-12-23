import java.util.Scanner;

public class ExercicioQuatro {

public static void solucao() {

    System.out.println("""
            4 - Implemente um método que verifica se uma frase é um palíndromo. 
            Um palíndromo é uma palavra/frase que, quando lida de trás pra frente, é igual à leitura normal.
            Um exemplo:
            """);
            System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
            System.out.println(ehPalindromo("Java")); // Saída: false

            Scanner sc = new Scanner(System.in);

            String phrase = "";
            while(!phrase.equalsIgnoreCase("sair")){
                System.out.println("Digite sua frase para verificação ou sair: ");
                phrase = sc.nextLine();
                System.out.println(ehPalindromo(phrase.toLowerCase()));
            }

        }
        public static String ehPalindromo(String palavra) {
            palavra = palavra.replaceAll(" ", "");
            StringBuilder reversedWord = new StringBuilder().append(palavra).reverse();
            return palavra.trim().contentEquals(reversedWord) ? palavra + " is Palindromo": palavra + " is NOT Palindromo";

        }

    }
