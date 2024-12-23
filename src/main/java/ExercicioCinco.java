import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioCinco {

        public void solucao() {
            List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
            System.out.println(converterEmails(emails));
// Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]
        }

        public List<String> converterEmails(List<String> emails) {
            return emails.stream().map(String::toLowerCase).toList();

        }
    }
