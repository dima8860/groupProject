package Skyview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str2 = input.next();
        int i = str2.length() - 1;
        int j = 0; // first char
        outer: for(i = str2.length() - 1, j = 0; i >= 0 && j < str2.length() ; i--, j++  ) {
            if(str2.charAt(i) == str2.charAt(j)) {
                continue ;
            }
            else {
                System.out.println("Not a palindrome");
                break outer;
            }

        }
        System.out.println(str2 +  " is a palindrome");
    }
}
