package com.example.vocabularytms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class VocabularyController {
    @FXML
    public ListView<String> listView;
    public ArrayList<String> arrayListView;
    @FXML
    public Button delete;
    @FXML
    public Button save;
    @FXML
    private TextField textValue;
    @FXML
    private Button add;

    // Create File & Read / Write
    private File file;
    private FileInputStream read;
    private FileOutputStream write;

    public VocabularyController(){
        listView = new ListView<>();

        try{
            file = new File("src/main/resources/com/example/vocabularytms/vocabulary.txtRT");
        } catch (Exception e) {
            System.out.println("ERRORRR");
        }
    }

    private void fileCheck(){
    }

    @FXML
    public void addWord(ActionEvent actionEvent) {
        // Adds a word to the list
        if (textValue.getText().isBlank() || textValue.getText().isEmpty()){
            System.out.println("Your field is either blank or empty...");
            return;
        }
    }

    @FXML
    public void deleteWord(ActionEvent actionEvent) {
        // This method will delete a particular word in the list
    }

    @FXML
    public void saveVocabulary(ActionEvent actionEvent) {
        // This method will save your data in a .TXT file
        File file = new File("src/main/resources/com/example/vocabularytms/vocabulary.txt");
    }

    // Read VOCABULARY.TXT
    private void readVocabulary(){
        // Читает документ/словарь и если он не пуст, то все выводит на экран
    }
}