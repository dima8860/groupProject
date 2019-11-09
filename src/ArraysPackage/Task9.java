package ArraysPackage;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        /*
        Given you have two arrays with values of:
    3,2,6,43,7,20      and
    2,7,-10,10,-5,2
    Write a program that adds each element and stores them into a new array.
    Print the final array
         */
        int[] array1 = {3, 2, 6, 43, 7, 20};
        int[] array2 = {2, 7, -10, 10, -5, 2, 7};
        int small, big;

        if (array1.length > array2.length) {
            big = array1.length;
            small = array2.length;
            int[] newArray = new int[small];
        } else if (array1.length < array2.length) {
            small = array1.length;
            big = array2.length;
            int[] newArray = new int[small];
        } else {


            int[] newArray = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                newArray[i] = array1[i] + array2[i];
            }
            System.out.println(Arrays.toString(newArray));
        }
    }
}
