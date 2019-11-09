package ArraysPackage;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "Adam";
        names[1] = "Brayan";
       // names[2] = "Vasyl"; ---->
        System.out.println(Arrays.toString(names));
        System.out.println(names[1].charAt(0));
       // System.out.println(names[2].charAt(0)); -----> gives us exception and our program stops!!!!!!!!
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}
