package ClassAndObjects;

import java.util.Scanner;

public class ExecutionClass1 {
    public static void main(String[] args) {
        House myHouse = new House();
        Scanner input  = new Scanner(System.in);
        System.out.println("What is house type?");
        myHouse.type = input.nextLine();
        System.out.println("What is the address?");
        myHouse.address = input.nextLine();
        System.out.println("How many rooms?");
        myHouse.numRooms = input.nextInt();
        myHouse.info();
    }
}
