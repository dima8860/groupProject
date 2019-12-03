package Replit;

public class CoverME {
    public static void main(String[] args) {


        System.out.println(coverString("hello hello", "ello")); //"java methods", "me" "Certified Wooden Spoon", "o"

    }

    public static String coverString(String main, String coverME) {
        String str = ""; // beginning with length of coverMe word;
        String covered = "[" + coverME + "]";
        if(main.contains(coverME)) {
            for (int i = 0; i < main.length(); i++) {
                if ((i + coverME.length()) <= main.length() && main.substring(0 + i, coverME.length() + i).equals(coverME)) { // if main part equals to coverme word;
                    str = str + covered;
                    if(coverME.length() > 1) {
                        i = i + coverME.length() - 1;
                    }

                }
else {
                    str = str + main.charAt(i);

                }
            }
        }
        else {
            str = "[" + main + "]";
        }

return str;
    }
}