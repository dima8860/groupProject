package ArraysPackage.Methods;

import java.util.Arrays;

public class BiggestWord {
    public static void main(String[] args) {
        String str = "Write a that y creates thebiggestword a group of given size ";
        String [] arrayStr = str.split(" ");
        String biggest = "";
        for ( String word : arrayStr) {
            if(word.length() > biggest.length() ) {
                biggest = word;
            }
        }
        System.out.println(biggest);
    }
}
