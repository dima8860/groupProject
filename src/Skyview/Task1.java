package Skyview;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program that determines the change to be dispensed from a vending
        //machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
        //increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
        //dollar bill to pay for the item.
        Scanner input = new Scanner(System.in);
        int price = 0;
        int quarter = 0;
        int dime = 0;
        int nickle = 0;
        System.out.println("Enter price in cents:");
        price = input.nextInt();
        int change = 100 - price;
        quarter = change/25;
        int newChange = change%25;
        dime = newChange/10;
        newChange = newChange%10;
        nickle = newChange/5;
        System.out.println("Quarters: " + quarter);
        System.out.println("dime: " + dime);
        System.out.println("nickel: " + nickle);
    }
}
