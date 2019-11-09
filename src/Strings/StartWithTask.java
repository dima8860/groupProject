package Strings;

import java.util.Scanner;

public class StartWithTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  User is asked to enter their name.
        //  You will check if it is a cool name.>
        //  If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”>
        //  Otherwise print “Sorry not a cool name”
        System.out.println("Enter name");
        String name = scan.nextLine();
        if (name.substring(0,1).equalsIgnoreCase("a") || name.substring(0,1).equalsIgnoreCase("z") ) {
            System.out.println("Your name is cool");
        }
        else {
            System.out.println("Your name is not cool");
        }
    }
}
