package Scanner;

public class Operators {
    public static void main(String[] args) {

        System.out.println(5 > 4 && false); // && (and) both statements needs to be true to print true
        System.out.println(4 < 3 || true);  // || (or) either of statements has to be true to print true

        boolean b = 5 > 1;
        System.out.println(b); // prints true
        boolean d = false;
        boolean check1 = d || b ;
        boolean check2 = d && b;
        System.out.println(b);
        System.out.println();
    }
}
