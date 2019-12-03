package Mentorings.Wednesday;

public class Task2 {
    public static void main(String[] args) {
        String s = "hello friend";
        char [] arr = s.toCharArray();
        for(int i = 0; i < s.length()/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String reversed = new String(arr);
        System.out.println(reversed);
        String stringnew = new StringBuilder(s).reverse().toString();

    }
}
