package Strings;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        // You have a String with the following value:
        //    -> “We will have a picnic when the weather gets nicer”
        //First print the given sentence. Then the user is asked to enter the following: the set of characters from the sentence they want to change,
        // and the set of characters that will show up in place of the ones which were removed. Print the new sentence.
        //> input: “w” , “La”
        //> output: “We Laill have a picnic Lahen the Laeather gets nicer”
        String  str = "We will have a picnic when the weather gets nicer";
        System.out.println(str);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter characters which you want to replace with");
        System.out.println("enter current value");
        String oldChar = scan.nextLine();
        System.out.println("Enter new value");
        String newChar = scan.nextLine();
        System.out.println(str.replace(oldChar,newChar));

    }
}
