import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*
*        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
               "Novembro", "Dezembro"};
        int[] diasNoMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,};

        for (String mes : meses) {
            int count = 0;
            System.out.printf("O mês %s tem %d dias \n", mes, diasNoMeses[count]);
            count++;
        }
*/
        int[] numeros = {2, 6, 2, 6, 8, 2, 8, 4, 9, 6, 12,};
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int posicao = Arrays.binarySearch(numeros, 9);
        System.out.println(Integer.toString(posicao));
    }
}