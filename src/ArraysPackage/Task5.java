package ArraysPackage;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //4) Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
        //Loop through each elements of students. - print last character of each name on each line.
        //- Part II * Modify the loop and print the player names whose name ends with "s";
        //- Part III * Modify and print the player if it contains "s"
        //Part IV * Read the String from the user using Scanner and print out the players that contains the entered String keyword by user.

        String[] names = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
          //  System.out.println(name.charAt(name.length() - 1)); //PART I
         //   if (name.charAt(name.length() - 1) == 's') {  PART II
          //      System.out.println(name);
         //   }
         //   if (name.contains("s")) {   //   // PART III
         //       System.out.println(name);

                if (name.contains(userInput)) {  // PART IV
                    System.out.println(name);
                }
            }

        }
    }

