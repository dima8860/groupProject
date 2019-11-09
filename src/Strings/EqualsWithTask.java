package Strings;

import java.util.Scanner;
// User will be asked to enter two full names ( first and last).
// You will determine if the two entered people are relatives
// by comparing their last names.

public class EqualsWithTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter last name");
        String lastName = scan.nextLine();

        System.out.println("Enter your body first name");
        String firstName2 = scan.nextLine();
        System.out.println("Enter your body last name");
        String lastName2 = scan.nextLine();
        if (lastName2.equalsIgnoreCase(lastName)) {
            System.out.println(firstName2 + " is your relative");
        }
        else {
            System.out.println(firstName2 + " is not your relative");
        }

    }
}
