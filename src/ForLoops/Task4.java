package ForLoops;

public class Task4 {
    public static void main(String[] args) {
        String word = "Cybertek";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'b') {
                String s = word.charAt(i) + ""; // converts to char to string;
                System.out.println(s.toUpperCase());
                continue;    // after completing this task it
            }
            if (word.charAt(i) == 't') {
                break; // once it sees 't' it will end for loop without going to all next statements;
            }
            System.out.println(word.charAt(i) + " " + i);

        }
    }
}
