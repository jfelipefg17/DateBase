package persistence;

import libreria.entities.Book;

import java.util.List;

public class BookDAO extends DAO{

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

  public Book searchBookByTittle(String tittle) {
    connect();
    Book book = (Book) em.createQuery("SELECT B FROM Book B WHERE B.tittle = :tittle").setParameter("tittle", tittle).getSingleResult();
    disconnect();
    return book;
  }

  public Book searchBookByIsbn(Long isbn) {
    connect();
    Book book = em.find(Book.class, isbn);
    disconnect();
    return book;
  }

  public Book searchBookByNameOfAuthor(String name) {
    connect();
    Book book = (Book) em.createQuery("SELECT B FROM Book B WHERE B.author.name = :name").setParameter("name", name).getSingleResult();
    disconnect();
    return book;
  }


  public Book searchBookByNameOfPublisher(String name) {
    connect();
    Book book = (Book) em.createQuery("SELECT B FROM Book B WHERE B.publisher.name = :name").setParameter("name", name).getSingleResult();
    disconnect();
    return book;
  }

  public List<Book> listBooks(){
    connect();
    List<Book> books = (List<Book>) em.createQuery("SELECT B FROM Book B").getResultList();
    disconnect();
    return books;
  }
}
