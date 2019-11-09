package Scanner;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Month: ");
        int month = input.nextInt();
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Year: ");
        int year = input.nextInt();
        String result = "" + month + "/" + day + "/" + year;
        System.out.println(result);
        year += 5;
        day -= 1;
        String resultNew = "" + month + "/" + day + "/" + year;
        System.out.println(resultNew);


    }
}
