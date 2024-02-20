package org.example.exe015;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField valorNumerador;
    public TextField valorDenominador;
    public Button buttonDividir;
    public Label resultadorRestoDivisao;
    public Label resultadoDivisao;
    public void calcularDivisao(ActionEvent event) {
        float numerador = Float.parseFloat(valorNumerador.getText());
        float denominador = Float.parseFloat(valorDenominador.getText());
        float divisao = numerador / denominador;
        float restoDivisao = numerador % denominador;
        resultadoDivisao.setText(String.valueOf(divisao));
        resultadorRestoDivisao.setText(String.valueOf(restoDivisao));
    }
}