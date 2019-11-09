package WhileLoop;

import java.util.Scanner;

public class StartWith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        while (name.startsWith("J")) {
            System.out.println("Enter your name");
            name = input.nextLine();

        }

    }
}
