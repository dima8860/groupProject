package ArraysPackage.Methods;

import java.util.Arrays;

public class ArrayMethods {
    /*
    sorting an array, arranging from smaller to largest or lexigraphically for Strings:

    Arrays.sort(arrayName)---------------------------------------

    Searching in an array only if sorted.

    Arrays.binarySearch(arrayName, element)---------------------------------

    String manipulation methods

    splt method
    used on a String and converts it to an String Array based on the given characters
    String str = "Java is programming language";
        String [] splitted = str.split(" ");----------------------------------------

    possible result:
    if element is found it will give you an index of that element;
    if it is not there it will give you negative number ( where it would have been  + 1);
    if the array is not sorted the result is not correct.


     */
    public static void main(String[] args) {
        String [] arr = {"z", "$ a", "5 e"};
        System.out.println(arr[0] + " first element before sorting");
        Arrays.sort(arr);
        System.out.println(arr[0] + " first element after sorting");
        System.out.println(Arrays.toString(arr));

    }
}
