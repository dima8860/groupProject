package Mentorings.Sunday;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(6));
    }

    public static boolean primeNumber(int num) { // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
        // 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
        int count = 0;
        if (num >= 2) {
            for (int i = 2; i <= 9; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 1) return true;
            else return false;

        }
        return false;
    }
}

