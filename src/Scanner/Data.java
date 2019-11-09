package Scanner;

import java.util.Scanner;

public class Data {

    public static void main(String[] args) {


//        String name = "James";
//        String lastName = "Bond";
//        int age = 45;
//        String location = "London, UK";
//        boolean isHeOk = true;

        // That was a hard coding above. Means code is static and won't be changed.

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        // here we can use any name instead of input. Must match Scanner input and input.nextLine()
        System.out.println("Welcome, " + name + "!");

        System.out.println("Where do you live? ");
        String location = input.nextLine();
        System.out.println(name + " lives in " + location);


        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println(name + " is " + age + " old.");
        input.nextLine();
        System.out.println("You have a great day today, aren't you?");
        String moodNew = input.nextLine();















    }
}
