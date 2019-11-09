package Scanner;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        int ageRetirement = 65;
        int result = ageRetirement - age;
        System.out.println("Because you are: " + age + " you will retire in: " + result);

    }
}
