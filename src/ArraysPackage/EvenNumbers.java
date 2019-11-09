package ArraysPackage;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        // Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
        //Take our all the even numbers from the array and put them into a new array. Print the new array
        int [] numbersOld = {1,2,-3,4,-34,55,78,90,33,10};
      //int [] evenNumbers= {0,0,0,0,0,0}
        int count = 0;

        for (int i = 0; i < numbersOld.length; i++) { // finding count of even numbers;
            int number = numbersOld[i];
            if(number % 2 == 0) {
                count++;
            }
            }
        System.out.println(count);

        int [] evenNumbers = new int[count];

        for (int i = 0, j = 0; i < numbersOld.length; i++) {
            int number = numbersOld[i];
            if(number % 2 == 0) {
                evenNumbers[j] = numbersOld[i];
                j++;
            }
            }
        System.out.println(Arrays.toString(evenNumbers));

    }
}
