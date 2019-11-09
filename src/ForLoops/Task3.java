package ForLoops;

public class Task3 {
    public static void main(String[] args) {
        String str = "apple";
        for (int i  = 0 ; i <str.length(); i++) {
            System.out.print(str.substring(i, i+1) + str.substring(i, i+1));
        }
    }
}
