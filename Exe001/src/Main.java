import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;
        System.out.printf("A soma entre %d e %d é %d.", n1, n2, soma);

//        System.out.println("Hello World!");
    }
}

// Class and Interface - PascalCase
// package - lowercase
// variables, methods and attributes - camelCase