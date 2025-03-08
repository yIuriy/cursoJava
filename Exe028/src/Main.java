import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numeroInformado;
        int contagemValores = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int totalAcimaDe100 = 0;
        int somaDosValores = 0;
        int mediaValores = 0;
        do {
            numeroInformado = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número \n <em>(0 interrompe)" +
                    "<em>" +
                    "<html>"));
            if (numeroInformado != 0) {
                contagemValores++;
                somaDosValores += numeroInformado;
                if (numeroInformado % 2 == 0) {
                    totalPares++;
                } else {
                    totalImpares++;
                }
                if (numeroInformado > 100) {
                    totalAcimaDe100++;
                }
            }
        } while (numeroInformado != 0);
        mediaValores = somaDosValores / contagemValores;
        JOptionPane.showMessageDialog(null,
                "Resultado\n" +
                        "  ---------------\n" +
                        "Total de valores: " + contagemValores +
                        "\nTotal de pares: " + totalPares +
                        "\nTotal de ímpares: " + totalImpares +
                        "\nTotal acima de 100: " + totalAcimaDe100 +
                        "\nMédia dos valores: " + mediaValores,
                "Resultado Final", JOptionPane.ERROR_MESSAGE);
    }
}
