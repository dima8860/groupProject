package ClassAndObjects;

public class PaperPlane {
    public static void main(String[] args) {
        // Create 2 Flag objects
        // Set all values to first one only
        // and copy first objects instance variable values to second one
        // and reset the first objects values to zero to numbers and "a" to Strings.
        Flag f1 = new Flag();
        Flag f2 = new Flag();
        f1.material = "wood";
        f1.country = "Canada";
        f1.size = 3;
        f1.color = "Red/White";


        f2.material = f1.material;
        f2.country = f1.country;
        f2.size = f1.size;
        f2.color = f1.color;

        f1.material = "n/a";
        f1.country = "n/a";
        f1.size = 0;
        f1.color = "n/a";



        f1.upgrade(255,"gold");
        f1.info();
        System.out.println("---------------------");
        f2.info();



    }
}
