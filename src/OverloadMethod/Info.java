package OverloadMethod;

public class Info {
    public static void main(String[] args) {
        /*
        having multiple versions of the same method in one class
        this allows you to have a method with the same name but different implementations

        ex: substring, println

        - method signature
        method name , number parameters, type of parameters
        return type is not part of the signature;

        Rules for overloading
        1. give the same name for the method;
        2. change number of the parameters or change the data type of the parameters;
        if your overload a method a successfully you can change the return type
        IQ: does changing the return type overload the method?
        no. Return type is not part of the method signature, in this case you also confused java.

        Data type parameter promotion
        byte short int float long double;



         */

    }

    public static void draw (String color) {  // method signature is: draw (String color)
   // statements
    }
    public static void draw (String color1, String color2) {  // method signature is: draw (String color)
        // statement
    }
    public static void draw (int size) {  // method signature is: draw (String color)
    // statement
    }
}
