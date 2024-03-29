package com.example.hangman.controller;

import com.example.hangman.model.SecretWord;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    private HBox hboxLayout;

    private SecretWord secretWord;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Este método se llama automáticamente cuando se carga la vista
        // No necesitamos ejecutar la lógica del botón "Play" aquí
    }

    public void startGameWithSecretWord(String word) {
        secretWord = new SecretWord(word);

        // Limpiar HBox antes de agregar nuevas letras
        hboxLayout.getChildren().clear();

        // Agregar casillas para cada letra de la palabra secreta al HBox
        for (int i = 0; i < secretWord.length(); i++) {
            TextField letterBox = new TextField();
            letterBox.setPrefWidth(30); // Establecer el ancho deseado para la casilla
            letterBox.setEditable(false); // Evitar que el usuario edite las letras directamente
            hboxLayout.getChildren().add(letterBox);
        }
    }
}
