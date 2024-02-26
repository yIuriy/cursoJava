import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();
        System.out.print("Digite seu ano de nascimento: ");
        int anoDeNascimento = entradaDeDados.nextInt();
        int idadeUsuario = anoAtual - anoDeNascimento;
        if (idadeUsuario < 18) {
            System.out.printf("Sua idade é %d, logo você é MENOR de idade!", idadeUsuario);
        } else {
            System.out.printf("Sua idade é %d, logo você é MAIOR de idade!", idadeUsuario);
        }
    }
}