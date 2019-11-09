package Scanner;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Write a program that will ask user to enter two characters.
        // Declare a boolean with the following value: charOne > charTwo.
        // Print the resulting boolean.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter character");
        char char1 = input.nextLine().charAt(0);
        System.out.println("Enter second character");
        char char2 = input.nextLine().charAt(0);
        boolean boolean1 = (char1 > char2);
        System.out.println(boolean1);


    }
}
