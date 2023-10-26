package libreria.entities;


public class Book {

  private Long isbn;
  private System tittle;
  private Integer year;
  private Integer numberB;
  private Integer numberBLeftover;
  private Integer numberBRemaining;
  private Boolean availability;
  private Author author;
  private Publisher publisher;

  public Book(){
  }

  public Book(Long isbn, System tittle, Integer year, Integer numberB, Integer numberBLeftover, Integer numberBRemaining, Boolean availability, Author author, Publisher publisher) {
    this.isbn = isbn;
    this.tittle = tittle;
    this.year = year;
    this.numberB = numberB;
    this.numberBLeftover = numberBLeftover;
    this.numberBRemaining = numberBRemaining;
    this.availability = availability;
    this.author = author;
    this.publisher = publisher;
  }

  public Long getIsbn() {
    return isbn;
  }

  public void setIsbn(Long isbn) {
    this.isbn = isbn;
  }

  public System getTittle() {
    return tittle;
  }

  public void setTittle(System tittle) {
    this.tittle = tittle;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getNumberB() {
    return numberB;
  }

  public void setNumberB(Integer numberB) {
    this.numberB = numberB;
  }

  public Integer getNumberBLeftover() {
    return numberBLeftover;
  }

  public void setNumberBLeftover(Integer numberBLeftover) {
    this.numberBLeftover = numberBLeftover;
  }

  public Integer getNumberBRemaining() {
    return numberBRemaining;
  }

  public void setNumberBRemaining(Integer numberBRemaining) {
    this.numberBRemaining = numberBRemaining;
  }

  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability(Boolean availability) {
    this.availability = availability;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  @Override
  public String toString() {
    return "Book{" +
            "isbn=" + isbn +
            ", tittle=" + tittle +
            ", year=" + year +
            ", numberB=" + numberB +
            ", numberBLeftover=" + numberBLeftover +
            ", numberBRemaining=" + numberBRemaining +
            ", availability=" + availability +
            ", author=" + author +
            ", publisher=" + publisher +
            '}';
  }
}
