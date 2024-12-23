import java.util.Optional;

public class ExercicioDois {

    public static void solucao() {

        System.out.println("""
                2 - Implemente um método que recebe um número inteiro dentro de um Optional. 
                Se o número estiver presente e for positivo, calcule seu quadrado. 
                Caso contrário, retorne Optional.empty.
                """);
        System.out.println("---------\nSOLUÇÃO\n");
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty

    }
    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        return numero.filter(s -> s >0).map(s-> s*s);
    }
}
