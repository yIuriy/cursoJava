import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter padraoFormatacao = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime horaAtual = LocalTime.now();
        String horaFormatada = horaAtual.format(padraoFormatacao);
        System.out.printf("A hora atual é: " + horaFormatada);
    }
}