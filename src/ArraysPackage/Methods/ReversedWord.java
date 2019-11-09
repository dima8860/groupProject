package ArraysPackage.Methods;

import java.util.Arrays;

public class ReversedWord {
    public static void main(String[] args) {
        // Given the String: “It started to snow in Chicago”
        //Reverse each individual word and print the result
        //> expected output:
        //tI detrats ot wons ni ogacihC
        String str = "Give me money";
        String [] strArray = str.split(" ");
        String finalWord = "";

        for(int j = 0; j <= strArray.length - 1; j++) {
            String temp = "";
            for (int i = strArray[j].length() - 1; i >= 0; i--) {
                 temp += "" + strArray[j].charAt(i);
                 finalWord = temp;
            }
            strArray[j] = finalWord;
        }
        System.out.println(Arrays.toString(strArray));
    }
}
