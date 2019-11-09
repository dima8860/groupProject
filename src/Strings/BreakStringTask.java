package Strings;

import java.util.Scanner;

public class BreakStringTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // User will be given a string:
        //“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
        //> You will separate these parts and print them separately. > Print the following:
        //“Sender: actualSender”
        //“Number: actualNumber”
        //“Message: actualMessage”
        String str = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
        int part1Index1 = str.indexOf("<");
        int part1Index2 = str.indexOf(">");

        int part2Index1 = str.indexOf("[");
        int part2Index2 = str.indexOf("]");

        int part3Index1 = str.indexOf("{");
        int part3Index2 = str.indexOf("}");

        System.out.println("Sender: " + str.substring(part1Index1+1,part1Index2));
        System.out.println("Number: " + str.substring(part2Index1+1,part2Index2));
        System.out.println("Message: " + str.substring(part3Index1+2,part3Index2));


    }
}
