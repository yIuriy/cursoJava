import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void operadorTernario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        byte idade = scanner.nextByte();
        String isMaiorDeIdade = idade > 18 ? "Você é maior de idade." : "Você não é maior de idade.";
        System.out.println(isMaiorDeIdade);
        scanner.close();
    }

    public static void operadorLogico(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        byte idade = scanner.nextByte();
        System.out.println("Você tem carteira de motorista?[true/false]");
        boolean isHabilitado = scanner.nextBoolean();
        if (isHabilitado && idade > 18) {
            System.out.println("Você pode dirigir!");
        } else {
            System.out.println("Você não pode dirigir!");
        }
    }

    public static void main(String[] args) {
        operadorLogico();
    }
}
