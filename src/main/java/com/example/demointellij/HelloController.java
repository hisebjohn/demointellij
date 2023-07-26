package com.example.demointellij;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        System.out.println("Hi  when button is clicked:");
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}