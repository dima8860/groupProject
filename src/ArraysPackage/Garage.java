package ArraysPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("How many cars you have");
        int carsNumber = input.nextInt();
        input.nextLine();
        String [] arrayGarage = new String[carsNumber];
        for (int i = 0 ; i < arrayGarage.length; i++) {
            System.out.println("Enter your " + (i+1) + " car");
            arrayGarage[i] = input.nextLine();
        }
        System.out.println("This your garage: " + Arrays.toString(arrayGarage));
    }
}
