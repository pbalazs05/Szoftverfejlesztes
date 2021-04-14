package hu.unideb.inf.org.example;

import java.util.List;

public interface Komponensek_DAO extends AutoCloseable{
    public void saveKomponensek(Komponensek a);
    public void deleteKomponensek(Komponensek a);
    public void updateKomponensek(Komponensek a);
    public List<Komponensek> getKomponensek();
}
