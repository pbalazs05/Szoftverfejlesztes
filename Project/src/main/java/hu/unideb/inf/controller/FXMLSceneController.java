/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.Connect;


import java.net.URL;
import java.sql.SQLException;

import java.util.Optional;
import java.util.ResourceBundle;


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
    public Button PayButton;

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
        //lek??rem az adott boxbol az ??ppen kiv??lasztott term??k ??r??t ??s azt ??sszegzem
        //CSAK akkor jelenik meg a TEXTFIELD-ben mikor megnyomom a gombot ??s a term??k van rakt??ron

        if (!(HazBox.getValue()==null) && (HazBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(TapBox.getValue()==null) && (TapBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(ProciBox.getValue()==null) && (ProciBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(AlaplBox.getValue()==null) && (AlaplBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(MemoriaBox.getValue()==null) && (MemoriaBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(VideoCBox.getValue()==null) && (VideoCBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(SSDBox.getValue()==null) && (SSDBox.getValue()!="V??lassz egy term??ket!")) {
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

        if(!(MerevlemezBox.getValue()==null) && (MerevlemezBox.getValue()!="V??lassz egy term??ket!")) {
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

        //beleirom az ??sszeg mez??be a term??kek ??r??t
        OsszegField.setText("" + osszeg + " Ft");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        // ami ezen f??gv??nyben van azok az alkalmaz??s indul??sakor elindulnak
       //itt h??vom meg minden boxra a list??z??s f??gv??nyt
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

        //Ezek a f??ggv??nyek irj??k ki hogy van e k??szleten a term??k
        //hazak
        HazBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(HazBox.getValue()=="V??lassz egy term??ket!")) {
                        db.getData("*", "KOMPONENSEK", "NAME='" + newValue + "'");
                        db.rs.next();
                        if (db.rs.getInt("PIECE") > 0) {
                            hazlabel.setTextFill(Color.BLACK);
                            hazlabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            hazlabel.setText("Van k??szleten");
                        } else {
                            hazlabel.setTextFill(Color.BLACK);
                            hazlabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            hazlabel.setText("Nincs k??szleten");
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
                    if(!(TapBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            taplabel.setTextFill(Color.BLACK);
                            taplabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            taplabel.setText("Van k??szleten");
                        }else {
                            taplabel.setTextFill(Color.BLACK);
                            taplabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            taplabel.setText("Nincs k??szleten");
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
                    if(!(ProciBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            procilabel.setTextFill(Color.BLACK);
                            procilabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            procilabel.setText("Van k??szleten");
                        }else {
                            procilabel.setTextFill(Color.BLACK);
                            procilabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            procilabel.setText("Nincs k??szleten");
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
                    if(!(AlaplBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            alaplabel.setTextFill(Color.BLACK);
                            alaplabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            alaplabel.setText("Van k??szleten");
                        }else {
                            alaplabel.setTextFill(Color.BLACK);
                            alaplabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            alaplabel.setText("Nincs k??szleten");
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

        //mem??ri??k
        MemoriaBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(MemoriaBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            memorialabel.setTextFill(Color.BLACK);
                            memorialabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            memorialabel.setText("Van k??szleten");
                        }else {
                            memorialabel.setTextFill(Color.BLACK);
                            memorialabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            memorialabel.setText("Nincs k??szleten");
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

        //videok??rty??k
        VideoCBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try{
                    if(!(VideoCBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            videoclabel.setTextFill(Color.BLACK);
                            videoclabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            videoclabel.setText("Van k??szleten");
                        }else {
                            videoclabel.setTextFill(Color.BLACK);
                            videoclabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            videoclabel.setText("Nincs k??szleten");
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
                    if(!(SSDBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            ssdlabel.setTextFill(Color.BLACK);
                            ssdlabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            ssdlabel.setText("Van k??szleten");
                        }else {
                            ssdlabel.setTextFill(Color.BLACK);
                            ssdlabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            ssdlabel.setText("Nincs k??szleten");
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
                    if(!(MerevlemezBox.getValue()=="V??lassz egy term??ket!")){
                        db.getData("*","KOMPONENSEK","NAME='"+newValue+"'");
                        db.rs.next();
                        if(db.rs.getInt("PIECE")>0){
                            hddlabel.setTextFill(Color.BLACK);
                            hddlabel.setStyle("-fx-background-color: rgb(144,238,144);");
                            hddlabel.setText("Van k??szleten");
                        }else {
                            hddlabel.setTextFill(Color.BLACK);
                            hddlabel.setStyle("-fx-background-color: rgb(255,59,59);");
                            hddlabel.setText("Nincs k??szleten");
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


        //ezek a f??gv??nyek fogj??k beirni az ??r label-ekbe az adott term??k ??r??t
        //hazak
        HazBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if(!(HazBox.getValue()=="V??lassz egy term??ket!")) {
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
                    if(!(TapBox.getValue()=="V??lassz egy term??ket!")){
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
                    if(!(ProciBox.getValue()=="V??lassz egy term??ket!")){
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
                    if(!(AlaplBox.getValue()=="V??lassz egy term??ket!")) {
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
                    if(!(MemoriaBox.getValue()=="V??lassz egy term??ket!")) {
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
                    if(!(VideoCBox.getValue()=="V??lassz egy term??ket!")) {
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
                    if(!(SSDBox.getValue()=="V??lassz egy term??ket!")) {
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
                    if(!(MerevlemezBox.getValue()=="V??lassz egy term??ket!")) {
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
                        alaplabel.setText("Van k??szleten");
                    }else {
                        alaplabel.setTextFill(Color.RED);
                        alaplabel.setText("Nincs k??szleten");
                    }
                }catch (SQLException | InterruptedException e) {
                    e.printStackTrace();
                }
        */
    /*
    //ezt a f??gv??nyt megh??vva ker??lnek be a komponensek nevei a boxok-ba
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
    //ezt a f??gv??nyt megh??vva ker??lnek be a komponensek nevei a boxok-ba
    ObservableList<String> listazasOB(String kp_id)throws SQLException{
        db.getData("*","KOMPONENSEK","KP_ID='"+kp_id+"'");
        ObservableList<String> oblista= FXCollections.observableArrayList();
        oblista.add("V??lassz egy term??ket!");
        while (db.rs.next()){
            String neve = db.rs.getString("NAME");
            oblista.add(neve);
        }
        db.rs.close();
        return oblista;
    }
    //ez a f??gv??ny fogja beolvasni az el??re ??ssze??ll??tott g??pek, nev??t a K??sz G??pek box-ba
    ObservableList<String> ReadyPC() throws  SQLException{
        db.getData1("*","konfigok");
        ObservableList<String> OBlist=FXCollections.observableArrayList();
        OBlist.add("V??lasz egy term??ket!");
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
        oblista.add("V??lassz egy term??ket!");
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
        if(tartalom.equals("Irodai")){
            HazBox.setValue("Cooler Master MasterBox Lite 3.1 MCW-L3B3-KANN-01 Sz??m??t??g??ph??z Mini ??s Micro");
            TapBox.setValue("Be quiet! BN295 700W Pure Power 11 t??pegys??g");
            ProciBox.setValue("AMD Ryzen 5 1600 YD1600BBAEBOX processzor AMD AM4 processzor");
            AlaplBox.setValue("AMD AM4 ASRock A320M Pro4-F alaplap");
            MemoriaBox.setValue("ADATA  8GB GAMMIX D10 3000MHz DDR4 mem??ria");
            VideoCBox.setValue("Zotac GT710 1GB DDR3 (ZT-71301-20L) Vide??k??rtya");
            SSDBox.setValue("HPE P04556-B21 240GB RI SFF SSD SSD 2,5"+'"');
            MerevlemezBox.setValue("Western Digital 2TB 64MB SATA3 WD20EFRX merevlemez 3,5"+'"');
        }
        if(tartalom.equals("Gamer")){
            HazBox.setValue("Cooler Master MB311 MCBB-311L-KGNN-S02 ARGB Sz??m??t??g??ph??z Mini ??s Micro");
            TapBox.setValue("be quiet! BN298 Pure Power 11 600W 80+ Gold t??pegys??g");
            ProciBox.setValue("Intel Core i9-9900KF BX80684I99900KF processzor Intel 1151 v2 processzor");
            AlaplBox.setValue("AMD AM4 ASRock A320M-DVS R40 alaplap");
            MemoriaBox.setValue("ADATA  16GB GAMMIX D10 3000MHz DDR4 mem??ria");
            VideoCBox.setValue("Gainward RTX3060 12GB GDDR6 GHOST OC NE63060T19K9-190AU Videok??rtya nVidia");
            SSDBox.setValue("Kingston 1TB SKC600/1024G SSD meghajt?? SSD 2,5"+'"');
            MerevlemezBox.setValue("Seagate 1TB 64MB ST1000VN002 merevlemez 3,5"+'"');
        }
        if(tartalom.equals("Otthoni")){
            HazBox.setValue("Cooler Master MCS-S400-KN5N-S00 Silencio S400 Steel Black Sz??m??t??g??ph??z Mini ??s Micro");
            TapBox.setValue("Be quiet! BN305 550W 80+ Platinum Straight Power 11 t??pegys??g");
            ProciBox.setValue("INTEL Core i3-9300 3.70GHz BX80684I39300 processzor Intel 1151 v2 processzor");
            AlaplBox.setValue("AMD AM4 ASRock A320M-HDV R40 alaplap");
            MemoriaBox.setValue("APACER 4GB 2400MHz DDR4 mem??ria");
            VideoCBox.setValue("GIGABYTE GTX1650 4GB GDDR5 OC GV-N1650OC-4GD Videok??rtya nVidia");
            SSDBox.setValue("Intel 480GB SSDSC2KG480G801 S4610 SSD meghajt?? SSD 2,5"+'"');
            MerevlemezBox.setValue("Seagate 1TB 64MB ST1000VX005 merevlemez 3,5"+'"');
        }
        if(tartalom.equals("Photoshop")){
            HazBox.setValue("Cooler Master MCS-S400-KG5N-S00 Silencio S400 TG Black ??veg ablakos Sz??m??t??g??ph??z Mini ??s Micro");
            TapBox.setValue("Be quiet! BN306 650W 80+ Platinum Straight Power 11 t??pegys??g");
            ProciBox.setValue("AMD Ryzen 7 3800X 100-100000025BOX processzor AMD AM4 processzor");
            AlaplBox.setValue("AMD AM4 ASRock A320M-ITX alaplap");
            MemoriaBox.setValue("APACER 8GB 2400MHz DDR4 mem??ria");
            VideoCBox.setValue("Asus GT710 2GB GDDR5 GT710-SL-2GD5 Videok??rtya nVidia");
            SSDBox.setValue("Crucial 1TB BX500 SSD meghajt?? (CT1000BX500SSD1) SSD 2,5"+'"');
            MerevlemezBox.setValue("Seagate 2TB 64MB ST2000VX008 merevlemez 3,5"+'"');
        }
    }
    public void PayButtonClicked(ActionEvent actionEvent) {
        if(!((OsszegField.getText().equals("")) || (OsszegField.getText().equals("0 Ft"))) ) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("VASARLAS");
            alert.setHeaderText(null);
            alert.setResizable(true);
            alert.setContentText("Biztos meg akarja v??s??rolni a term??ket?  Ha igen kattintson az OK gombra");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("VASARLAS");
                alert1.setResizable(true);
                alert1.setHeaderText(null);
                alert1.setContentText("K??sz??nj??k a v??s??rl??st!");
                alert1.showAndWait();
            }
        }
    }
}
