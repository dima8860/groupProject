package WhileLoop;

import java.util.Scanner;

public class PrintCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numbers = input.nextInt();
        int start = 0;
        while(start <= numbers) {
            System.out.println(start++);
        }
    }

}
