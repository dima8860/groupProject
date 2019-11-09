package Varargs;

public class Task2 {
    public static void main(String[] args) {

        int [] arr2 = {3,4,5,2,43,53};
        System.out.println(addAllNumbers(3,arr2));
    }
    public static int addAllNumbers(int ... arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - 5) % 10 == 0) {
                continue;
            }
            else {
                result += arr[i];
            }
        }
        return result;
    }
    public static int addAllNumbers(int num, int [] arr1) {

        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 10 == num) {
                continue;
            }
            else {
                result += arr1[i];
            }
        }
        return result;
    }
    }


