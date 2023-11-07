package libreria.services;

import libreria.entities.Book;
import persistence.BookDAO;
import persistence.DAO;

import java.util.List;
import java.util.Scanner;

public class BookService {

  private final BookDAO DAO;

  public BookService() {
    this.DAO = new BookDAO();
  }
  public void searchBookByIsbn(){
    Scanner read = new Scanner(System.in);

    listBook();
    System.out.println("================");
    System.out.println("enter isbn");
    Long isbn = read.nextLong();

    Book book = DAO.searchBookByIsbn(isbn);

    if (book == null) {
      System.out.println("==================");
      System.out.println("THERE ISN'T BOOK WITH THAT ISBN");
      System.out.println("==================");
    }else {

      System.out.println(book.toString());

//      System.out.println("====================");
//      System.out.println("TITTLE: " + book.getTittle());
//      System.out.println("YEAR: " + book.getYear());
//      System.out.println("AVAILABILITY: " + book.getAvailability());
//      System.out.println("====================");
    }
  }

  public void searchBookByTittle(){
    Scanner read = new Scanner(System.in);

    listBook();
    System.out.println("================");
    System.out.println("enter tittle");
    String tittle = read.nextLine();

    Book book = DAO.searchBookByTittle(tittle);

    if (book == null) {
      System.out.println("==================");
      System.out.println("THERE ISN'T BOOK WITH THAT TITTLE");
      System.out.println("==================");
    }else {

      System.out.println(book.toString());

//      System.out.println("====================");
//      System.out.println("TITTLE: " + book.getTittle());
//      System.out.println("YEAR: " + book.getYear());
//      System.out.println("AVAILABILITY: " + book.getAvailability());
//      System.out.println("====================");
    }
  }

  public void searchBookByNameAuthor(){
    Scanner read = new Scanner(System.in);

    listBook();
    System.out.println("================");
    System.out.println("enter name of author of the book");
    String name = read.nextLine();

    Book book = DAO.searchBookByNameOfAuthor(name);

    if (book == null) {
      System.out.println("==================");
      System.out.println("THERE ISN'T BOOK WITH THAT AUTHOR");
      System.out.println("==================");
    }else {

      System.out.println(book.toString());

//      System.out.println("====================");
//      System.out.println("TITTLE: " + book.getTittle());
//      System.out.println("YEAR: " + book.getYear());
//      System.out.println("AVAILABILITY: " + book.getAvailability());
//      System.out.println("====================");
    }
  }


  public void searchBookByNamePublisher(){
    Scanner read = new Scanner(System.in);

    listBook();
    System.out.println("================");
    System.out.println("enter name of publisher of the book");
    String name = read.nextLine();

    Book book = DAO.searchBookByNameOfPublisher(name);

    if (book == null) {
      System.out.println("==================");
      System.out.println("THERE ISN'T BOOK WITH THAT PUBLISHER");
      System.out.println("==================");
    }else {

      System.out.println(book.toString());

//      System.out.println("====================");
//      System.out.println("TITTLE: " + book.getTittle());
//      System.out.println("YEAR: " + book.getYear());
//      System.out.println("AVAILABILITY: " + book.getAvailability());
//      System.out.println("====================");
    }
  }

  public void listBook(){
    List<Book> books = DAO.listBooks();

    for (Book aux: books) {
      System.out.println(aux.toString());
//      System.out.println("TITTLE: " + aux.getTittle());
//      System.out.println("YEAR: " + aux.getYear());
//      System.out.println("AVAILABILITY: " + aux.getAvailability());
    }
  }
}
