package com.example.advancedoopsessions;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

import java.io.IOException;
public class ChatController extends HelpController {
    @FXML
    private Label welcomeText;
    @FXML
    void backChat(MouseEvent event) throws IOException {
        switchScene("/fxml/chatController.fxml");
    }

    @FXML
    void backMain(MouseEvent event) {
        switchScene("/fxml/mainController.fxml");
    }

    @FXML
    void call(MouseEvent event) throws IOException {
        switchScene("/fxml/callController.fxml");
    }
    @FXML
    void chat(MouseEvent event) throws IOException {
        HelpController.switchScene("/fxml/chatController.fxml");
    }
}