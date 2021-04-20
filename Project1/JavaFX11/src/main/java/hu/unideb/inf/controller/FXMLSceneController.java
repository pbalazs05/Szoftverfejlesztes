/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.JpaKomponensek_DAO;
import hu.unideb.inf.model.Komponensek;
import hu.unideb.inf.model.Komponensek_DAO;
import hu.unideb.inf.model.Student;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author kocsisg
 */
public class FXMLSceneController implements Initializable {

    @FXML
    public ComboBox<Komponensek> HazBox;

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

    ObservableList<Komponensek> lista = FXCollections.observableArrayList();
    private final JpaKomponensek_DAO komponensek_dao= new JpaKomponensek_DAO();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

/*
Egy Set be kellene bekérni a database-rol az adatokat ID szerint
Set<Komponensek>  input = sorokAzadatbazisbol_by_ID
 */

}
