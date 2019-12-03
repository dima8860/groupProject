package Skyview;

import java.util.Arrays;

public class TeamWork1118 {
    /*
    /**
     * The method takes String str as an argument and returns integer of array. A str may contain
     * symbols, special characters or any numbers. Implementation of method is that separates the
     * number from string and store in array.
     * @param   str String
     * @return  arr integer of array
     * @see sr%73ir4in*f3tg23 => [7, 3, 4, 3, 2, 3]
     * */

    // Required! Method name is: extractNum(String str)


    public static int [] extractNum(String str) {
        String nums = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                nums +=str.charAt(i);
            }
        }
        String [] arr = nums.split("");
        int [] arrNum = new int [arr.length];
        for(int i = 0; i < arrNum.length; i++) {
            arrNum[i] = Integer.valueOf(arr[i]);
        }
        return arrNum;
    }
    /*
     * The method takes word1 and word2 and returns boolean. A method check if word1 and
     * word2 are anagram each other then return true, if not then return false
     * @param word1
     * @param word2
     * @return boolean
     * @see ("listen", "Silent") => true, ("java", "cava") => false
     *
      */

    // Required! Method name is: isAnagram(String word1, String word2)

    public static boolean isAnagram(String word1, String word2) {
        int count1 = 0;
        int count2 = 0;
        if(word1.length() == word2.length()) {
            for(int i = 0; i < word1.length(); i++) {
                if(word1.contains(word2.charAt(i) + "")) count1 ++;
                if(word2.contains(word1.charAt(i) + "")) count2 ++;
            }
            if(count1 == count2) return true;
            else return false;
        }

        else return false;
    }

    /*
     * The method takes integer of array as an argument and returns second larges number of integer from
     * that array.
     * @param arr
     * @return num
     * @see [3, 6, 1, 8, 9, 9, 10, 10, 10] => 9
      */

    // Required! Method name is: secondLargestNum(int[] arr)
public static int secondLargestNum(int[] arr) {
    Arrays.sort(arr);
    int secondBiggest = arr[0];
    for(int i = arr.length - 1; i > 0; i--) {
        if(arr[i] > arr[i-1]){
            secondBiggest = arr[i - 1];
            break;
        }
    }
    return secondBiggest;
}

/*
 * Requirments: See task 4
 * @param db
 * @param op
 * @param id
 * @param data
 * @return database => String
 * @see ("1etsy #2wooden #3spoon ","add","4","aaa") => 1etsy#2wooden#3spoon#4aaa
 */

    // Required! Method name is: lameDb(String db, String op, String id, String data)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractNum("sr%73ir4in*f3tg23")));
        System.out.println(isAnagram("bcc","cbc"));
        int [] arr = {7, 11, 4, 3, 2, 8};
        System.out.println(secondLargestNum(arr));
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa"));
    }

    public static String lameDb(String db, String op, String id, String data) {
        String [] arr = db.split("#");
        int position = Integer.valueOf(id);
        // add, edit and delete, none.
        String afterOperation = "";

        if(op.equals("add")) { // 1etsy #2wooden #3spoon
            String [] arrAdd = new String[arr.length + 1];
            for(int i = 0, j = 0; i < arrAdd.length ;i++) {  // length == 3
                if (i == position - 1) {
                    arrAdd[i] = position + data;
                } else {
                    arrAdd[i] = arr[j].replace(arr[j].charAt(0) + "",i + 1 + "");
                    j++;
                }
                afterOperation += arrAdd[i];
                if(i == arrAdd.length - 1) break;;
                afterOperation += "#";
            }
            return afterOperation;
            }

        else if (op.equals("edit")) {  // replace
            arr[position - 1] = position + data;
            for(int i = 0, j = 0; i < arr.length ;i++) {

                afterOperation += arr[i];
                if(i == arr.length - 1) break;;
                afterOperation += "#";

            }
            return afterOperation;
        }

        else if(op.equals("delete")) {
            arr[position-1] = "";
            for(int i = 0, j = 0; i < arr.length ;i++) {

                afterOperation += arr[i];
                if(i == arr.length - 1) break;;
                afterOperation += "#";
            }
            return afterOperation;
            }
        else return db;
    }

}
