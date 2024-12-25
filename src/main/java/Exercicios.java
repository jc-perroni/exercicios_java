
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("""
        Entre com o número do exercício: 
        1 - Conversão de array para array de números.
        2 - Utilização de Optional
        3 - Strings primeiro e ultimo
        4 - Palindromos
        5 - Stream lowercase
        6 - Enum meses do ano
        7 - Cotação de moedas
        """);
        int resposta = s.nextInt();

        switch (resposta){
            case 1 -> ExercicioUm.solucao();
            case 2 -> ExercicioDois.solucao();
            case 3 -> ExercicioTres.solucao();
            case 4 -> ExercicioQuatro.solucao();
            case 5 -> exercicioCinco();
            case 6 -> exercicioSeis();
            case 7 -> exercicioSete();
            default -> System.out.println("Exercício não cadastrado.");
        }
    }
    private static void exercicioCinco(){
        ExercicioCinco exercicio = new ExercicioCinco();
        exercicio.solucao();
    }

    private static void exercicioSeis(){
        ExercicioSeis exercicio = new ExercicioSeis();
        exercicio.solucao();
    }

    private static void exercicioSete() {
        ExercicioSete exercicio = new ExercicioSete();
        exercicio.solucao();
    }
}
