package ReturnMethods;

public class ReversedString {
    public static void main(String[] args) {
        System.out.println(getReverseString("Today is Sunday"));

    }
    public static String getReverseString(String inputStr) {
            String reversed = "";
         for (int i = inputStr.length() - 1; i >= 0 ; i --) {
            reversed += "" + inputStr.charAt(i);
        }
        return reversed;

    }
}
