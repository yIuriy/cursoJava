import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("%s tem a nota de %.2f.", nome, nota);

        int idade1 = 4;
        String valor1 = Integer.toString(idade1);

        String valor2 = "8";
        int idade2 = Integer.parseInt(valor2);
    }
}
