package ClassAndObjects;


public class Item {
    public String name;
   public double price;
   public int size;


    public Item(String name,double price ) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, int size) {
        this(name, price);  // constructor chaining;
        this.size = size;

    }
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price + "\n");
    }
}
