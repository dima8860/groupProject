package Skyview;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        // Given a String, str , perform the following conditional actions:
        //
        //Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
        //Convert str to all lower characters
        //If number of character is odd convert middle character Upper case
        //If number of character is even convert middle two character Upper case (ex: name -> nAMe)
        //Sample Input:
        //apple
        //Sample Output:
        //apPle
        //
        //Sample Input:
        //BANANA
        //Sample Output:
        //baNAna
        //
        //Sample Input:
        //xy
        //Sample Output:
        //Invalid enter
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str2 = input.nextLine();
        if (str2.length() <= 3 || str2.length() > 100) {
            System.out.println("Invalid enter");
        }
        else if (str2.length()%2 == 1) {
           String str = str2.toLowerCase();
           int indexOfMiddle = str.length()/2;
           String part1 = str.substring(0,indexOfMiddle);
           String part2 = str.substring(indexOfMiddle,(indexOfMiddle + 1));
           String part2Upper = part2.toUpperCase();
           String part3 = str.substring(indexOfMiddle + 1);
            System.out.println(part1 + part2Upper + part3);
        }
        else if (str2.length()%2 == 0) {
            String str = str2.toLowerCase();
            int indexOfMiddle = str.length()/2;
            String part1 = str.substring(0,indexOfMiddle - 1);
            System.out.println(part1);
            String part2 = str.substring(indexOfMiddle - 1,(indexOfMiddle + 1));
            System.out.println(part2);
            String part2Upper = part2.toUpperCase();
            String part3 = str.substring(indexOfMiddle + 1);
            System.out.println(part3);
            System.out.println(part1 + part2Upper + part3);

        }
    }
}