package Replit;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        /*
        Write a method called cube that asks the user for a number and then prints the cubed value of that number:

For example:

Input:
5

Output:
125

hint:
cube of a number n = n*n*n
         */
        cube();
    }
    public static void cube()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n = n*n*n;
        System.out.println(n);


    }
}
