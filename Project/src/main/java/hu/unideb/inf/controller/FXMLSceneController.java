/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.Connect;


import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import hu.unideb.inf.model.Komponensek;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.scene.paint.Color;


/**
 * FXML Controller class
 *
 * @author kocsisg
 */
public class FXMLSceneController implements Initializable {

    @FXML
    public Button CalculateButton;

    @FXML
    public Label HazArLabel;

    @FXML
    public Label TapArLabel;

    @FXML
    public Label ProciArLabel;

    @FXML
    public Label AlapArLabel;

    @FXML
    public Label MemoriArLabel;

    @FXML
    public Label VideocArLabel;

    @FXML
    public Label SsdArLabel;

    @FXML
    public Label HddArLabel;

    @FXML
    public ComboBox<String> KeszGepekBox;

    @FXML
    private ComboBox<String> HazBox;

    @FXML
    private  ComboBox<String> TapBox;

    @FXML
    private  ComboBox<String> ProciBox;

    @FXML
    private  ComboBox<String> AlaplBox;

    @FXML
    private  ComboBox<String> MemoriaBox;

    @FXML
    private  ComboBox<String> VideoCBox;

    @FXML
    private  ComboBox<String> SSDBox;

    @FXML
    private  ComboBox<String> MerevlemezBox;

    @FXML
    private Label hazlabel;

    @FXML
    private Label taplabel;

    @FXML
    private Label procilabel;

    @FXML
    private Label alaplabel;

    @FXML
    private Label memorialabel;

    @FXML
    private Label videoclabel;

    @FXML
    private Label ssdlabel;

    @FXML
    private Label hddlabel;

    @FXML
    private TextField OsszegField;

    private Connect db = new Connect();

    @FXML
    private void HandleButtonClicked(ActionEvent event)throws SQLException{
        int osszeg = 0;
        //lekérem az adott boxbol az éppen kiválasztott termák árát és azt összegzem
        //CSAK akkor jelenik meg a TEXTFIELD-ben mikor megnyomom a gombot és a termék van raktáron

        if (!(HazBox.getValue()==null) && (HazBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*","KOMPONENSEK","NAME='"+HazBox.getValue()+"'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else{
            osszeg+=0;
        }

        if(!(TapBox.getValue()==null) && (TapBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + TapBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        if(!(ProciBox.getValue()==null) && (ProciBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + ProciBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        if(!(AlaplBox.getValue()==null) && (AlaplBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + AlaplBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        if(!(MemoriaBox.getValue()==null) && (MemoriaBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + MemoriaBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        if(!(VideoCBox.getValue()==null) && (VideoCBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + VideoCBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        if(!(SSDBox.getValue()==null) && (SSDBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + SSDBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        if(!(MerevlemezBox.getValue()==null) && (MerevlemezBox.getValue()!="Válassz egy terméket!")) {
            db.getData("*", "KOMPONENSEK", "NAME='" + MerevlemezBox.getValue() + "'");
            db.rs.next();
            int ar =db.rs.getInt("PRICE");
            int darabszam= db.rs.getInt("PIECE");
            if(darabszam!=0){
                osszeg +=ar;
            }
            db.rs.close();
        }else {
            osszeg+=0;
        }

        //beleirom az összeg mezőbe a termékek árát
        OsszegField.setText("" + osszeg + " Ft");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        // ami ezen fügvényben van azok az alkalmazás indulásakor elindulnak
       //itt hívom meg minden boxra a listázás fügvényt
        try {
            HazBox.getItems().addAll(listazasOB("Haz"));
            TapBox.getItems().addAll(listazasOB("Tap"));
            ProciBox.getItems().addAll(listazasOB("proci"));
            AlaplBox.getItems().addAll(listazasOB("AlapL"));
            MemoriaBox.getItems().addAll(listazasOB("memori"));
            VideoCBox.getItems().addAll(listazasOB("VideoC"));
            SSDBox.getItems().addAll(listazasOB("Ssd"));
            MerevlemezBox.getItems().addAll(listazasOB("Hdd"));
            KeszGepekBox.getItems().addAll(ReadyPC());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Hiba");
        }

        //Ezek a függvények irják ki hogy van e készleten a termék
        //hazak
        HazBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(HazBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        if (db.rs.getInt("PIECE") > 0) {
                            hazlabel.setTextFill(Color.BLACK);
                            hazlabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            hazlabel.setText("Van készleten");
                        } else {
                            hazlabel.setTextFill(Color.BLACK);
                            hazlabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            hazlabel.setText("Nincs készleten");
                        }
                    }else {
                        hazlabel.setText("");
                        hazlabel.setStyle("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        //tapegysegek
        TapBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(TapBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            taplabel.setTextFill(Color.BLACK);
                            taplabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            taplabel.setText("Van készleten");
                        }else {
                            taplabel.setTextFill(Color.BLACK);
                            taplabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            taplabel.setText("Nincs készleten");
                        }
                    }else {
                        taplabel.setText("");
                        taplabel.setStyle("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //processzorok
        ProciBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(ProciBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            procilabel.setTextFill(Color.BLACK);
                            procilabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            procilabel.setText("Van készleten");
                        }else {
                            procilabel.setTextFill(Color.BLACK);
                            procilabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            procilabel.setText("Nincs készleten");
                        }
                    }else {
                        procilabel.setText("");
                        procilabel.setStyle("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        //alaplapok
        AlaplBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(AlaplBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            alaplabel.setTextFill(Color.BLACK);
                            alaplabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            alaplabel.setText("Van készleten");
                        }else {
                            alaplabel.setTextFill(Color.BLACK);
                            alaplabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            alaplabel.setText("Nincs készleten");
                        }
                    }else {
                        alaplabel.setText("");
                        alaplabel.setStyle("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //memóriák
        MemoriaBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(MemoriaBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            memorialabel.setTextFill(Color.BLACK);
                            memorialabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            memorialabel.setText("Van készleten");
                        }else {
                            memorialabel.setTextFill(Color.BLACK);
                            memorialabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            memorialabel.setText("Nincs készleten");
                        }
                    }else {
                        memorialabel.setStyle("");
                        memorialabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //videokártyák
        VideoCBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try{
                    if(!(VideoCBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            videoclabel.setTextFill(Color.BLACK);
                            videoclabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            videoclabel.setText("Van készleten");
                        }else {
                            videoclabel.setTextFill(Color.BLACK);
                            videoclabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            videoclabel.setText("Nincs készleten");
                        }
                    }else {
                        videoclabel.setText("");
                        videoclabel.setStyle("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //SSD
        SSDBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(SSDBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            ssdlabel.setTextFill(Color.BLACK);
                            ssdlabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            ssdlabel.setText("Van készleten");
                        }else {
                            ssdlabel.setTextFill(Color.BLACK);
                            ssdlabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            ssdlabel.setText("Nincs készleten");
                        }
                    }else {
                        ssdlabel.setStyle("");
                        ssdlabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //HDD
        MerevlemezBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(MerevlemezBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            hddlabel.setTextFill(Color.BLACK);
                            hddlabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            hddlabel.setText("Van készleten");
                        }else {
                            hddlabel.setTextFill(Color.BLACK);
                            hddlabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            hddlabel.setText("Nincs készleten");
                        }
                    }else {
                        hddlabel.setText("");
                        hddlabel.setStyle("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });


        //ezek a fügvények fogják beirni az ár label-ekbe az adott termék árát
        //hazak
        HazBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(HazBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        int ar = db.rs.getInt("PRICE");
                        HazArLabel.setText("" + ar + " Ft");
                    }else{
                        HazArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        //tapok
        TapBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(TapBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        int ar= db.rs.getInt("PRICE");
                        TapArLabel.setText(""+ar + " Ft");
                    }else {
                        TapArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //proci
        ProciBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(ProciBox.getValue()=="Válassz egy terméket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        int ar= db.rs.getInt("PRICE");
                        ProciArLabel.setText(""+ar + " Ft");
                    }else {
                        ProciArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //alaplapok
        AlaplBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(AlaplBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        int ar = db.rs.getInt("PRICE");
                        AlapArLabel.setText("" + ar + " Ft");
                    }else {
                        AlapArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //memoriak
        MemoriaBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(MemoriaBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        int ar = db.rs.getInt("PRICE");
                        MemoriArLabel.setText("" + ar + " Ft");
                    }else {
                        MemoriArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        //videokartyak
        VideoCBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(VideoCBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        int ar = db.rs.getInt("PRICE");
                        VideocArLabel.setText("" + ar + " Ft");
                    }else {
                        VideocArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        //SSD
        SSDBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(SSDBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        int ar = db.rs.getInt("PRICE");
                        SsdArLabel.setText("" + ar + " Ft");
                    }else {
                        SsdArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        //HDD
        MerevlemezBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(MerevlemezBox.getValue()=="Válassz egy terméket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        int ar = db.rs.getInt("PRICE");
                        HddArLabel.setText("" + ar + " Ft");
                    }else {
                        HddArLabel.setText("");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });



    }

        /*
        try {
                    Thread.sleep(1500);
                    // System.out.println("Valami");
                    db.getData("*","KOMPONENSEK","NAME='"+AlaplBox.getValue()+"'");
                    db.rs.next();
                    System.out.println(db.rs.getInt("PIECE"));
                    System.out.println(db.rs.getString("NAME"));
                    if(db.rs.getInt("PIECE")>0){
                        alaplabel.setTextFill(Color.GREEN);
                        alaplabel.setText("Van készleten");
                    }else {
                        alaplabel.setTextFill(Color.RED);
                        alaplabel.setText("Nincs készleten");
                    }
                }catch (SQLException | InterruptedException e) {
                    e.printStackTrace();
                }
        */
    /*
    //ezt a fügvényt meghívva kerülnek be a komponensek nevei a boxok-ba
    List<String> listazas(String kp_id)throws SQLException{
        db.getData("*","KOMPONENSEK","KP_ID='"+kp_id+"'");
        List<String> lista = new ArrayList<>();
        while (db.rs.next()){
            String neve = db.rs.getString("NAME");
            lista.add(neve);
        }
        db.rs.close();
        return lista;
    }*/

    //ezt a fügvényt meghívva kerülnek be a komponensek nevei a boxok-ba
    ObservableList<String> listazasOB(String kp_id)throws SQLException{
        db.getData("*","KOMPONENSEK","KP_ID='"+kp_id+"'");
        ObservableList<String> oblista= FXCollections.observableArrayList();
        oblista.add("Válassz egy terméket!");
        while (db.rs.next()){
            String neve = db.rs.getString("NAME");
            oblista.add(neve);
        }
        db.rs.close();
        return oblista;
    }

    //ez a fügvény fogja beolvasni az előre összeállított gépek, nevét a Kész Gépek box-ba
    ObservableList<String> ReadyPC() throws  SQLException{
        db.getData1("*","konfigok");
        ObservableList<String> OBlist=FXCollections.observableArrayList();
        OBlist.add("Válasz egy terméket!");
        while (db.rs.next()){
            String nev = db.rs.getString("NAME");
            OBlist.add(nev);
        }
        db.rs.close();
        return OBlist;
    }
    /*
    ObservableList<String> elements(String name)throws SQLException{
        db.getData("*","konfigok","NAME='"+name+"'");
        ObservableList<String> oblista= FXCollections.observableArrayList();
        oblista.add("Válassz egy terméket!");
        while (db.rs.next()){
            oblista.add(db.rs.getString("Haz"));
            oblista.add(db.rs.getString("Tap"));
            oblista.add(db.rs.getString("Alaplap"));
            oblista.add(db.rs.getString("Proci"));
            oblista.add(db.rs.getString("Memoria"));
            oblista.add(db.rs.getString("Videokartya"));
            oblista.add(db.rs.getString("SSD"));
            oblista.add(db.rs.getString("HDD"));
            oblista.add(db.rs.getString("PRICE"));
        }
        db.rs.close();
        return oblista;
    }
    */

    public void BoxClicked(ActionEvent actionEvent)  {
        String tartalom = KeszGepekBox.getValue();
        if(tartalom.equals("Irodaigép")){
            AlaplBox.setValue("AMD AM4 GigaByte A520M DS3H alaplap");


        }

        if(tartalom.equals("Gamer")){
            AlaplBox.setValue("AMD AM4 GigaByte A520M DS3H alaplap");

        }



    }
}