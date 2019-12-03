package StaticExamples;

public class ExplainingObjectReassigning {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        m2.color = "Red";
        m1.color = "White";
        System.out.println(m2.color);
        System.out.println(m1);
        System.out.println(m2);
        // CustomClassMembers.Mouse@77459877 m1
        //CustomClassMembers.Mouse@5b2133b1   m2
        Mouse m3 = m2; // we are saving object m2 by reassigning to a new reference m3.
        // Mouse m3 means we create type Mouse of variable m3 (like type "int i = ...") without creating an object ,
        // because to create an object we have to use " new Mouse()".

        m2 = m1; // changing address of m2 to m1. so now two reference types m1 and m2 which are pointing to the same object will have same value

        System.out.println(m1); // StaticExamples.Mouse@77459877
        System.out.println(m2);  // StaticExamples.Mouse@77459877 it is changed now.
        System.out.println(m2.color); // and all values are now from m1
        m2.color = "Black";  // so now two reference types m1 and m2 will have color "Black" for both.
        System.out.println(m1.color);
        System.out.println(m2.color);
        System.out.println(m3.color); // calling values from saved object m2.

        Mouse m4 = new Mouse("Grey", 23, true, "Jason");



    }
}
