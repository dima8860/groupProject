package Mentorings.Sunday;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramWord {
    public static void main(String[] args) {
        System.out.println(anagramWord("xob","bbb"));
    }
    public static boolean anagramWord(String word, String str2) {
        
int countNew = 0;
int firstTry = 0;
int secondTry = 0;
        if (word.length() == str2.length()) {

            for (int i = 0; i < word.length(); i++) {
                if (word.contains(str2.charAt(i) + "")) {
                    countNew++;
                }
                }
            if (countNew == word.length()) {
               firstTry = 1;
            }
            countNew = 0;

            for (int i = 0; i < word.length(); i++) {
                if (str2.contains(word.charAt(i) + "")) {
                    countNew++;
                }
            }
            if (countNew == word.length()) {
               secondTry = 1;
            }
            if((firstTry+ secondTry) == 2) {
                return true;
            }
            else return false;

        }
        else return false;

    }
}
