import java.lang.Math;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        /*  int numero1 = 3;
         * int numero2 = 5;
         * float media = (float) (numero1 + numero2) / 2;
         * System.out.printf("A média é igual a %.2f\n", media);
         *
         * int numero3 = 10;
         * int valor1 = 5 + ++numero3;
         * System.out.println(valor1);
         *
         *
         * int numero4 = 15;
         * numero4 *= 4;
         * System.out.println(numero4);
         *
         * final double valorPi = Math.PI;
         * System.out.println(valorPi);*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valorPassado = scanner.nextDouble();
        double raizQuadrada = Math.sqrt(valorPassado);
        double raizCubica = Math.cbrt(valorPassado);
        double raizCubicaArredondada = Math.round(raizCubica);

        System.out.printf("A raiz quadrada de %.2f é %.5f\n", valorPassado, raizQuadrada);
        System.out.printf("A raiz cúbica de %.2f é %2.5f\n", valorPassado, raizCubica);
        System.out.printf("A raiz cúbica arredondada de %.2f resulta em %.2f\n", valorPassado, raizCubicaArredondada);

        double numeroAleatorio = Math.random();
        int numero5 = (int) (5 + numeroAleatorio * (10 - 5));
        System.out.printf("Número Aleatório de 5 a 10): %d", numero5);

    }
}
