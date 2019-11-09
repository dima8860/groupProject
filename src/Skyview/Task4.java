package Skyview;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Given two strings of lowercase English letters, word1  and word2, perform the following operations:
        //
        //Sum the lengths of word1 and word2 and print
        //Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
        //
        //Sample Input:
        //hello world
        //
        //Sample Output:
        //10
        //Hello World
        //
        //
        //Sample Input:
        //java cool
        //
        //Sample Output:
        //8
        //Java Cool
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();
        int spaceIndex= str3.indexOf(" ");
        String strFirst = str3.substring(0,spaceIndex);
        System.out.println(strFirst);
        String strSecond = str3.substring(spaceIndex + 1);
        System.out.println(strSecond);
        System.out.println(strFirst.length()+strSecond.length());
        String firstCharFirstWord = strFirst.substring(0,1).toUpperCase();
        String firstCharSecondWord = strSecond.substring(0,1).toUpperCase();
        System.out.println(firstCharFirstWord + strFirst.substring(1) + " " + firstCharSecondWord + strSecond.substring(1));
    }
}
