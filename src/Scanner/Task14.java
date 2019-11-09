package Scanner;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //Write a program what asks the user to enter two decimal numbers.
        // Take these two numbers and perform all the mathematical operations (+,-, *, /, %) on them.
        // Print all the results.
        //> input 3.5, 6
        //> output: Addition: 9.5
        //etc for Subtraction, Multiplication, Division, Remainder
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number");
        double numOne = input.nextDouble();
        System.out.println("Enter second decimal number");
        double numSecond = input.nextDouble();
        System.out.println("Addition is: " + (numOne + numSecond));
        System.out.println("Subtraction is: " + (numOne - numSecond));
        System.out.println("Multiplication is: " + (numOne * numSecond));
        System.out.println("Division is: " + (numOne / numSecond));
        System.out.println("Remainder is: " + (numOne % numSecond));
    }
}
