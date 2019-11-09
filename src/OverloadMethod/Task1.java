package OverloadMethod;

public class Task1 {
    public static void main(String[] args) {
        jump();
        jump("shoes");
        jump(5);
        String [] arr = {"d"};
        jump(arr);
        System.out.println(jump(arr));
        int a = 5;
        calc(a);
    }
    public static void calc(int i) {
        System.out.println("using int");
    }
    public static void calc(double d) {
        System.out.println("using double");
    }
    public static void calc(float f) {
        System.out.println("using float");
    }
    public static void jump() {
        System.out.println("You do not get far");
    }
    public static void jump(String shoes) {
        System.out.println("The shoes made you go father");
    }
    public static void jump(int distance) {
        System.out.println("you jumped " + distance);
    }
    public static String  jump(String [] arr) {
        return "jumped by array";
    }
}
