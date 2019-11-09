package ArraysPackage.Methods;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Java is programming language";
        String [] splitted = str.split(" ");
        System.out.println(Arrays.toString(splitted));
    }
}
