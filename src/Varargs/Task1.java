package Varargs;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        maxNumber(3,4,5,30,7,5,6,9,2);

    }
    public static void maxNumber (int a, int b,int ... arr) {
        Arrays.sort(arr);
        System.out.println("The biggest number is: " + arr[arr.length - 1]);
    }
}
