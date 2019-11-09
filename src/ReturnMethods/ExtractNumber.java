package ReturnMethods;

import java.util.Arrays;

public class ExtractNumber {
    public static void main(String[] args) {


    /*
        About 293,329,202 results (0.78 seconds)
Write a method that extracts the result number and returns it as only numbers
Write a method that takes the extracts the result time and returns it as a number and the seconds
         */

        String str = "About 293,329,202 results (0.78 seconds)";
   //     String[] arr = str.split(" ");
   //     System.out.println(Arrays.toString(arr));  // [About, 293,329,202, results, (0.78, seconds)]
        System.out.println(getNumberResult(str));
        System.out.println(getSeconds(str));
    }

    public static double getSeconds(String str) {
        String[] arr = str.split(" ");
        String strNoComma = arr[3].replace("(", "").replace(",","");
        double result = Double.valueOf(strNoComma);
        return result;


    }

    public static int getNumberResult(String str) {
       String[] arr = str.split(" ");
       String strNoComma = arr[1].replace(",", "");
       int result = Integer.valueOf(strNoComma);
       return result;
    }


}

