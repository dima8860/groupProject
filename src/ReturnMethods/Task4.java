package ReturnMethods;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        /*
        1.Write a method that will tell you if it is the weekday or not. The method takes a String, Saturday and Sunday are the only weekend days


2.Create a method that will count how many even numbers there is from the given array and return the value

3.Create a method that will take a String array and a String.
Increase your array capacity and add the given String as the last element of the new array.
 Return the new array

4.Create a method that will generate a random int array.
The method takes the size of the array and the bound of the random numbers.
Return the random array

5.Given a String of numbers.
Return the difference between the biggest and smallest number
         */
        System.out.println(checkWeekday("Saturday"));
        int [] arr = {0,4,6,5,4,3,2};
        System.out.println(countEven(arr));
        String [] arr1 = {"first", "second", "third"};
        System.out.println(Arrays.toString(addArray(arr1, "last")));
        System.out.println(Arrays.toString(randomArray(4,9)));
        System.out.println(getDifference("8855123456789"));

    }
    public static int getDifference(String numbers) {
        String [] arr = numbers.split("");
        int [] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(arr1);
        int difference = arr1[arr1.length - 1] - arr1[0];
        return difference;


    }



    public static int [] randomArray(int size, int bound) {
        Random random = new Random();
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;

    }


    public static String [] addArray(String arr [], String str ) {
        String [] arrNew = new String[arr.length + 1];
        for(int i = 0; i < arr.length; i++ ) {
            arrNew[i] = arr[i];
        }
        arrNew[arr.length] = str;
        return arrNew;
    }




    public static boolean checkWeekday (String str) {
        String weekdays = "Monday Tuesday Wednesday Thursday Friday ";
        String weekends = "Saturday Sunday";
        if(weekdays.contains(str)) {
            return true;
        }
        else if (weekends.contains(str)) {
            return false;
        }
        return false;
        }

        public static int countEven (int [] arr) {
        int count = 0;
        for(int num : arr) {
            if(num % 2 == 0) {
                count++;
            }
        }
        return count;
        }

    }


