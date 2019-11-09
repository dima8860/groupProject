package ForLoops;


import java.util.Scanner;

public class AskNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". Please enter name");
            String name = scan.nextLine();
            System.out.println(name);

        }
    }
}
