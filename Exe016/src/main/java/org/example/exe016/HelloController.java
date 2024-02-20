package org.example.exe016;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.fxml.Initializable;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Spinner<Integer> spinnerValor;
    public Button buttonCalcular;
    public Label lblRestoDivisao;
    public Label lblElevadoCubo;
    public Label lblRaiz2;
    public Label lblRaiz3;
    public Label lblValorAbsoluto;

    public void calcular(ActionEvent event) {
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        spinnerValor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(Integer.MIN_VALUE, Integer.MAX_VALUE, 1));


    }
}
