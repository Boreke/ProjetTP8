package com.example.tp8;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}