package org.example.exe023_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public Slider sliderSegmentoA;
    protected int valorSegmentoA;
    public Label labelSegmentoA;
    public Slider sliderSegmentoB;
    protected int valorSegmentoB;
    public Label labelSegmentoB;
    public Slider sliderSegmentoC;
    protected int valorSegmentoC;
    public Label labelSegmentoC;
    public Button buttonVerificarTriangulo;
    public Label labelFormaTriangulo;
    public Label labelTipoTriangulo;

    public void atualizarLabelSegmentoA(MouseEvent mouseEvent) {
        valorSegmentoA = (int) sliderSegmentoA.getValue();
        labelSegmentoA.setText(String.valueOf(valorSegmentoA));
    }

    public void atualizarLabelSegmentoB(MouseEvent mouseEvent) {
        valorSegmentoB = (int) sliderSegmentoB.getValue();
        labelSegmentoB.setText(String.valueOf(valorSegmentoB));
    }

    public void atualizarLabelSegmentoC(MouseEvent mouseEvent) {
        valorSegmentoC = (int) sliderSegmentoC.getValue();
        labelSegmentoC.setText(String.valueOf(valorSegmentoC));
    }

    public void verificarTriangulo(ActionEvent event) {
        if (valorSegmentoA < valorSegmentoB + valorSegmentoC && valorSegmentoB < valorSegmentoA + valorSegmentoC && valorSegmentoC < valorSegmentoA + valorSegmentoB) {
            labelFormaTriangulo.setText("Forma um Triângulo");
            if (valorSegmentoA == valorSegmentoB && valorSegmentoA == valorSegmentoC) {
                labelTipoTriangulo.setText("EQUILÁTERO");
            } else if (valorSegmentoA == valorSegmentoB && valorSegmentoA != valorSegmentoC || valorSegmentoB == valorSegmentoA && valorSegmentoB != valorSegmentoC || valorSegmentoC == valorSegmentoA && valorSegmentoC != valorSegmentoB ) {
                labelTipoTriangulo.setText("ISÓSCELES");
            } else if (valorSegmentoA != valorSegmentoB && valorSegmentoA != valorSegmentoC) {
                labelTipoTriangulo.setText("ESCALENO");
            }
        } else {
            labelFormaTriangulo.setText("Não forma um Triângulo");
            labelTipoTriangulo.setText("-");
        }
    }
}


