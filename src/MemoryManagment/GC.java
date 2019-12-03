package MemoryManagment;

import FinalKeyWord.Bag;

public class GC {
    public static void main(String[] args) {
        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        bag1 = bag2; // assigning address of bag2 to bag1.

        System.out.println("Hey what's up");
        System.gc();
        System.out.println("End of program");

    }
}
