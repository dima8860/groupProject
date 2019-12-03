package ClassAndObjects;

import java.util.Scanner;

public class ExecutionClass2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("How many items do you have?");
        int num = input.nextInt();
        input.nextLine();
        Item [] item = new Item[num];
        for(int i = 0; i < item.length; i++) {
            System.out.println("Please enter name " + (i + 1));
            String name = input.nextLine();
            System.out.println("Please enter price " + (i + 1));
            double price = input.nextDouble();
            input.nextLine();
            item[i] = new Item(name,price);
        }
        for(Item eachItem: item) {
            eachItem.info();
        }
    }
}
