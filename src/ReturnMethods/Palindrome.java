package ReturnMethods;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Create a method that will take a String as a parameter and
        return if the String is palindrome or not
         */
        System.out.println(checkPalindrome("12321"));
        System.out.println(checkPalindromeArr("amma"));

    }
    public static boolean checkPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {

            reversed += str.charAt(i) + "";
        }
        if ( reversed.equalsIgnoreCase(str)) {
            return  true;
        }
        else {
            return false;
        }

    }
    public static boolean checkPalindromeArr ( String str) {
        char [] arr = str.toLowerCase().toCharArray();
        for(int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
        }


        public static boolean checkPalindromeClass (String str) {
        if (ReversedString.getReverseString(str).equalsIgnoreCase(str)) {
            return true;
        }
        else {
            return false;
        }
        }



    }

