package com.example.hangman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TittleController {

    @FXML
    void handleStartButtonClicked(ActionEvent event) {
        try {
            // Cargar la vista del juego
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/hangman/game.fxml"));
            Parent gameView = loader.load();

            // Obtener el controlador del juego
            GameController gameController = loader.getController();

            // Configurar la escena
            Scene scene = new Scene(gameView);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Hangman Game");

            // Mostrar la ventana del juego
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
