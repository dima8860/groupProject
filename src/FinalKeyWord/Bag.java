package FinalKeyWord;

public class Bag {

   final String color;
   final int size;
   static final String model;

   static {
       model = "Gucci";
   }

    {
        // we can use here if statement also and so on...
        size = 4;  // this is an initializer block.
    }


   // final instance variable must be initialized
    // once it is initialized then the value for the color can not be changed.
    // Option 1: Initialize it right away. Give a value whn declaring the instance variable.
    // Option 2: Initialize it within the constructor. If we use constructor to initialize the final instance variable, it allows.
    // Option 3: Instance initializer. It is used to initialize instance variables. It is the same as static block but it's
    // for non - static key word.
    // Instance initializer block gets executed right before constructor.

    // Why to use initializer block ?
    // - we could be running few different codes to bring a value to initialize
    // In initializer block we can write any code. But we can't write any code at instance variable level.

   final static int totalBags;

   static {
       totalBags = 45;
   }

   public Bag(){
       this.color = "Red"; // this value will be "Red" by default.
    }
// either first or second constructor will be used only once
    public Bag(String color) { // this value will be inserted by user only once.
       this.color = color;
    }
}
