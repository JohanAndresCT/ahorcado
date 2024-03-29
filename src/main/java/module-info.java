module com.example.hangman {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hangman to javafx.fxml;
    exports com.example.hangman;
    exports com.example.hangman.controller;
    opens com.example.hangman.controller to javafx.fxml;
}