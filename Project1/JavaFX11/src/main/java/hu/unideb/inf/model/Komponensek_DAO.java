package hu.unideb.inf.model;

import javafx.collections.ObservableList;

import java.util.List;
import java.util.Set;

public interface Komponensek_DAO extends AutoCloseable {
    public void saveKomponensek(Komponensek a);
    public void deleteKomponensek(Komponensek a);
    public void updateKomponensek(Komponensek a);
    public List<Komponensek> getAllKomponens();


}
