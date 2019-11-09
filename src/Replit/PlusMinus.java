package Replit;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {



            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt();
            inp.nextLine();
            int[] arr = new int[size];
            for(int i=0 ;i<=size-1;i++)
            {

                arr[i]=inp.nextInt();
            }

            plus_minus(arr);
            System.out.println( plus_minus(arr));
        }
        public static String plus_minus (int [] arr) {
            int countPos = 0;
            int countNeg = 0;
            int countZer = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) {
                    countZer++;
                }
                else if (arr[i] > 0) {
                    countPos++;
                }
                else if (arr[i] < 0) {
                    countNeg++;
                }
            }
            String str = "positives:" + countPos + ", negatives:" + countNeg + ", zeros:" + countZer;
            return str;
        }

        // Create a method here and call it "plus_minus"




    }

