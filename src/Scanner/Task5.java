package Scanner;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

//        If n is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddOrEven = n % 2;


        if (oddOrEven == 1) {
            System.out.println("Weird 1");
        }
        else if (oddOrEven == 0 && n > 2 && n < 5) {
            System.out.println("Not weird 1");
        }
        else if (oddOrEven == 0 && n > 6 && n < 20) {
            System.out.println("Weird 2");
        }
        else if (oddOrEven == 0 && n > 20);
        {
            System.out.println("Not Weird 2");
        }


    }
}
