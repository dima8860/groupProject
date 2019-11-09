package Strings;

public class StringMethods {
    public static void main(String[] args) {
        // INDEX STARTS FROM 0 (ZERO)
        String word1 = "Java looks good";
        String word2 = "Python";
        System.out.println(word1.equals(word2)); // return  true false
        System.out.println(word1.equalsIgnoreCase(word2)); // return true false
        System.out.println(word1.contains(word2)); // return true false
        System.out.println(word1.indexOf("a")); // return a number of index
        System.out.println(word1.indexOf("a",2)); // return index of char after index 2
        System.out.println(word1.length()); // return number of length
        System.out.println(word1.isEmpty()); // return true false
        System.out.println(word1.lastIndexOf("a")); // gives last position of that char which is 3 here
        System.out.println(word1.charAt(2)); // return char at index 2
        System.out.println(word1.toLowerCase()); // return java
        System.out.println(word1.toUpperCase()); // return JAVA
        System.out.println(word1.startsWith("a")); // return true false
        System.out.println(word1.endsWith("a")); // return true false
        System.out.println(word1.compareTo(word2)); // return a number difference
        System.out.println(word1.replace("a", "o")); // replaces all "a" with new "o"
        System.out.println(word1.substring(2)); // return string starting from that index 2 which becomes "va"
        System.out.println(word1.substring(0,3)); // return string from 0 index to 2 index because last 3 is excluded.
        System.out.println(word1.trim()); // return string with removed spaces " Java " -->> "Java"
        System.out.println(word1.toUpperCase().replace("A","b")); // Two methods in one object
        System.out.println(word1.replace(" ","")); // replaces spaces with empty spaces
        System.out.println(word1.concat(" is my language for the rest of my life"));
        System.out.println("joking :))");
        /*
        \" ------>>>>>  add double quote
        \' ------>>>>> single quote
        \


         */

    }
}
