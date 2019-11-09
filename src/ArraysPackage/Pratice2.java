package ArraysPackage;

import java.util.Arrays;

public class Pratice2 {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "Adam";
        names[1] = "Brayan";
        names[2] = "Vasyl";

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("name " + (i + 1) + " is " + names[i] );
        }
    }
}
