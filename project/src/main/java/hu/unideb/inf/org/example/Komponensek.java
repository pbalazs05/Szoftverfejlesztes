package hu.unideb.inf.org.example;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Komponensek {

    private String Name;
    private int Price;  //ár
    private int Piece;  //darab
    private int Id;

    public String getKp_Id() { return kp_Id; }

    public void setKp_Id(String kp_Id) { this.kp_Id = kp_Id; }

    private String kp_Id;

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }


    public int getPrice() { return Price; }

    public void setPrice(int price) { this.Price = price; }


    public int getPiece() { return Piece; }

    public void setPiece(int piece) { this.Piece = piece; }

    @GeneratedValue
    @Id
    public int getId() { return Id; }

    public void setId(int id) { Id = id; }
}
