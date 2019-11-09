package ArraysPackage;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double [] arr = {1,2,3,4,5,77,89};
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1] = 112.89;
        System.out.println(Arrays.toString(arr));
    }
}
