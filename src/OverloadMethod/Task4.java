package OverloadMethod;

public class Task4 {
    public static void main(String[] args) {
        /*

Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
> input: “day”, “name”
> output: “daynameday”
Overload the method above to now accept the two Strings and an integer.
The integer given tells you how many times your first word should show up in your new String.
 Your first words need to always be separated by the second word.
 > input: “day”, “name”, 3
> output: “daynamedaynameday”
Collapse

         */
        System.out.println(splitString("day","good"));
        System.out.println(splitString("day","night",3));
    }
    public static String splitString(String str1, String str2) {
        String newStr = str1 + str2 + str1;
        return newStr;
    }
    public static String splitString(String str1, String str2, int n) {
        String newString = "";
        if(n <= 0) {
            return "";
        }
        for(int i = 0; i <= n; i++) {
            newString += str1;
            if(i == n - 1) {
                break;
            }
            newString += str2;


        }
        return newString;

    }
}
