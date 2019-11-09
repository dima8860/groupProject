package ArraysPackage;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
         Random random = new Random();
        int [] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers[i] = randomNumber;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[49]);
    }
}
