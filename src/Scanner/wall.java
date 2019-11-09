package Scanner;

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the wall color?");
        String color = input.nextLine();
        System.out.println("What is the length?");
        int length = input.nextInt();
        // after using int you have to break the line if you want to use String next using input.nextLine();
        input.nextLine();
        System.out.println("Is it good one?");
        String answer = input.nextLine();
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Good?: " + answer);

    }
}
