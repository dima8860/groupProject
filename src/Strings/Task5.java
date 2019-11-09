package Strings;

public class Task5 {
    public static void main(String[] args) {
        //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


//                lastTwo("coding") → "codign"
//        lastTwo("cat") → "cta"
//        lastTwo("ab") → "ba"
        String str = "coding";
        String lastLetter = str.substring(str.length()-1);
        System.out.println(lastLetter);
        String beforeLastLetter = str.substring((str.length()-2),(str.length() - 1));
        System.out.println(beforeLastLetter);
    }
}
