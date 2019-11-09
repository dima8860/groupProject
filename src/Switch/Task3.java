package Switch;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        int age = input.nextInt();
        if (age >=30 && age <= 100 ) {
            System.out.println("Welcome to building");
        }
        else if (age <= 0 || age > 100) {
            System.out.println("Not a valid age");
        }
        else {
            System.out.println("Sorry try again when you're 30");
        }
    }
}
