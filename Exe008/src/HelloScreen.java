import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloScreen extends JFrame{
    private JPanel panelMain;
    private JButton btnClique;
    private JLabel lblMsg;

    public HelloScreen(){
        btnClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMsg.setText("Olá Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        HelloScreen janela = new HelloScreen();
        janela.setContentPane(janela.panelMain);
        janela.setTitle("Olá Mundo em Swing");
        janela.setSize(500,200);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


