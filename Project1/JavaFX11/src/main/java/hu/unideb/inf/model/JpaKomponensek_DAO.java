package hu.unideb.inf.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaKomponensek_DAO implements  Komponensek_DAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveKomponensek(Komponensek a) {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteKomponensek(Komponensek a) {
        entityManager.getTransaction().begin();
        entityManager.remove(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateKomponensek(Komponensek a) {
        saveKomponensek(a);
    }

    @Override
    public List<Komponensek> getAllKomponens() {
        TypedQuery<Komponensek> query = entityManager.createQuery("SELECT * FROM Komponensek ", Komponensek.class);
            return query.getResultList();
    }

    @Override
    public void close() throws Exception{
        entityManager.close();
        entityManagerFactory.close();
    }


}
