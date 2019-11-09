package ReturnMethods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(getCalculator("/", 2, 3));
    }




    public static double getCalculator (String operator, double a, double b) {
        double result = 0;
        switch (operator) {
            case "+" :  result = a + b;
break;
            case "-" :  result = a - b;
                break;
            case "/" :  result = a / b;
                break;
            case "%" :  result = a % b;
                break;
            case "*" :  result = a * b;
                break;
            default:
                System.out.println("Invalid operator");

        }
        return result;
    }
}
