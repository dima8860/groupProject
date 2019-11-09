package ForLoops;

import java.util.Scanner;

public class Skip3 {
    public static void main(String[] args) {

        for (int i = 0 ; i <= 50 ; i++ ) {
            if (i == 3 || i % 10 == 3) {
                continue;
            }
            System.out.print(i + ", ");
        }

    }
}
