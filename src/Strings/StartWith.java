package Strings;

public class StartWith {
    public static void main(String[] args) {
        String str = "Apple offer to Dmytro will be accepted!";
        // StartWith() , Check if the string begins with the passed String. Takes STRING. Return BOOLEAN

        System.out.println(str.startsWith("Apple offer"));
        System.out.println(str.endsWith("will be accepted!"));

        boolean b  = str.startsWith("Apple");
        System.out.println(b);
        System.out.println("Not : " + !b);
        System.out.println(!str.endsWith("accepted"));
        System.out.println( str.endsWith(str.toLowerCase()));

    }
}
