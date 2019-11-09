package NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
          inner:  for ( int j = 0; j < 5; j++) {
                System.out.println("j is: " + j);
                if ( j == 2) {
                    break outer;
                }
            }
            System.out.println();
        }
    }
}
