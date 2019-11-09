package ForLoops;

import java.util.Scanner;

public class DoubleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String str = input.nextLine();

        String str1 = "";
        int count = 0;
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str.substring(i, i + 1) + str.substring(i, i + 1);
            System.out.print(str1);
        }

    }
}
