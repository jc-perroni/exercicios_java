public class ExercicioTres {

    public static void solucao() {
        System.out.println("""
                    3 - Implemente um método que recebe uma String representando um nome completo separado por espaços.
                    O método deve retornar o primeiro e o último nome após remover os espaços desnecessários.
                """);

                System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
                System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

            }

            public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
                String[] nomeDividido = nomeCompleto.trim().split(" ");
                return nomeDividido.length > 1 ? (nomeDividido[0] + " " + nomeDividido[nomeDividido.length - 1]): nomeDividido[0];

    }

}
