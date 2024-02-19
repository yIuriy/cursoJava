package org.example.calculadoraidade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

import java.time.LocalDate;

public class HelloController implements Initializable {
    public AnchorPane panelMain;
    public Button btnCalcular;
    public Label lblAnoNascimento;
    public Label lblIdade;
    public Spinner<Integer> spinnerAnoNascimento;
    public int anoAtual = LocalDate.now().getYear();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> valorSpinnerAno = new SpinnerValueFactory.IntegerSpinnerValueFactory(1900, 2024, anoAtual);
        spinnerAnoNascimento.setValueFactory(valorSpinnerAno);
    }
    public void calcularIdade(ActionEvent event) {
        int anoNascimento = spinnerAnoNascimento.getValue();
        int idade = anoAtual - anoNascimento;
        lblIdade.setText(String.valueOf(idade));
    }
}
