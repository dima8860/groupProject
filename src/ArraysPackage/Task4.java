package ArraysPackage;

public class Task4 {
    public static void main(String[] args) {
        String [] colors = {"red" , "white", "black", "orange"};
        for (int i = 0; i<colors.length; i++) {
            String color = colors[i];
            System.out.println(color);
            if (color.length() >= 6) {
                System.out.println(color);
            }
        }



    }
}
