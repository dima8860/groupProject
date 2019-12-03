package Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {

    // this method is about creating list of Strings etc...

    /**
     * This method creates list of strings from the user.
     * Method doesn't take anything. It uses Scanner to fill the list
     * @return ArrayList of String
     */
    public static ArrayList<String> getStringList() {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) { // true is an infinitive loop
            System.out.println("Enter word: ");
            words.add(scanner.nextLine());
            System.out.println("Are you done? Y/N");
            if (scanner.nextLine().equals("Y")) {
                break;
            }
        }

        return words;
    }

    public static ArrayList<String> filterList(ArrayList<String> words, int size) {
        ArrayList<String> newWords = new ArrayList<>();
        for(String s: words) {
            if(s.length() == size) {
                newWords.add(s);
            }
        }
        return newWords;
    }

    public static ArrayList<String> removeDuplicate(ArrayList<String> words) {
        ArrayList<String> newWords = new ArrayList<>();
        for(String s: words) {
            if(newWords.contains(s)) {
                continue;
            }
            newWords.add(s);
        }
        return newWords;

    }



}
