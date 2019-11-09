package Strings;


import java.util.Scanner;

public class IndexOfWord {
    public static void main(String[] args) {

        String str = "Cybertek is located in Des Plaines";
        Scanner input = new Scanner(System.in);
        String inputUser = input.nextLine();
        System.out.println(inputUser + " starts at: " + str.indexOf(inputUser));

    }
}