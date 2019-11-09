package Varargs;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sumArray(5,3,45,50,2));
    }
    public static int sumArray(int ... arr) {
        int sum = 0;
        for(int num: arr) {
            String s = num + "";
            if(s.endsWith("5")) {
                continue;
            }
            sum += num;
        }
        return sum;
    }
}
