/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class FXMLSceneController implements Initializable {

    @FXML
    private ComboBox<?> HazBox;

    @FXML
    private ComboBox<?> TapBox;

    @FXML
    private ComboBox<?> ProciBox;

    @FXML
    private ComboBox<?> AlaplBox;

    @FXML
    private ComboBox<?> MemoriaBox;

    @FXML
    private ComboBox<?> VideoCBox;

    @FXML
    private ComboBox<?> SSDBox;

    @FXML
    private ComboBox<?> MerevlemezBox;

    @FXML
    private ComboBox<?> procihutoBox;

    @FXML
    private ComboBox<?> HutoBox;

    @FXML
    private ComboBox<?> OptakiaBox;

    @FXML
    private ComboBox<?> OprendszBox;

    @FXML
    private void HandleButtonPushed(ActionEvent event){
        System.out.println("Hello world!!!");

    }

    @FXML
    private TextField OsszegField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        setupTable();
    }

    private void setupTable() {

    }

}
