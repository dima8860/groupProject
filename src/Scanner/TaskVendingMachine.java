package Scanner;

import java.util.Scanner;

public class TaskVendingMachine {
    public static void main(String[] args) {
        //Vending machine change.
        // Write a program that will ask used to enter a whole number from 1 to 99.
        // User will get back the amount of quarters, dimes, nickels,
        // and pennies that are needed to equal to the provided number.
        //> input
        //Enter your change
        //68
        //> output
        //Your change of 68 was converted to: quarters: 2
        //dimes: 1
        //nickels: 1
        //pennies: 3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 1 to 99");
        int amount = input.nextInt();
        int quarters, dimes, nickels, pennies, newAmount;
        quarters = amount / 25;
        newAmount = amount % 25;
        System.out.println("Quarters: " + quarters);
        dimes = newAmount / 10;
        newAmount = newAmount % 10;
        System.out.println("Dimes: " + dimes);
        nickels = newAmount / 5;
        newAmount = newAmount % 5;
        pennies = newAmount;
        System.out.println("Pennies: " + pennies);






    }
}
