package variablesBatch14;

public class ConcatinationAndCasting {
    public static void main(String[] args) {

        // CONCATINATION :
        String word1 = "Hello";
        String word2 = "world";

        System.out.println(word1 + "      " + word2);
        System.out.println(6 + 6 + " number " + 6 + 6);

        String wordOne = "Hello";
        wordOne = wordOne + " world";

        System.out.println(wordOne);

        int num3 = 5;
        long num4 = num3;

        System.out.println(num4);
        // datatype casting CASTING
        int numberOfStudents = 129;
        byte byteNumber = (byte) numberOfStudents;

        double height = 6.5;
        int intHeight = (int) height;
        byte byteStudents = (byte) numberOfStudents;
        System.out.println(byteStudents);

        System.out.println(intHeight);

        String firstName = "Dmytro";
        String lastName = "Chernetskyi";
        String email = "@cybertek.com";

        System.out.println();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email:     " + firstName + lastName + email);
        System.out.println();
        System.out.println("Second task");

        short chairs = 5;
        long newChairs = chairs;
        int lessChairs = (int) newChairs;

        System.out.println(lessChairs);

        String nameNew = "David";
        System.out.println("His name is " + nameNew);

        // STATEMENT is one line of code that end with semicolon.

    }
}
