package org.example.exe022_fx;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField textNumero;
    public Button buttonConferir;
    public Label labelResultado;

    public void isPar(ActionEvent event) {
        int numeroDigitado = Integer.parseInt(textNumero.getText());
        if (numeroDigitado % 2 == 0) {
            labelResultado.setText("PAR");
        } else {
            labelResultado.setText("ÍMPAR");
        }
    }
}