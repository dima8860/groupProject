package WhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class YesNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int numberInput = input.nextInt();

        String yes = "yes";
        String y = "y";
        String no = "no";
        String n = "n";
        input.nextLine();

        System.out.println("Would you like to add 1?");
        String answer = input.nextLine();

        while (answer.equals(yes) || answer.equals(y)) {
            numberInput++;
            System.out.println("Would you like to add 1?");
            answer = input.nextLine();
        }

        if (answer.equals(no) || answer.equals(n)) {
            System.out.println("your number is: " + numberInput);
        }

    }
}
