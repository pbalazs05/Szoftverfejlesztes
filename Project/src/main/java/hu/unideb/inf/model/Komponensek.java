package hu.unideb.inf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Komponensek")
public class Komponensek {

    private String Name;
    private int Price;  //ár
    private int Piece;  //darab
    private int Id;
    private String KP_ID;

    public Komponensek(String name, int price, int piece, int id, String kp_id) {
        Name = name;
        Price = price;
        Piece = piece;
        Id = id;
        KP_ID = kp_id;
    }

    public Komponensek() {

    }

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPiece() {
        return Piece;
    }

    public void setPiece(int piece) {
        Piece = piece;
    }

    @GeneratedValue
    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getKP_ID() {
        return KP_ID;
    }

    public void setKP_ID(String KP_ID) {
        this.KP_ID = KP_ID;
    }


    @Override
    public String toString() {
        return Name;
    }
}
