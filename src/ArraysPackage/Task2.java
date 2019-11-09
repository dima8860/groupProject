package ArraysPackage;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Double [] prices = new Double[5];
        prices[0] = 45.99;
        prices[1] = 23.5;
        prices[2] = 11.50;
        prices[3] = 33.33;
        prices[4] = 99.99;
        System.out.println(Arrays.toString(prices));
        prices[4] = 112.89;
        System.out.println(Arrays.toString(prices));

    }
}
