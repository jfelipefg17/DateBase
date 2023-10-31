package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import libreria.entities.Author;
import libreria.services.AuthorService;
import libreria.services.BookService;
import libreria.services.PublisherService;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
    EntityManager em = emf.createEntityManager();

    Scanner num = new Scanner(System.in);

    BookService bookService = new BookService();
    AuthorService authorService = new AuthorService();

    Boolean ss = true;
    int opt;

    do {

      System.out.println("===============");
      System.out.println("1. Search Author by name");
      System.out.println("===============");
      System.out.println("2. Search book by ISBN");
      System.out.println("===============");
      System.out.println("3. Search book by tittle");
      System.out.println("===============");
      System.out.println("4. Search a book by name of Author");
      System.out.println("===============");
      System.out.println("5. Search a book by publisher");
      System.out.println("===============");
      System.out.println("6. exit");
      System.out.println("===============");
      opt = num.nextInt();

      switch (opt) {
        case 1:
          authorService.searchAuthorByName();
          break;
        case 2:
          bookService.searchBookByIsbn();
          break;
        case 3:
          bookService.searchBookByTittle();
          break;
        case 4:
          bookService.searchBookByNameAuthor();
          break;
        case 5:
          bookService.searchBookByNamePublisher();
          break;
        case 6:
          ss = false;
          break;
        default:
          System.out.println("wrong answer try again number between 1-7");
          break;
      }

    }while (ss);


  }

}