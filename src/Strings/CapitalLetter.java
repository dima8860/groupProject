package Strings;

public class CapitalLetter {
    public static void main(String[] args) {
        String word = "jaVa is cool language";
        String fixed = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(fixed);
        fixed = word.replace('a', 'i');
        System.out.println(fixed);
        fixed = word.replace("ji","Ja");
        System.out.println(fixed);
        System.out.println(word.replace(" ",""));
        System.out.println((word.substring(5,word.length() - 5)) + "d");

        String word2= "Kevin fell from  his bike";
        int from = word2.indexOf("from");
        String word3 = word2.substring(0, from -1);
        System.out.println(word3);
        System.out.println(word2.substring(from) + " " + word3);

    }
}
