package ClassAndObjects;

public class Book {
    String title; // instance variables; and default constructor is hidden.
    Author author;
    int pages;
    int [] chapter;
    public Book(String title) {
this.title = title;
    }
    public Book(String title, String author) {
        this(title);
        this.author.name = author;

    }
    public Book(String title, String author, int pages) {
        this(title,author);
        this.pages = pages;
    }


    public void info(){
        System.out.println("Name " + this.title);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }
}
