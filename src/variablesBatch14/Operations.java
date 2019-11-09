package variablesBatch14;

public class Operations {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        // % is modulus sign, give us reminder
        System.out.println(a / b);
        System.out.println(a % b);

        // to check if number is even use % and 2. even divide by 2 no reminder. Reminder 0 means that the number is even.

        System.out.println(a % 2);
        System.out.println(b % 2);

        // SHORTHAND ASSIGNMENT OPERATIONS
        // When you want to increment or decrement the values of numbers: +=, -=. *=, /=...
        int age = 25;
        age += 11;

        System.out.println("The age is increased by 11 will be: " + age);

        int sum = a + b;
        int minus = a - b;
        a = a - 1;
        b = b / 2;

        // a = a + 5 is the same as a += 5

        a += 5;
        b /= 2;


        System.out.println(a);
        System.out.println(b);

        int c = 10/3;
        System.out.println(c);

        int cRemainder = 10 % 3;
        System.out.println(cRemainder);

        // Find even or odd nu,ber using reminder
        int size = 323;
        int result = size % 2;
        System.out.println(result);
        // result is equal 1 so 323 is odd number

        int size2 = 324;
        int result2 = size2 % 2;
        System.out.println(result2);
        // result2 equal 0 means number is even



    }
}
