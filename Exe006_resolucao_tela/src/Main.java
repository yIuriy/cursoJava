import java.awt.Toolkit;
import java.awt.Dimension;


public class Main {
    public static void main(String[] args) {
        Dimension resolucaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraTela = (int) resolucaoTela.getWidth();
        int alturaTela = (int) resolucaoTela.getHeight();

        System.out.printf("A resolução da tela é de: %d x %d", larguraTela, alturaTela);
    }
}