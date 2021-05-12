package hu.unideb.inf.model;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Connect {

    public Connection conn;
    public ResultSet rs;
    private java.sql.Statement st;
    public Connect() {
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/adatbazis";
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "root", "");
            System.out.println("sikerült a csatlakozas");
        }
        catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("Hiba történt az adatbázishoz valo csatlakozáskor: " + e.getMessage());
            alert.showAndWait();
        }
    }
/*
    public String[] getData(String select, String from, String where){
        System.out.println("bármi");
        where= " WHERE "+where;
        try{
            String query="SELECT "+select+" FROM "+from+" "+where;
            System.out.println(query);
            st= conn.createStatement();
            rs=st.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            String columnName[] = new String[count];
            for (int i = 1; i <= count; i++)
            {
             //   System.out.println(metaData.getColumnLabel(i));
                columnName[i-1] = metaData.getColumnLabel(i);
            }
            return columnName;
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }*/

    public String[] getData(String select, String from, String where){
        where = " WHERE " + where;
        try {
            String query = "SELECT " + select + " FROM " + from + " " + where;
            st = conn.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            String columnName[] = new String[count];
            for (int i = 1; i <= count; i++)
            {
                columnName[i-1] = metaData.getColumnLabel(i);
            }
            return columnName;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }


    public String[] getData1(String select, String from) {
        try {
            String query = "SELECT " + select + " FROM `" + from + "`";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            String columnName[] = new String[count];
            for (int i = 1; i <= count; i++)
            {
                columnName[i-1] = metaData.getColumnLabel(i);
            }
            return columnName;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
