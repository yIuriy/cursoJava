package org.example.exe020_fx;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public Slider sliderInicioContagem;
    public Label labelInicioContagem;
    protected int valorInicioContagem;
    public Slider sliderFimContagem;
    public Label labelFimContagem;
    protected int valorFimContagem;
    public Slider sliderPassoContagem;
    public Label labelPassoContagem;
    protected int valorPassoContagem;
    public Button buttonIniciarContagem;
    public TextArea textAreaResultados;
    public void atualizarValorLabelInicioContagem(MouseEvent ignoredMouseEvent) {
        valorInicioContagem = (int) sliderInicioContagem.getValue();
        labelInicioContagem.setText(String.valueOf(valorInicioContagem));
    }

    public void atualizarValorLabelFimContagem(MouseEvent ignoredMouseEvent) {
        valorFimContagem = (int) sliderFimContagem.getValue();
        labelFimContagem.setText(String.valueOf(valorFimContagem));
    }

    public void atualizarValorLabelPassoContagem(MouseEvent ignoredMouseEvent) {
        valorPassoContagem = (int) sliderPassoContagem.getValue();
        labelPassoContagem.setText(String.valueOf(valorPassoContagem));
    }

    public void contar(ActionEvent ignoredEvent) {
        textAreaResultados.setText("");
        if (valorPassoContagem != 0) {
            if (valorInicioContagem < valorFimContagem) {
                for (int contador = valorInicioContagem; contador <= valorFimContagem; contador += valorPassoContagem) {
                    textAreaResultados.appendText(contador + "\n");
                }
            } else {
                for (int contador = valorInicioContagem; contador >= valorFimContagem; contador -= valorPassoContagem) {
                    textAreaResultados.appendText(contador + "\n");
                }
            }
        }else {
            textAreaResultados.setText("ERRO! Passo 0 é inválido!");
        }
    }
}