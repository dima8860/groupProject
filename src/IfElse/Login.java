package IfElse;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName = "Dima";
        String password = "12345";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userNameNew = input.nextLine();

        if (userNameNew.equals(userName)) {
            System.out.println("Enter password");
            String passwordNew = input.nextLine();

            if (passwordNew.equals(password)){
                System.out.println("Login successful!");
            }
            else {
                System.out.println("Wrong password");
                 }

            }
        else {
            System.out.println("Invalid username");
        }

    }
}
