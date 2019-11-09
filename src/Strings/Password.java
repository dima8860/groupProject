package Strings;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        //Credentials: Given two existing data: user and pass of “test” and “test123”
        //Write a program that asks users to enter a username and password.
        //—> If the username and password match print: “ Welcome!”
        //—> If username is incorrect print: “invalid username” and don’t ask for the password
        //—> If password is incorrect print: “invalid password”
        String user = "test";
        String pass = "test123";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter user name");
        String userInput =input.nextLine();
        if (user.equals(userInput)) {
            System.out.println("Please enter password");
            String passInput = input.nextLine();
            if (pass.equals(passInput)) {
                System.out.println("Welcome!");
            }
            else {
                System.out.println("Invalid password");
            }
        }
        else {
            System.out.println("Invalid username");
        }


    }
}
