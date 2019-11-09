package Replit;

import java.util.Scanner;

public class IsPos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
            isPos(arr[i]);
        }
        //#2 Your code here
        isPos(size);
    }

        public static void isPos(int num)
        {

                if( num >= 0) {
                    System.out.println("poisitive");
                }
                else {
                    System.out.println("not positive");
                }

            }

        }


