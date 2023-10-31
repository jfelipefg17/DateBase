package persistence;

import libreria.entities.Author;

import java.util.List;

public class AuthorDAO extends DAO{

  @Override
  protected void safe(Object obj) {
    super.safe(obj);
  }

  @Override
  protected void edit(Object obj) {
    super.edit(obj);
  }

  @Override
  protected void delete(Object obj) {
    super.delete(obj);
  }

  public Author searchAuthorByName (String name) {
    connect();
    Author author = (Author) em.createQuery("SELECT A FROM Author A WHERE A.name LIKE :name").setParameter("name", name).getSingleResult();
    disconnect();
    return author;
  }

  public Author searchAuthorByID (int id) {
    connect();
    Author author = em.find(Author.class, id);
    disconnect();
    return author;
  }








  public List<Author> listAuthors() {
    connect();
    List<Author> authors = (List<Author>) em.createQuery("SELECT A FROM Author A").getResultList();
      disconnect();
      return authors;
  }
}
