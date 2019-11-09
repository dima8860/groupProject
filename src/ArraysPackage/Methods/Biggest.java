package ArraysPackage.Methods;

import java.util.Arrays;

public class Biggest {
    public static void main(String[] args) {
        /*
        given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
Print out the biggest and smallest values in the array

4) Given an array of values: 23, 1, 34, 3, 54, 54, 51
Print the biggest two values. Only Unique values
> The result here should be:
54
51
         */
        ///////////////////////////////////////////////////////////////////
        int [] nums = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(nums);
        System.out.println(nums[0] + ", " + nums[nums.length-1]);
/////////////////////////////////////////////////////////////////////////////

        int [] nums2 = {23, 1, 34, 3, 54, 54, 54, 54, 54, 51};
        Arrays.sort(nums2);
        int secondBiggest = 0;
        for (int i = nums2.length - 1; i >= 0 ; i--) {
        if (nums2[i] != nums2[i-1]) {
            secondBiggest = nums2[i-1];
            break;
        }
        }
        System.out.println(nums2[nums2.length-1] + ", " + secondBiggest);

    }
}
