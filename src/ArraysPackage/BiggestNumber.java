package ArraysPackage;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {30, 3, 100, 6, 50, 20};
        int numberBigger = 0;


        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > numberBigger) {
                numberBigger = number;
            }
        }
        System.out.println(numberBigger);
    }
}
