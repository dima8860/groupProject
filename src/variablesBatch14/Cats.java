package variablesBatch14;

public class Cats {
    public static void main(String[] args) {

        int wild = 20;
        int pets = 0;

        System.out.println("Wild: " + wild);
        System.out.println("Pets: " + pets);
        System.out.println();

        wild = wild - 5;
        pets = pets + 5;

        System.out.println("Wild: " + wild);
        System.out.println("Pets: " + pets);
        System.out.println();

        wild = wild - 5;
        pets = pets + 5;

        System.out.println("Wild: " + wild);
        System.out.println("Pets: " + pets);
        System.out.println();

        char letter = 'k';
        float number = 5.7f;
        double number2 = 5.7;
        long number3 = 6L;

        System.out.println(number2);

        String world = "Hello world";

        System.out.println(world);
        int num1 = 4;
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
        // datatype casting
        int numberOfStudents = 129;
        byte byteNumber = (byte) numberOfStudents;

        double height = 6.5;
        int intHeight = (int)height;
        byte byteStudents = (byte)numberOfStudents;
        System.out.println(byteStudents);

        System.out.println(intHeight);




    }
}
