package ArraysMultidimensional;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        /*
        Sample values: {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}}
——————
Create a method that will return the biggest numbers from a 2D array
         */
        int [][] arr = {{3,1000000,5,2,342,4,23},{43,32,4032,32,43},{43,10,43,23,123}};
        System.out.println(biggestNumber(arr));
        System.out.println(indexOfInnerArray(arr));
    }
    public static int biggestNumber(int [][] arr) {

        int biggest = arr[0][0];
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length - 1; j++) {
                if (biggest < arr[i][j]) {
                    biggest = arr[i][j];
                }

            }
        }
        return biggest;
    }
    /*
    Create a method that takes a 2D array and return the index of the inner array which has the biggest sum of its elements
     */

    public static int indexOfInnerArray(int [][] arr) {
        int sum1 = 0;
        int biggest = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum1 += arr[i][j];
            }
            if(sum1 > biggest) {
                biggest = sum1;
                index = i;
            }
        }
        return index;
    }
}
