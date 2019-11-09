package OverloadMethod;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a method that will accept two Strings. Return true if the first string begins with the second String. Return false if it does not.

Overload the method to accept a two Strings and a number.
 Return true if the second String is found inside of your first String the amount of times equal to your number parameter.
input: “jamesjajl”,”ja", 2
output: true
         */
        System.out.println(isStringBegin("12jamaja112ja", "ja",3));
    }
    public static boolean isStringBegin(String str1, String str2) {
        if(str1.substring(0, str2.length()).equals(str2)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean  isStringBegin(String str1, String str2, int times) {

        String newString = "";
        int count = 0;
        for (int i = 0; i < str1.length() - str2.length() + 1; i++){

            if (str1.substring(i,i+ str2.length()).equals(str2)) {
                count++;
            }
        }
        if (count == times) {
            return true;
        }
        else {
            return false;
        }
    }
}
