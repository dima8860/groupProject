package Switch;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Guess Number: User is asked to guess a number from 1 to 10
        //Write a program that generates a random number and takes a guess from the user.
        //> If user guesses correct number they should see “ Congrats you guessed right”
        //> If user guess is more than the random number they should see: “your guess is too high”
        //> If user guess is less than the random number they should see “your guess it too low”
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess a number from 1 to 10");
        int userNum = input.nextInt();
        int number = random.nextInt(10); // here range is 0 to 9
        number++; // to get range 1 to 10
        if (userNum == number) {
            System.out.println("Congrats you guessed right");
        } else if (userNum < 1 || userNum > 10 ) {
            System.out.println("Not a valid guess");
        }
        else if (userNum > number) {
            System.out.println("your guess is too high");
        }
        else if (userNum < number) {
            System.out.println("your guess it too low");
        }
        System.out.println("The actual number is: " + number);

    }
}
