package Strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();

        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        String restOfTheWord = name.substring(1).toLowerCase();
        System.out.println(firstLetter + restOfTheWord);
    }
}
