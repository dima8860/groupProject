package Scanner;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Write a program that will ask user to enter two whole numbers. Increment the first number by the second number 3 times. Print the information in this format:
        //Your number is: firstNumber after being incremented by secondNum counter times

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        int counter = 0;
        ++counter;
        firstNumber += secondNumber;
        System.out.println("Your number is: " + firstNumber + " after being incremented by " + secondNumber + ", " + counter + " times");
        ++counter;
        firstNumber += secondNumber;
        System.out.println("Your number is: " + firstNumber + " after being incremented by " + secondNumber + ", " + counter + " times");
        ++counter;
        firstNumber += secondNumber;
        System.out.println("Your number is: " + firstNumber + " after being incremented by " + secondNumber + ", " + counter + " times");



    }
}
