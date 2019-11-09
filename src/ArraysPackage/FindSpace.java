package ArraysPackage;

import java.util.Arrays;

public class FindSpace {
    public static void main(String[] args) {
        //Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
        //Go through the array and print the value if there is multiple words.
        String [] names = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can" , "fridge", "dish washer"};
        for (int i = 0; i < names.length; i++ ) {
            if(names[i].contains(" ")) {
                System.out.println(names[i]);
            }
        }
    }
}
