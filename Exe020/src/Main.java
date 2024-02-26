import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float valor1 = entradaDeDados.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float valor2 = entradaDeDados.nextFloat();

        float valorMedia = (valor1 + valor2) / 2;
        System.out.printf("Sua média é de : %.2f \n", valorMedia);
        if (valorMedia > 9) {
            System.out.println("Parabéns!");
        }
    }
}