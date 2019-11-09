package ForLoops;

public class OddNumber {
    public static void main(String[] args) {
        // Write a program that prints only odd numbers
        //from 0 - 50.
        //Flow:
        //1
        //3
        //5
        //7
        for (int i = 0; i <= 50; i++) {
            if ( i == 2 || i == 4) {   // skipping if i == 1 and i == 3
                continue;
            }
            else if (i > 20 && i < 29) {

                continue; // skipping from 20 to 29
            }
            else if (i == 40) {
                break;
            }


            else if (i % 2 == 1) {
                System.out.println(i);
            }


            else {
                System.out.println("Even number");
            }
        }
    }
}
