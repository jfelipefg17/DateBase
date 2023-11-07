package libreria.services;

import libreria.entities.Author;
import persistence.AuthorDAO;
import persistence.DAO;

import java.util.List;
import java.util.Scanner;

public class AuthorService {

  private final AuthorDAO DAO;

  public AuthorService() {
    this.DAO = new AuthorDAO();
  }

  public void searchAuthorByName() {
    Scanner read = new Scanner(System.in);

    listAuthors();
    System.out.println("==========");
    System.out.println("Enter Name of the author");
    String id = read.nextLine();

    Author author = DAO.searchAuthorByName(id);

    if (author == null) {

      System.out.println("==================");
      System.out.println("THERE ISN'T AUTHORS WITH THAT NAME");
      System.out.println("==================");

    } else {
      System.out.println("==================");
      System.out.println("ID: " + author.getId());
      System.out.println("NAME: " + author.getName());
      System.out.println("AVAILABILITY: " + author.getAvailability());
      System.out.println("==================");

    }

  }

  public void searchAuthorById() {
    Scanner num = new Scanner(System.in);

    listAuthors();
    System.out.println("==========");
    System.out.println("Enter id of the author");
    int id = num.nextInt();

    Author author = DAO.searchAuthorByID(id);

    if (author == null) {

      System.out.println("==================");
      System.out.println("THERE ISN'T AUTHORS WITH THAT ID");
      System.out.println("==================");

    } else {
      System.out.println("==================");
      System.out.println("ID: " + author.getId());
      System.out.println("NAME: " + author.getId());
      System.out.println("AVAILABILITY: " + author.getId());
      System.out.println("==================");

    }

  }

  public void listAuthors(){
    List<Author> authors = DAO.listAuthors();

    for (Author aux: authors) {
//      System.out.println(aux.toString());
      System.out.println("NAME: " + aux.getName());
      System.out.println("ID: " + aux.getId());
      System.out.println("AVAILABILITY: " + aux.getAvailability());
      System.out.println("================================");
      System.out.println(" ");
    }
  }
}
