package Scanner;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes:");
        int minutes = input.nextInt();
        int hours = minutes/60;
        int newMinutes = minutes % 60;
        System.out.println(hours + " hour" + " and " + newMinutes+" minutes ");
    }
}
