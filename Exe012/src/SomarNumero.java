import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomarNumero extends JFrame {
    private JPanel panelMain;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblMais;
    private JLabel lblResultado;

    public SomarNumero() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(txtN1.getText());
                int number2 = Integer.parseInt(txtN2.getText());
                int resSoma = number1 + number2;
                lblResultado.setText(String.valueOf(resSoma));
            }
        });
    }
    public static void main(String[] args) {
        SomarNumero janelaSoma = new SomarNumero();
        janelaSoma.setContentPane(janelaSoma.panelMain);
        janelaSoma.setTitle("Somar dois números!");
        janelaSoma.setSize(400, 200);
        janelaSoma.setVisible(true);
        janelaSoma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
