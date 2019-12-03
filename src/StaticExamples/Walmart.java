package StaticExamples;

public class Walmart {
    String address;
    double size;
    int numbersOfEmployees;
    String type;
    static String ceo = "Carl Douglas McMillon";  //because of static it belongs to the class only, not to the object.
    // Variable "ceo" will be the same for all objects Walmart and they will share it.
    // There will be only one copy of it in the class but not in each object.
 // in this case we have 4 instance variables and static "ceo" is not an instance variable.

    public static void main(String[] args) {
        Walmart w1 = new Walmart();
        Walmart w2 = new Walmart();
        Walmart w3 = new Walmart();
    }
}