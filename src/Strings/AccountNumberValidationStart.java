package Strings;

import java.util.Scanner;

public class AccountNumberValidationStart {
    public static void main(String[] args) {
    // User is asked to enter an account number. You will check if these account numbers are valid.
        //    > If the account number begins with a “2” the account number should be 7 characters long
        //    > If the account number begins with a “5” the account number should be 10 characters long
        //—> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “ Invalid account number”
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String account = input.nextLine();
        int account7 = 7;
        int account10 = 10;
        if (account.startsWith("2")) {
            if (account.length() == account7) {
                System.out.println("Account valid");
            }
            else {
                System.out.println("Account not valid");
            }

        }
        else if (account.startsWith("5")) {
            if (account.length() == account10) {
                System.out.println("Account valid");
            }
            else {
                System.out.println("Account not valid");
            }
        }
        else {
            System.out.println("Account not valid");
        }

    }
}
