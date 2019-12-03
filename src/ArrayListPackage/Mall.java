package ArrayListPackage;

import ClassAndObjects.Item;

public class Mall {
    public static void main(String[] args) {
        Store zara = new Store("Zara", " 312 main st");
        Item item1 = new Item("socks", 15);
        Item item2 = new Item("coat", 85);
        Item item3 = new Item("t-shirt", 23);
        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);
        System.out.println(zara.numberOfItems);



        zara.sellItem("socks");
        zara.seeInventory();




    }
}
