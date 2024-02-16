import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RelogioSwing extends JFrame {
    private JLabel lblHora;
    private JPanel panelMain;
    private JLabel lblData;
    private final DateTimeFormatter padraoFormatacaoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final DateTimeFormatter padraoFormatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Timer timer;
    public RelogioSwing() {
        iniciarRelogio();
    }
    private void iniciarRelogio() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDate dataAtual = LocalDate.now();
                String dataFormatada = dataAtual.format(padraoFormatacaoData);
                LocalTime horaAtual = LocalTime.now();
                String horaFormatada = horaAtual.format(padraoFormatacaoHora);
                lblHora.setText(horaFormatada);
                lblData.setText(dataFormatada);
            }
        });
        timer.start();
    }
    public static void main(String[] args) {
        // Windows Initialize
        RelogioSwing janelaMain = new RelogioSwing();
        janelaMain.setContentPane(janelaMain.panelMain);
        janelaMain.setTitle("Relógio em Swing");
        janelaMain.setSize(300, 200);
        janelaMain.setVisible(true);
        janelaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
