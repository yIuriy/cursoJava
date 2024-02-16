package org.example.exe009;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMsg;
    @FXML
    private Button btnClique;
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMsg.setText("Olá, Mundo!");
    }
}