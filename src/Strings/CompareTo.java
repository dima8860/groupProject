package Strings;

import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        // 5) User takes two strings from the user.
        // Compare the Strings and print out the String that comes first lexicographically.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 word");
        String word1 = scan.nextLine();
        System.out.println("Enter second word");
        String word2 = scan.nextLine();
        System.out.println(word1.compareTo(word2));
    }

}
