package org.example.exe025_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
  public Label labelContagem;
  public Button buttonContar;

  public void iniciarContagem(ActionEvent event) {
    int count = 0;
    StringBuilder contagem = new StringBuilder();
    while (count < 5) {
      contagem.append(count).append(" ");
      count++;
    }
    labelContagem.setText(contagem.toString());
  }
}