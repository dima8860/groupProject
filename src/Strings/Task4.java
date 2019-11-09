package Strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String month = "October";
        Scanner input = new Scanner(System.in);
        String inputUser = input.nextLine();
        if (month.equalsIgnoreCase(inputUser)) {
            System.out.println(month);
        }
        else {
            System.out.println(false);

        }
    }
}
