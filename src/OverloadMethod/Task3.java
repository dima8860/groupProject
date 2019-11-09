package OverloadMethod;

public class Task3 {
    public static void main(String[] args) {
        /*
        We have a method that reverses a String, overload it to accept an int array and reverse the elements in the array.
        Return the reversed array. Also over load the method to accept a String array and reverse the elements in that array.
         Return the reserved array.
         */
        String str = "121242";
        int a = printString("hello", 0,3);
        System.out.println(a);

    }

    public static void printString(String str) {
        System.out.println(str.charAt(0));
    }
    public static void printString(String str, int index) {
        System.out.println(str.charAt(index));
    }
    public static int  printString(String str, int index1, int index2) {
        return str.substring(index1,index2).length();
    }


}
