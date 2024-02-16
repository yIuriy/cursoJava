import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite a operação desejada: ");
        System.out.println("[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão");
        int opcaoEscolhida = scanner.nextInt();
        switch (opcaoEscolhida) {
            case 1:
                int soma = n1 + n2;
                System.out.printf("A soma entre %d e %d é %d", n1, n2, soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                System.out.printf("A subtracão entre %d e %d é %d", n1, n2, subtracao);
                break;
            case 3:
                int multiplicacao = n1 * n2;
                System.out.printf("A multiplicacão entre %d e %d é %d", n1, n2, multiplicacao);
                break;
            case 4:
                int divisao = n1 / n2;
                System.out.printf("A divisâo entre %d e %d é %d", n1, n2, divisao);
                break;
            default:
                System.out.println("Número inválido!");

        }


    }
}
