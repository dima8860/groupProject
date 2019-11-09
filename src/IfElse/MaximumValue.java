package IfElse;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if ( num1 == num2 && num2 == num3) {
            System.out.println("All 3 are equal");
        }
            else if (num1 > num2 && num1 >num3) {
            System.out.println(" Maximum value of them is: " + num1);
        }
             else if (num2 > num1 && num2 >num3) {
            System.out.println(" Maximum value of them is: " + num2);
        }
                 else if (num3 > num2 && num3 >num2) {
                    System.out.println(" Maximum value of them is: " + num3);
        }
    }
}
