package IfElse;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Please enter operator");
        char operator = input.next().charAt(0);
        double result = 0;
        if (operator == '+' ) {
             result = num1 + num2;
            System.out.println(result);
        }
        else if (operator == '-' ) {
            result = num1 - num2;
            System.out.println(result);
        }
        else if (operator == '*' ) {
            result = num1 * num2;
            System.out.println(result);
        }
         else if (operator == '/' ) {
            result = num1 / num2;
            System.out.println(result);
        }
         else {
            System.out.println("Invalid operator");
        }


    }
}
