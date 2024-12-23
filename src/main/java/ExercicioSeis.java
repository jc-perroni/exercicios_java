import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioSeis {

    public enum Meses {
        Janeiro(1),
        Fevereiro(2),
        Março(3),
        Abril(4),
        Maior(5),
        Junho(6),
        Julho(7),
        Agosto(8),
        Setembro(9),
        Outubro(10),
        Novembro(11),
        Dezembro(12);

        private final int numero;

        Meses(int numero) {
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }

        public Month toMonth() {
            return Month.of(numero);
        }

        public int diasMes(int ano) {
            return Month.of(numero).length(Year.isLeap(ano));
        }

        }
    public void solucao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o ano a ser verificado (aaaa): ");
        int ano = sc.nextInt();
        if (Meses.Fevereiro.diasMes(ano) > 28){
            System.out.printf("O ano %d é bissexto. Seus meses têm a seguinte quantidade de dias: \n", ano);
        }
        else {
            System.out.println(ano + " não é bissexto e tem as seguintes quantidades de dias: ");
        }
        for (Meses m : Meses.values()){
            System.out.println(m.name() + " -> " +  m.diasMes(ano));
        }

        sc.close();

    }



}
