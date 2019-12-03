package ClassAndObjects;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Book book1= new Book("java", "cybertek", 200);
        Book book2= new Book("automation", "cybertek", 100);
        Book book3= new Book("backend", "cybertek", 300);

        Book [] myBooks = new Book[3];
      myBooks[0] = book1;
       myBooks[1] = book2;
        myBooks[2] = book3;

        myBooks[0].pages = 50;



        for(int i = 0 , j = 50; i < myBooks.length; i++, j +=100) {
            myBooks[i].pages = j;
        }
        for(Book eachBook: myBooks) {
             System.out.println(eachBook.title +  " has " + eachBook.pages + " pages.");
            eachBook.info();
        }
        Scanner input = new Scanner(System.in);

        // Create a program that will ask the user how many books they have.
        // Then they will be asked to enter the book’s title, author, and number of pages.
        // Create each book object and store them into a Book array.
        System.out.println("How many books?");
        int number = input.nextInt();
        input.nextLine();
        Book [] customersBooks = new Book[number];
        for(int  i = 0; i < customersBooks.length; i++) {
            System.out.println("Enter name");
           String name = input.nextLine();
            System.out.println("Enter author");
            String author = input.nextLine();
            System.out.println("Enter pages");
            int pages = input.nextInt();
            input.nextLine();
          //  Book eachBook = new Book(name,author,pages);
         //   customersBooks[i] = eachBook;

            customersBooks[i] = new Book(name,author,pages);
        }
        for(Book eachBook: customersBooks) {
            eachBook.info();
        }

    }
}
