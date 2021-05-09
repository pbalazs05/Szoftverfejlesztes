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

    public Komponensek(String name, int price, int piece, int id) {
        Name = name;
        Price = price;
        Piece = piece;
        Id = id;
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

    @Override
    public String toString() {
        return Name;
    }
}
