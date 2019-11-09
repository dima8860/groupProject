package ArraysPackage.Methods;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {
        //Takes a String and returns it into char array

        String str = "Java is nice language";
        char [] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
    }
}
