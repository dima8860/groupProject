package variablesBatch14;

public class Reassingment {
    public static void main(String[] args) {

        int apples = 10;
        int oranges = 5;

        System.out.println(apples);
        System.out.println(oranges);

        apples = 8;
        oranges = apples;

        System.out.println("\"apples\" after: " + apples);
        System.out.println("oranges after: " + oranges);



    }
}

