package Skyview;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*Write a program to prompt the user to enter the numbers till the user wants (by asking user if he wants to continue) and at the end it should display the count of positive, negative and zeros entered. (Hint: use do while loop)

	Example:

        Input:
	Enter the number: 9
	Do you want to continue y/n? y
	Enter the number: -5
	Do you want to continue y/n? y
	Enter the number: 0
	Do you want to continue y/n? y
	Enter the number: 66
	Do you want to continue y/n? n

        Output:
	Positive numbers: 2
	Negative numbers: 1
	Zero numbers:

         */
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int userInput = 0;
        String answer = "";
        do {
            System.out.println("Enter the number");
            userInput = input.nextInt();
            input.nextLine();
            System.out.println("Do you want to continue y/n?");
             answer = input.nextLine();
            if (answer.equals("y")) {
                if(userInput > 0) {
                    positive ++;
                }
                else if (userInput < 0) {
                    negative ++;
                }
                else {
                    zero++;
                }
            }

        }while (answer.equals("y"));


        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);

    }
}
