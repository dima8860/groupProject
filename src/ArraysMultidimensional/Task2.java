package ArraysMultidimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(randomArray(3,6)));
        int [][] arr = {{8,2,3}, {4,5,6},{7,8,9}};
        System.out.println(difference(arr));
    }


    public static int [][] randomArray(int a, int b) {
        Random random = new Random();
        int [][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                arr[i][j] = random.nextInt(99) + 1;
            }
        }
        return arr;
    }

    public static int difference(int [][] arr) {
        int first = 0;
        int second = 0;
        int difference = 0;
        for(int i = 0, j = arr.length - 1;j >=0 && i< arr.length; i++, j--) {

                first += arr[i][i];
                second += arr[i][j];

        }
        return difference = first - second;
    }
}
