package Replit;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        String [] arr = {"1","2","aa","1"};
        System.out.println(getDup(arr));
    }
    public static int getDup(String[] r)
    {
        Arrays.sort(r);
        int count = 0;
        int temp = 0;
        for(int i = 0; i < r.length ; i++) {
                temp = 0;
            for(int j= i; j < r.length;j++) {
                if(r[i] == r[j]) {
                   temp++;
                }
                }
            if(temp != 1) {
                count+=temp;
                i = i + temp - 1;
            }

        }
        return count;

    }

}

