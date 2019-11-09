package ArraysPackage.Methods;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {2,5,7,14};
        System.out.println("Index of 2 is:  " + Arrays.binarySearch(nums,2));
        System.out.println("Index of 5 is:  " + Arrays.binarySearch(nums,5));
        System.out.println("Index of 7 is:  " + Arrays.binarySearch(nums,7));
        System.out.println("Index of 9 is:  " + Arrays.binarySearch(nums,9)); // is would be index 3 which is after "7" and plus 1;
    }
}
