public class ExercicioSete {

    public enum Moedas{

        DOLAR(6.19),
        EURO(7.01),
        ;

        private final double cotacao;
        Moedas(double cotacao) {
            this.cotacao = cotacao;
        }
        public double converterPara(double valorEmReais) {
            return cotacao * valorEmReais;
        }
    }
        public void solucao() {
            System.out.println("Dólar " + Moedas.DOLAR.converterPara(100)); // 19.60 (aproximado)
            System.out.println("Euro " + Moedas.EURO.converterPara(100)); // 18.18 (aproximado)

        }

    }
