package StaticExamples;

public class Info {
    /*
    1)Instance variables
    information that belong to each object which is created from the specific class
    in order to use instance variables you must hve an object

    2)methods
    behaviors that belong to each object

    3) Constructors
    special kind of method that creates an object
    _____________________________________________________
    (*) Static member
    -> Variables and Methods can be static
    -> Static members belong to the Class. Not the object
    This mean you dont need to create an object to use those members;
    The static members belong to the class, so they are shared with all objects.

    -> Examples of static methods from java:
    ->Dont need this: Arrays arr = new Arrays();
    -Arrays.sort()
    -Arrays.toString();

    -> Examples  of non static methods:
    - nextLine() from Scanner
    - trim() from String class
    - nextInt() from Random class;

    (*) Static block
    -> Also known as the static initializer;
    -> This block is used to give initial values to static members

    --Syntax :

    static {
    // statements
    }

    -> This block will run once and before anything else
    -> Static blocks  can only have static members;
    -> You can have as many as you want;
    -> They read top to bottom one time before anything else;

    IQ: Do you have to initialize static members in the block?
    No, but usually it used from default values;

    (*) Static import
    -> If you want to import your static method to the class you can import the member instead of the whole class;
    import static java.util.Arrays.*;

    (*) For Testing:
    -> utilities package: package that will have classes that are helpful for the priject;
    -> Most methods behave like a tool
    -> The methods in utility class are static;

    (*) STATIC
    Static is a member of a class that doesn't belong to the object.  It belongs directly to the class.

    -> both variable and methods can be a static. When they are static they belong to a class and the can be called by a
    class name. We don't need an object to use them.

    Access to static members:
    1. You don't need an object to get an access.
    2. Both objects and class itself have an access to the static members.

    How to access using className?

    Walmart.ceo = "Doug McMillion";




     */
}
