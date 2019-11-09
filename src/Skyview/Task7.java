package Skyview;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] inhabitants = {3,0,1,1,1,1,1,1}; // 3, 6, 0, 4, 3, 2, 7, 1   // 0, 20, 0, 20, 20, 10, 0, 10 // 10, 0, 20, 4, 0, 1, 6, 0
        int sum = 0;
        int count = 0;
        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));

        while (sum == 0) {
            count++;
            if (inhabitants[0] == 0) {

                for (int k = 0; k < inhabitants.length - 1; k++) {
                    if (inhabitants[k] == 0) {
                        inhabitants[k + 1] = inhabitants[k + 1] / 2;
                    }
                }

                for (int j = 1; j < inhabitants.length - 1; j++) {
                    if (inhabitants[j + 1] == 0 && inhabitants[j - 1] != 0) {
                        inhabitants[j] = inhabitants[j] / 2;
                    }
                }
                for (int i = 0; i < inhabitants.length; i++) {
                    sum += inhabitants[i];
                }
                System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
                if (sum == 0) {
                    break;
                }
                sum = 0;
            } else { //// 10, 0, 20, 4, 0, 1, 6, 0
                for (int k = 0; k < inhabitants.length - 1; k++) {
                    if (inhabitants[k] == 0) {
                        inhabitants[k + 1] = inhabitants[k + 1] / 2;

                    }
                }

                for (int j = inhabitants.length -1; j > 0; j--) {
                    if (inhabitants[j] == 0 ) {
                        inhabitants[j - 1] = inhabitants[j -1] / 2;


                    }
                }
                for (int i = 0; i < inhabitants.length; i++) {
                    sum += inhabitants[i];
                }
                System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
                if (sum == 0) {
                    break;
                }
                sum = 0;

            }

        }
            System.out.println("---- EXTINCT ----");
        }

    }







