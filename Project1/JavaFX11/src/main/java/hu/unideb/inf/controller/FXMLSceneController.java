/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.Connect;
import hu.unideb.inf.model.JpaKomponensek_DAO;
import hu.unideb.inf.model.Komponensek;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kocsisg
 */
public class FXMLSceneController implements Initializable {

    @FXML
    public ComboBox<String> HazBox;

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

    JpaKomponensek_DAO dao= new JpaKomponensek_DAO();
    ObservableList<Komponensek> lista = FXCollections.observableArrayList(dao.getAllKomponens());
    private Connect db = new Connect();

    @FXML
    private void HandleButtonPushed(ActionEvent event){
        System.out.println("Hello world!!!");

    }

    @FXML
    private TextField OsszegField;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void Hazbetoltese(ActionEvent actionEvent) {
        HazBox.setItems(db.getData("NAME","KOMPONENSEK","alapL"));
    }


}
