package Replit;

public class SimplePattern {
    public static void main(String[] args) {
        printHollowRect();
        /*

         *****
         *   *
         *   *
         *   *
         *****

         */
    }
    public static void printHollowRect()
    {
        for(int i = 0; i <  2; i++) {
            System.out.println("*****");
            if( i == 1) break;
            for(int j = 0; j < 3; j++) {
                System.out.println("*   *");
            }
        }


    }
}
