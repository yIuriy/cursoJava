package org.example.exe019;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Label labelResposta;
    public Spinner<Integer> spinnerValorPalpitado;
    public Button buttonPalpite;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> spinnerMolde = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1);
        spinnerValorPalpitado.setValueFactory(spinnerMolde);
    }
    public void palpitar() {

        int valorComputador = (int) (1 + Math.random() * (6 - 1));
        labelResposta.setText(String.valueOf(valorComputador));

        int valorUsuario = spinnerValorPalpitado.getValue();

        if (valorUsuario == valorComputador) {
            labelResposta.setText("ACERTOU!");
            labelResposta.setTextFill(Color.GREEN);
        } else {
            labelResposta.setText("ERROU! O número que pensei foi " + valorComputador);
            labelResposta.setTextFill(Color.RED);
        }

    }
}
