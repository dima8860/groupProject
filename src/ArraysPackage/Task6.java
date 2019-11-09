package ArraysPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names are in your household?");
        int number = input.nextInt();
        input.nextLine();
        String [] names = new String[number];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name " + (i + 1));
            String userInput = input.nextLine();
            names[i] = userInput;
        }
        System.out.println(Arrays.toString(names));
    }
}
