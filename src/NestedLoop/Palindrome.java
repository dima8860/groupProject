package NestedLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
// 2) [IQ] Palindrome: A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome. Print false if the word is not palindrome.
//> input: civic
//> output: true
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        if (newString.equals(str)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
