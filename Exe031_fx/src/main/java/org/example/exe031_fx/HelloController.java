package org.example.exe031_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Spinner<Integer> spinnerValor;
    public Button buttonAdicionarValor;
    public Button buttonRemoverValor;
    public Button buttonOrdenarVetor;
    public ListView<String> listaVetor;
    public Label labelIndiceSelecionado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> moldeSpinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        spinnerValor.setValueFactory(moldeSpinner);

    }

        public void adicionarValor (ActionEvent event){
        }

        public void removerValor (ActionEvent event){
        }

        public void ordenarVetor (ActionEvent event){
        }
    }