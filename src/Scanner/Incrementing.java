package Scanner;

public class Incrementing {
    public static void main(String[] args) {
        // ++a is prefix increment operator:
        //the result is calculated and stored first,
        //then the variable is used.


        //a++ is postfix increment operator:
        //the variable is used first,
        //then the result is calculated and stored.

        int age = 5;
      //  age += 6; shortcut
    //    age = age + 6;

      //  age++;
//        System.out.println(age);       5
//        System.out.println(++age);    6
//        System.out.println(age++);    6           post increment,  after this line it will add 1
//        System.out.println(age);      7


//         System.out.println(age);       5
//        System.out.println(--age);    4
//        System.out.println(age--);    4           post increment,  after this line it will decrease by 1
//        System.out.println(age);      3

        int x = 11;
        int y = x++;  // int y = 11; then x increments in next line to 12
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        int z = 5;
        System.out.println(z++); // z = 5;
        System.out.println(z);   // z = z + 1
        z++;                       // z is still 6 at this line. and adding 1 at next line
        System.out.println(z);      // z = 6 + 1;



    }
}
