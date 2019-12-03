package ArraysMultidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter how many groups they have.
         Then ask the user to enter how many students are in each group.
        Allow the user to enter each name of the people in each group. Print the 2D array of all the groups at the end
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many groups?");
        int groups = input.nextInt();
        input.nextLine();
        String [][] arr = new String [groups][];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("How many students in group " + (i + 1));
            int students = input.nextInt();
            input.nextLine();

            String [] numGroup = new String[students];
            for(int j = 0; j < numGroup.length; j++) {
                System.out.println("Enter name " + (j+1));
                numGroup[j] = input.nextLine();
            }
            arr[i] = numGroup;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
