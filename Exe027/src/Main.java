import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, somaDosNumeros = 0;
        String resposta;
        Scanner entradaDeDados = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            numero = entradaDeDados.nextInt();
            somaDosNumeros += numero;
            System.out.println("Quer continuar? [S/N]");
            resposta = entradaDeDados.next();
        }
        while (resposta.equals("S"));
        System.out.printf("A soma de todos os números digitados é %d", somaDosNumeros);
    }

}