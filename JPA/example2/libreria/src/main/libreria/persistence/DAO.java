package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.*;

public abstract class DAO {
  protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
  protected EntityManager em = emf.createEntityManager();

  protected void connect() {
    if (!em.isOpen()) {
      em = emf.createEntityManager();
    }
  }

  protected void disconnect() {
    if (em.isOpen()) {
      em.close();
    }
  }

  protected void safe(Object obj) {
    connect();
    em.getTransaction().begin();
    em.persist(obj);
    em.getTransaction().commit();
    disconnect();
  }

  protected void edit(Object obj) {
    connect();
    em.getTransaction().begin();
    em.merge(obj);
    em.getTransaction().commit();
    disconnect();
  }

  protected void delete(Object obj) {
    connect();
    em.getTransaction().begin();
    em.remove(obj);
    em.getTransaction().commit();
    disconnect();
  }

}
