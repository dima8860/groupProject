package Skyview;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Task 1
        //Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....
        //
        //Example:
        //Input:
        //6
        //Output:
        //0 1 1 2 3 5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        String fibonacci = "";
        for (int i = 1; i <=x ; i++) {
            fibonacci += num1 + " ";
            int sumOfTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfTwo;
        }
        System.out.println(fibonacci);
    }
}
