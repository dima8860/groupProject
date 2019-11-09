package Switch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1) Write a program that will ask the user to enter a number from 1 to 9.
        // They should see the number they entered in word format.
        // If the number is not in the range print: “Invalid number”
        //> input: 5
        //> output: five
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one number from 1 to 9");
        int num = input.nextInt();
        switch(num) {
            case (1):
                System.out.println("one");
                break;
            case (2):
                System.out.println("two");
                break;
            case (3):
                System.out.println("three");
                break;
            case (4):
                System.out.println("four");
                break;
            case (5):
                System.out.println("five");
                break;
            case (6):
                System.out.println("six");
                break;
            case (7):
                System.out.println("seven");
                break;
            case (8):
                System.out.println("eight");
                break;
            case (9):
                System.out.println("nine");
                break;
            default:
                System.out.println("Invalid number");




        }
    }
}
