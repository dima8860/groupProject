package Scanner;

import java.util.Scanner;

public class RemoveLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String num1 = input.nextLine();
        String num2 = input.nextLine();

        System.out.println(num1 + num2.replace("e", ""));

    }
}
