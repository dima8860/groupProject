package Scanner;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Write a program that will ask user to enter two numbers.
        // Declare a boolean with the following value: numberOne > numberTwo.
        // Print the resulting boolean.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        boolean result = (num1 > num2);
        System.out.println(result);


    }
}
