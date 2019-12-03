package MemoryManagment;

public class Info {
    /*
    There are two places that java uses from Ram memory.

    1.Stack--------------------------------------------------------------------------------------
        - primitive data type information
        Ex: int age = 23;
        boolean raining = true;

        - references
        Ex: Bag bag1 = new Bag();
        bag1 is stored in the Stack.

        - method calls
          Ex: MyCollection.getStringList();

    2.Heap  (only to store objects)--------------------------------------------------------------------------------------

    - All the objects are stored in heap memory.

    StackOverFlowError: This error is thrown by Java when Stack memory is out of memory.

    All strings are stored in heap memory.
    - String: combination of characters.

    Memory: char size. 2 bytes ==> 16 bit.
    String name = "Jason"; ==> 80 bits.

    String Pool-----------------------------------------------------------------------------------------

    It is a memory corner in the Heap, where unique String values are sored.

    == vs .equals()

    == -> is used to compare values that are stored int stack.

    if we use it for primitives then it compares values.
    if we use it for references then it compares the addresses that they hold.

    .equals() => method that compares the values of the objects but not references.

    GC --> Garbage Collection.--------------------------------------------------------------------------------------
    System.gc();
    It is a tool of Java that cleans the Heap memory automatically.
    What does it clean?
    - It cleans the object that are no longer having a reference to.

    String s = "James";
    s = "Bond";

    -Garbage collector will clean up the memory implicitly.
    -However, if you would like to call it explicitly you can do it so by using System.gc();

    -when we call System.gc() or when it gets called by itself, it executes finalize() method for a dying object for a last time.

    -Normally programmers use finalize() method to do proper clean up.

     */
}
