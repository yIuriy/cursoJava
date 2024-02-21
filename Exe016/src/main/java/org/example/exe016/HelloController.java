package org.example.exe016;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.fxml.Initializable;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public AnchorPane panelMain;
    public Spinner<Integer> spinnerValor;
    public Button buttonCalcular;
    public Label lblRestoDivisao;
    public Label lblElevadoCubo;
    public Label lblRaiz2;
    public Label lblRaiz3;
    public Label lblValorAbsoluto;
    public VBox vBox1;
    public VBox vBox2;

    public void calcular(ActionEvent event) {
        int valorPassado = spinnerValor.getValue();
        vBox1.setVisible(true);
        vBox2.setVisible(true);
        if (valorPassado < 0) {
            lblRaiz2.setText("NaN");
        }
        double restoDivisao = valorPassado % 2;
        lblRestoDivisao.setText(String.format("%.2f", restoDivisao));

        double elevadoCubo = Math.pow(valorPassado, 3);
        lblElevadoCubo.setText(String.format("%.2f", elevadoCubo));

        double raizQuadrada = Math.sqrt(valorPassado);
        lblRaiz2.setText(String.format("%.2f", raizQuadrada));

        double raizCubica = Math.cbrt(valorPassado);
        lblRaiz3.setText(String.format("%.2f", raizCubica));

        double valorAbsoluto = Math.abs(valorPassado);
        lblValorAbsoluto.setText(String.format("%.2f", valorAbsoluto));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        spinnerValor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(Integer.MIN_VALUE, Integer.MAX_VALUE, 1));


    }
}
