package Switch;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10); // range is 10 numbers but is from 0 to 9;
        number++;   // here we are changing range from 1 to 10
        System.out.println(number);





    }
}
