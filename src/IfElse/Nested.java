package IfElse;

public class Nested {
    public static void main(String[] args) {
        int number = 35;
        if ( number >= 0 && number <=50) {
            if (number >= 10 && number <= 40){
                if (number >= 20 && number <= 30){
                    System.out.println("Your number is good");
                } else {
                    System.out.println("Not in the range 20-30");
                }
            }
            else {
                System.out.println(" Not in the 10-40 range");
            }

        }
        else {
            System.out.println("Not in the range 0 - 50");
        }
    }
}
