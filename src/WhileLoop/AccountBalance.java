package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int account = 1500;
        while (account > 0) {
            System.out.println("Enter the item price");
            int price = input.nextInt();
            if (account < price) {
                System.out.println("Card Declined");
                continue;
            }
            account = account - price;
        }
        System.out.println("You are broke");
    }
}