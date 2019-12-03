package Replit;

public class Testing {
    public static void main(String[] args) {


        Book book1 = new Book(44, "shel silverstein" ,"the Giving tRee",1);
        Book book2 = new Book (42, "shele silversteine" ,"panda in forest",1);
        System.out.println( Shelf.addBook(book1));
        System.out.println( Shelf.addBook(book2));
        System.out.println(Shelf.getTheBooks());

       // System.out.println(Shelf.findBookByPartialTitle("forest"));
      //  Shelf.removeBook(42);
        Shelf.removeBook("shel silverstein");
        System.out.println(Shelf.getTheBooks());
        System.out.println(Date.isLeapYear(1996));
    }
}
