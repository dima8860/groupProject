package WrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    ArrayList<Integer> list = new ArrayList<>();

    public void generateNumbers(int size) {
        list.clear();
        Random random = new Random();
        for (int i = 0; i < size; i++) {

            list.add(random.nextInt(1000)); // auto - boxing int to Integer;
        }
        System.out.println(list);
    }

    public void generateEvens(int size) {
        list.clear();
        Random random = new Random();
        while(list.size() < size) {
            int num = random.nextInt(100) + 1;
            if(num % 2 == 0) {
                list.add(num); // auto - boxing int to Integer;
            }

        }
    }
}
