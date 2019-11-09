package ArraysPackage;

import java.util.Arrays;

public class ReplaceNegative {
    public static void main(String[] args) {
        /*
        Given numbers of 4,-2,5,-3,-20,30. Write a program that will change any negative number to be 0.
         Print the changed array.
         */
        int [] arrayNumbers = {4,-2,5,-3,-20,30};
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0) {
                arrayNumbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
