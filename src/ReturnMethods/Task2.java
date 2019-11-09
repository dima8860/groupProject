package ReturnMethods;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(checkNumber(4));

    }


    public static int checkNumber(int num) {
        if(num < 0) {
            return 0;
        }
        else {
            return num + 1;
        }
    }

}
