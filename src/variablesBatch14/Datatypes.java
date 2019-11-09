package variablesBatch14;

public class Datatypes {

    public static void main(String[] args) {

         int number;
         number = 5;
         int number2 = number;
         number = 7;

        System.out.println("This is your first number + 5 is = " + (number + 5));
        System.out.println("This is your second number = " + number2);
        System.out.println(number);

        int money_dollars$ = 100;
        // ONLY _ AND $ ARE ALLOWED FOR VARIABLE

       /* TO RENAME SMT USE  "REFACTOR" TO CHANGE ALL AT THE SAME TIME */

         System.out.println("$" + money_dollars$);

        int apples = 10;
        int oranges = 5;
        System.out.println("apples: " + apples);
        System.out.println("oranges: " + oranges);

        apples = 8;
        oranges = apples;
        System.out.println("apples after reassining: " + apples);
        System.out.println("oranges after reassining:" + oranges);

        // Scope of variable only within curly braces where declaration happens {   }


    }



}
