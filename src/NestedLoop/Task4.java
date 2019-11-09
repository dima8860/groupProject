package NestedLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double sum = 0;
        double average = 0;
        double count = 0;
        for (double i = num1; i <= num2; i++) {
            count++;
            sum = sum + i;
             average = sum/count;
        }
        System.out.println("Sum of 2 numbers is: " + sum);


        System.out.println("Average is: " + average);
    }
}
