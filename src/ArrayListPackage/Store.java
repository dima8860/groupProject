package ArrayListPackage;

import ClassAndObjects.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    String name;
    ArrayList<Item> items = new ArrayList<>();
    int numberOfItems;
    String address;
    double totalSales;
    /*
    Create method sellItem. Method accepts name of the Item and doesn’t return anything. Check if name of the item is in the list.
     If it’s in stock remove from the list and add the price to totalSales and give success transaction message.
    If doesn’t exist in the list give failed transaction message and terminate the method.
     */

     public Store(String name, String address) {
         this.name = name;
         this.address = address;

     }
     public void returnItem(String name) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter price");
         double price = input.nextDouble();
         input.nextLine();
         Item item = new Item(name,price);
         this.items.add(item);
         totalSales-=price;
         numberOfItems ++;
     }

     public void sellItem(String name) {

         for(int i = 0; i < this.items.size(); i++){
             if(this.items.get(i).name.equals(name)) {
                 this.totalSales += this.items.get(i).price;
                 this.items.remove(this.items.get(i));

                 this.numberOfItems--;
                 System.out.println("Transaction successful");
                 return;
             }
         }
         System.out.println("Transaction not successful, item is not in the store");

     }

     public void addItem(Item item) {
         this.items.add(item);
         numberOfItems++;
     }

     public void addItem() {  // int itemsNumber, String name, double price
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter amount of items to be added");
         int amount  = input.nextInt();
         input.nextLine();
         this.numberOfItems += amount;
         String name = "";
         double price = 0;

         for(int i = 0; i < amount; i++) {
             System.out.println("Please enter item name");
             name = input.nextLine();
             System.out.println("Please enter price");
             price = input.nextDouble();
             input.nextLine();
             Item newItem = new Item(name,price);
             this.items.add(newItem);

         }

     }

     public void seeInventory() {
         System.out.println("\nZARA Chicago Store");
         System.out.println("Total sales amount $" + totalSales + "\n");
         System.out.println("----------------------");
         System.out.println("Inventory:");
         for(int i = 0; i < items.size(); i++) {
             items.get(i).info();
         }
         System.out.println("End of inventory list");
         System.out.println("----------------------");
     }


}
