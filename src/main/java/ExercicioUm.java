import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioUm {

    public static void solucao() {

        System.out.println("""
                1 - Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não. 
                Queremos converter a lista de strings para uma lista de números. 
                Se a conversão falhar, você deve ignorar o valor. 
                Por exemplo, na lista a seguir, a saída deve ser [10, 20]:
                List<String> input = Arrays.asList("10", "abc", "20", "30x");
                """);
        System.out.println("---------\nSOLUÇÃO\n");

        List<String> input = Arrays.asList("10", "abc", "20", "30x");
        List<Integer> output = new ArrayList<>();
        for (String i : input) {
            try {
                output.add(Integer.valueOf(i));
            } catch (Exception e) {
                System.out.println(i + " não é número.");
            }
        }
        System.out.println(output);

    }
}
