package NestedLoop;

public class Task2 {
    public static void main(String[] args) {
        String str = "#";
        for (int i = 1 ; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
