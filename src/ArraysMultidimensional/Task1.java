package ArraysMultidimensional;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6,7,8}, {6,7,4,3,2,1,1}};
        System.out.println("Length of row 1: " + arr[0].length);
        System.out.println("Length of row 2: " + arr[1].length);
        System.out.println("Length of row 3: " + arr[2].length);

        int [][] arr1 = new int [3][];
        int [] arrA = {1,2,3,4};
        int [] arrB = {3,4,2,1};
        int [] arrC = {3,2,2,1,13,4,5};
        arr1[0] = arrA;
        arr1[1] = arrB;
        arr1[2] = arrC;
        System.out.println(Arrays.deepToString(arr1));
    }
}
