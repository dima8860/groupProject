package Strings;


import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        // You have a car garage with these car brands.
        // You will check the cars and print the following messages:>
        // If the garage is empty print “No cars in your garage” >
        // If you have a Toyota or Nissan print “There is a Japanese car in your garage”>
        // If you have a BMW print “There is a German car in your garage”>
        // If you have a Maserati print “There is an Italian car in your garage”>
        // If you have a Jaguar print “There is a British car in your garage”—>
        // If the garage does not have a car of that type, print “No xcars”
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your car");
        String carBrand = scan.nextLine();
        if (carBrand.contains("")) {
            System.out.println("No cars in your garage");
        }
        else if (carBrand.contains("Toyota") || carBrand.contains("Nissan")) {
            System.out.println("There is a Japanese car in your garage");
        }
        else if (carBrand.contains("BMW") ) {
            System.out.println("There is a German car in your garage");
        }
        else if (carBrand.contains("Maserati") ) {
            System.out.println("There is an Italian car in your garage");
        }
        else if (carBrand.contains("Jaguar") ) {
            System.out.println("There is a British car in your garage");
        }
        else {
            System.out.println("There is no " + carBrand + " in  your garage");
        }



    }
}
