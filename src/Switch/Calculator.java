package Switch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        System.out.println("Enter second number");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter operation");
        char operation = input.nextLine().charAt(0);
        switch (operation) {
            case '+':
                System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
                break;
        }
    }
}
