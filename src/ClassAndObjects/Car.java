package ClassAndObjects;

public class Car {
    String make;
    int year;
    boolean sportEdition;
    int mileage;

    public void drive() {
        System.out.println(year + " " + make + " is driving");
        mileage += 10;
    }
    public void drive(String destination) {
        System.out.println(year + " " + make + " is driving to " + destination);
        mileage +=10;
    }
    public void drive(int mile) {
        System.out.println(year + " " + make + " is driving " + mile + " miles" );
        mileage += mile;
    }
    public void info() {
        System.out.println("\nmake: " + make );
        System.out.println("year: " + year);
        System.out.println("mileage: " + mileage);
        System.out.println(("sport edition: " + sportEdition));
    }
}
