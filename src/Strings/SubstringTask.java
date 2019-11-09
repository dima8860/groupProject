package Strings;

import java.util.Scanner;

public class SubstringTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creating an email. Ask user to enter two strings.
        // Both of these strings should be at least 6 character long.
        // If they are shorter than that print “Invalid data” and program should end.
        //If the information provided is valid, you will take the first 4 characters of first string
        // and combine them with the last three characters of the second string.
        // At the end of your combined string add “@cybertek.com” and print the final string as your created email.
        //> input: “JamesBond”, Secret
        //> output: jameret@cybertek.com
        System.out.println("Please enter word 6 character long");
        String firstWord = scan.nextLine();
        System.out.println("Enter second word 6 character long");
        String secondWord = scan.nextLine();
        if (firstWord.length() < 6 || secondWord.length() < 6) {
            System.out.println("Invalid data");
        }
        else {
            System.out.println(firstWord.substring(0,4) + secondWord.substring(secondWord.length() - 3) +
                    "@cybertek.com");
        }


    }
}
