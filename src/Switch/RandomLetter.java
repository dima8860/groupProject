package Switch;

import java.util.Random;

public class RandomLetter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(26);
        System.out.println("My random number is " + number);
        number += 65;
        char letter = (char)(number);

        System.out.println("My number is " + number);
        System.out.println("Your letter is " + letter);
    }
}
