package Strings;

import java.util.Scanner;

public class AgeManipulation {
    public static void main(String[] args) {
        // User enters a sentence like this:
        //    > “I am x years old”
        //    We want to take their age and change it. Add 5 to their age and print: “In 5 years you will be: newAge years old”
        //> input: “I am 20 years old”
        //> output: In 5 years you will be 25 years old
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write sentence: \"I am X years old\"  where \"X\" is your age");
        String str = scan.nextLine();
        int index1 = str.indexOf("am ")+3;
        int index2 = str.indexOf(" years");
        String age = str.substring(index1,index2);
        System.out.println(age);
        // int num = Integer.valueOf(str);
        //        double numDouble = Double.valueOf(str);

        int ageInteger = Integer.valueOf(age);
        System.out.println("In 5 years you will be: " + (ageInteger + 5));

    }
}
