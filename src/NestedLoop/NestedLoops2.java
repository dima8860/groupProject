package NestedLoop;

public class NestedLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i is :" + i);
            for (int j = 0; j <= i; j++) {
                System.out.println("j is: " + j);
            }
            System.out.println();
        }

    }
}
