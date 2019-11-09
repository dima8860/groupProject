package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int inputNumber;
        int count = 0;
        int randomNumber = random.nextInt(2);
        do {
            System.out.println("Enter number");
            inputNumber = input.nextInt();
            if (randomNumber > inputNumber) {
                System.out.println("Too low");
            } else if (inputNumber > randomNumber) {
                System.out.println("Too high");
            }
            count++;

        } while (randomNumber != inputNumber);
        System.out.println("You guessed right after " + count + " tries");
    }
}
