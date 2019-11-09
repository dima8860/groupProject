package Scanner;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //Write a program that will ask user to enter two numbers.
        // Declare a boolean with the following value: numberOne == numberTwo.
        // Print the resulting boolean.
        //> input: 4, 5
        //>output: false
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int numOne = input.nextInt();
        System.out.println("Enter second number");
        int numSecond = input.nextInt();
        boolean value = (numOne == numSecond);
        System.out.println(value);

    }
}
