package Strings;

import java.util.Scanner;

public class AccountManipulation {
    public static void main(String[] args) {
        // User is asked to enter an account number. You will check if these account numbers are valid.
        //> If the account number begins with a “2” the account number should be 7 characters long
        //> If the account number begins with a “5” the account number should be 10 characters long
        //—> If the account number does not begin with a 2 or a
        // Or the account number lengths do not meet the expected results print “ Invalid account number”
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account");
        String account = scan.nextLine();
        if (account.startsWith("2") && account.length() == 7) {
            System.out.println("Valid");
        }
        else if (account.startsWith("5") && account.length() == 10) {
            System.out.println("Valid");
        }

        else if (!account.startsWith("2") || account.length() != 7 || !account.startsWith("5") || account.length() != 10){
            System.out.println("Invalid");
        }
    }
}
