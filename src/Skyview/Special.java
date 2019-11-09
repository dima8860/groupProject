package Skyview;

import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        // Accept a String and print only unique characters in the String:

        //Input:
        //java
        //Output:
        //jav

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String newStr = str.charAt(0) + "";

        for ( int i = 1; i < str.length() ; i++ ) {


            if (newStr.contains(str.charAt(i) + "")) {
                continue;
            }
            else {
                newStr += str.charAt(i) + "";
            }
        }
        System.out.println(newStr);




    }
}
