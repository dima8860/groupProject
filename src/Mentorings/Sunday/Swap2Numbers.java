package Mentorings.Sunday;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        swapTwoNumbers(a,b);
        // a = a + b;
        // b = a - b;
            // a = a - b;
    }
    public static void swapTwoNumbers(int a, int b) {
        a = (a+b) - (b = a);
        System.out.println("a is: " + a);

        System.out.println("b is " + b);
    }
}
