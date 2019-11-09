package IfElse;

import java.util.Scanner;

public class OddEven2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int evens = 0;
        int odds = 0;
        if (num1 % 2 == 0) {
            evens++;
        }
            else {
                odds++;
        }
        if (num2 % 2 == 0) {
            evens++;
        }
        else {
            odds++;
        }
        if (num3 % 2 == 0) {
            evens++;
        }
        else {
            odds++;
        }
        if (num4 % 2 == 0) {
            evens++;
        }
        else {
            odds++;
        }
        if (num5 % 2 == 0) {
            evens++;
        }
        else {
            odds++;
        }
        System.out.println("odds: " + odds);
        System.out.println("evens: " + evens);
    }
}
