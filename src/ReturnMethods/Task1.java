package ReturnMethods;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task1 {
    public static void main(String[] args) {
        int a = getThree();
        a = getThree() + 7;
        System.out.println(a);
        System.out.println(getThree());
        System.out.println(getDate());  // we can just print it without storing ;
        String date = getDate();   // we can store;
        System.out.println(date);  // once we stored it we can re use it;
        System.out.println(date.replace("/", ""));
        date = getDate().replace("", "/");
        System.out.println(date);

    }


    public static int getThree() {
        return 3;

    }


    public static String getDate() {
String date = "11/3/19";
        return date;

    }
}
