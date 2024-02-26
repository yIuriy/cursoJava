package org.example.exe021_fx;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Spinner<Integer> spinnerValorA;
    public Spinner<Integer> spinnerValorB;
    public Spinner<Integer> spinnerValorC;
    public Label labelValorA;
    protected int valorA;
    public Label labelValorB;
    protected int valorB;
    public Label labelValorC;
    protected int valorC;
    public Button buttonCalcularDelta;
    public VBox vBox1;
    public VBox vBox2;
    public Label labelValorDelta;
    public Label labelTipoDelta;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vBox1.setVisible(false);
        vBox2.setVisible(false);

        SpinnerValueFactory<Integer> moldeSpinnerA =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(Integer.MIN_VALUE,
                        Integer.MAX_VALUE, 0);
        spinnerValorA.setValueFactory(moldeSpinnerA);

        SpinnerValueFactory<Integer> moldeSpinnerB =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(Integer.MIN_VALUE,
                        Integer.MAX_VALUE, 0);
        spinnerValorB.setValueFactory(moldeSpinnerB);

        SpinnerValueFactory<Integer> moldeSpinnerC =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(Integer.MIN_VALUE,
                        Integer.MAX_VALUE, 0);
        spinnerValorC.setValueFactory(moldeSpinnerC);
    }

    public void atualizarValorLabelA() {
        valorA = spinnerValorA.getValue();
        labelValorA.setText(String.valueOf(valorA));
    }

    public void atualizarValorLabelB() {
        valorB = spinnerValorB.getValue();
        labelValorB.setText(String.valueOf(valorB));
    }

    public void atualizarValorLabelC() {
        valorC = spinnerValorC.getValue();
        labelValorC.setText(String.valueOf(valorC));

    }

    public void calcularDelta() {
        vBox1.setVisible(true);
        vBox2.setVisible(true);

        double valorDelta = (valorB * valorB) - (4 * valorA * valorC);
        labelValorDelta.setText(String.valueOf(valorDelta));

        if (valorDelta > 0) {
            labelTipoDelta.setText("A equação terá duas raízes reais e distintas");
        } else if (valorDelta == 0) {
            labelTipoDelta.setText("A equação apresentará uma raiz real");

        } else {
            labelTipoDelta.setText("A equação não possui raízes reais");
        }
    }
}