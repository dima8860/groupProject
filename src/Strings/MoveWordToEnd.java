package Strings;

import java.util.Scanner;

public class MoveWordToEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence please");
        String sentence = input.nextLine();
        int spaces = sentence.indexOf(" ");
        String trimmedSentence = sentence.substring(spaces+1);
        String firstWord = sentence.substring(0,spaces);
        System.out.println(trimmedSentence + " " + firstWord);

    }
}
