package ReturnMethods;

public class Task3 {
    public static void main(String[] args) {


        System.out.println(stringLength("Word"));

    }

    public static int stringLength(String str) {
        int count = 0;

        for(int i = 0 ; i < str.length(); i++) {
            count++;
        }
        return count;
    }
}
