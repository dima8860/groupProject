package ArraysPackage.Methods;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // declare array and store elements
        //{45,23,6,-3,66}
        //2. print out the index of -3 if it exists in the array.
        int [] nums = {45,23,6,-3,66};
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums,-3);
        System.out.println(index);
    }
}
