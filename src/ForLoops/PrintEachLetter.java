package ForLoops;

import java.util.Scanner;

public class PrintEachLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        for (int i = 0; i < 15; i++) {
            System.out.println(i + ". Welcome " + name);
        }
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + "  " + i);
        }
    }
}
