package Switch;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        //Write a program that asks a user to enter a number corresponding to the day of the week starting from 1 being Sunday, 2 being Monday, etc…
        //If the number is not between 1 and 7 print “invalid day”
        //> input: 7
        //> output: Saturday
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter day number");
        int day = input.nextInt();

        switch (day) {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
