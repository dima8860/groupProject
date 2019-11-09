package Mentorings.Wednesday;

public class Task1 {
    public static void main(String[] args) {
        char [] c = new char [1000000];

        String s = new String(c);
        long start = System.currentTimeMillis();
        System.out.println(isPalindromeWithStringBuilder(s));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(isPalindromeBetterOne("civic"));
        System.out.println(isPalindromeBetterOne("civic1"));
        System.out.println(isPalindromeBetterOne("Civic"));
        System.out.println(isPalindromeBetterOne("  civic"));
        System.out.println(isPalindromeBetterOne(""));
        System.out.println(isPalindromeBetterOne(null));

    }
    static boolean isPalindrome(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);

        }
        return s.equals(reversed);
    }
    static boolean isPalindromeBetterOne(String s) {
        s = s.toLowerCase().trim().replace(" ","");
        if(s== null) return false;
        if(s.isEmpty()) return false;
        boolean isPalindrome = true;
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1 -i)) {
                isPalindrome = false;
                break;
            }
        }


        return isPalindrome;
    }
    static  boolean isPalindromeWithStringBuilder(String s) {
        StringBuilder sB = new StringBuilder(s);
        String reversed = sB.reverse().toString();
        return s.equals(reversed);

    }
}
