package Strings;

public class CharClass {
    public static void main(String[] args) {
        String word = "Java is fun";
        String word2 = "is";
        String word3 = "fun";
        char firstChar = word.charAt(0);
        char firstChar2 = word2.charAt(0);
        System.out.println(word.contains(word3));

        System.out.println(""+ firstChar+firstChar2 + " morgan");
    }
}
