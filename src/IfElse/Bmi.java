package IfElse;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter mass");
        double mass = input.nextDouble();
        System.out.println(" Enter height");
         double height = input.nextDouble();
        double bmi = mass / (height * height);
        if (bmi < 18.5) {
            System.out.println(" Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 25 ) {
            System.out.println(" Normal weight");
        }
        else if (bmi > 25 && bmi < 30) {
            System.out.println("Overweight");
        }
        else if (bmi >= 30) {
            System.out.println("Obese");
        }
    }
}
