package ForLoops;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Write a program that asks from the user infinitely:
        //if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
        //Flow:
        //> hi
        //Hello
        //> bye
        //Good bye
        //> james
        //Good bye
        Scanner scan = new Scanner(System.in);
        for (int i = 0; ;i++) { // infinitive loop ( ; ; )   (true)    (i == 0)
            System.out.println("please say hi");
            String userInput = scan.nextLine();
            if (userInput.equals("hi")) {
                System.out.println("Hello");
            }
            else if (userInput.equals("bye")) {
                System.out.println("Good bye");
                break;
            }
            else {
                break;
            }

        }

    }

}
