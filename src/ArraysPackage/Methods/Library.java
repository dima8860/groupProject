package ArraysPackage.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        String [] books = {"Book1","Book2","Book3","Book4", "Book5"};
        Scanner input = new Scanner(System.in);
        System.out.println("What book do you want?");
        String userBook = input.nextLine();
        Arrays.sort(books);
        String newBook = "";
        int indexOfBook = Arrays.binarySearch(books, userBook);
        if (indexOfBook < 0) {
            System.out.println("This book is not available");
        }
        else if (indexOfBook >= 0) {
            System.out.println("What book are you returning");
            newBook = input.nextLine();
            books[indexOfBook] = newBook;

        }
        System.out.println("New library is: " + Arrays.toString(books) );
    }
}
