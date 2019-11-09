package IfElse;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        int passCode = 1111;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter code");
        int enterCode = input.nextInt();
        if (enterCode < 0) {
            System.out.println(" No negative number");
        }
        else if (enterCode > 9999) {
            System.out.println("You entered more digits");
        }
        else if ( passCode == 0000 && passCode == enterCode ){
            System.out.println("Welcome");
        }
        else if (enterCode <= 999 && enterCode > 0 ) {
            System.out.println(" You entered less digits");
        }

        else if ( enterCode == passCode ) {
            System.out.println("Welcome to iPhone");
        }
        else{
            System.out.println("Try again!");
        }



    }
}
