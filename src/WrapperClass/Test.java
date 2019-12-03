package WrapperClass;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MagicNumber myNumbers = new MagicNumber();

        myNumbers.generateEvens(10);
        System.out.println(myNumbers.list);

    }
}
