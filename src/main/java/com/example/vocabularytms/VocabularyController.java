package com.example.vocabularytms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class VocabularyController {
    @FXML
    public TextField enterWord;

    @FXML
    public void addWord(ActionEvent actionEvent) {
        System.out.println("You have added a new message!");
    }
}