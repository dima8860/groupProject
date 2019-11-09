package NestedLoop;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        // 3) Write a program that asks the user to enter a word.
        // Print out how many times a character is in the given word.
        //> input: apple
        //> output:
        //apple has 1 a
        //apple has 2 p
        //apple has 1 l
        //apple has 1 e
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.nextLine();
        int count = 0;
        String checked = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            if(checked.contains(str.charAt(i) + "")) {
                continue;
            }
            for (int j = 0; j <= str.length() - 1; j++) {
                if( str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            checked += str.charAt(i) + " ";
            System.out.println(str + " has " + count + " " + str.charAt(i));
            count = 0;

        }

    }
}
