package org.example.exe018;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class HelloController {
    public TextField txtAnoNascimento;
    public Button buttonCalcularIdade;
    public Label labelIdade;
    public Label labelSituacao;
    public Label labelVoto;
    protected int anoAtual = LocalDate.now().getYear();
    protected String situacaoIdade;
    protected String situacaoVoto;
    protected String mensagemErro = "Ano Inválido";
    public void calcularIdade() {
        int anoNascimento = Integer.parseInt(txtAnoNascimento.getText());
        if (anoNascimento > anoAtual || anoNascimento < 1900) {
            labelIdade.setText(mensagemErro);
            labelSituacao.setText(mensagemErro);
            labelVoto.setText(mensagemErro);
            txtAnoNascimento.setText("0");
        } else {
            int idade = anoAtual - anoNascimento;
            labelIdade.setText(String.valueOf(idade));
            if (idade < 16) {
                situacaoIdade = "Menor de Idade";
                situacaoVoto = "Não Vota";
            } else if (idade < 18) {
                situacaoIdade = "Menor de Idade";
                situacaoVoto = "Voto Opcional";
            } else if (idade < 70) {
                situacaoIdade = "Maior de Idade";
                situacaoVoto = "Voto Obrigatório";
            } else if (idade > 70) {
                situacaoIdade = "Maior de Idade";
                situacaoVoto = "Voto Opcional";
            }
            labelSituacao.setText(situacaoIdade);
            labelVoto.setText(situacaoVoto);
        }
    }
}


