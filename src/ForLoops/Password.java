package ForLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "secret478";

        for (int i = 0 ; i < 3 ; i++ ) {
            System.out.println("Please enter password");
            String passwordInput = input.nextLine();
            if (password.equals(passwordInput)) {
                System.out.println("Welcome to your profile!");
                break;
            }
                else if (i == 2) {
                System.out.println("Try in 5 hours");
            }
        }
    }
}
