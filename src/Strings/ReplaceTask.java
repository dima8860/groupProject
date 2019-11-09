package Strings;

import java.util.Scanner;

public class ReplaceTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // User is asked to enter a message to send.
        // You will check if the message contains any of these bad words: “idiot, dumb, stupid”>
        // if any bad words are in the message change them to “smart”
        // and print “your message was changed:” and then print the new message in the next line.>
        // if the message had no bad words print “Your message was not changed:”
        // and then print the original message in the next line.
        System.out.println("Enter message");
        String inputMessage = scan.nextLine();
        if (inputMessage.contains("idiot")) {
            System.out.println("your message was changed");
            System.out.println(inputMessage.replace("idiot", "smart"));
        }
        else if (inputMessage.contains("dumb")) {
            System.out.println("your message was changed");
            System.out.println(inputMessage.replace("dump", "smart"));
        }
        else if (inputMessage.contains("stupid")) {
            System.out.println("your message was changed");
            System.out.println(inputMessage.replace("stupid", "smart"));
        }
        else {
            System.out.println("Your message was not changed: " + inputMessage);
        }
    }
}
