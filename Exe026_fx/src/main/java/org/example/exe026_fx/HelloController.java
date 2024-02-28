package org.example.exe026_fx;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Spinner<Integer> spinnerValorInserido;
    public Label labelResultadoFatorial;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> moldeSpinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 12, 0);
        spinnerValorInserido.setValueFactory(moldeSpinner);
    }

    public void calcularFatorial(MouseEvent mouseEvent) {
        int valorInserido = spinnerValorInserido.getValue();
        int valorFatorial = 1;
        while (0 < valorInserido) {
            valorFatorial = (valorFatorial * valorInserido);
            valorInserido--;
        }
        labelResultadoFatorial.setText(String.valueOf(valorFatorial));
    }
}