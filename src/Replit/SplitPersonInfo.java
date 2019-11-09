package Replit;

import java.util.Scanner;

public class SplitPersonInfo {
    /*
    Instructions from your teacher:
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
     */



        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String s = inp.nextLine();
            person(s) ;
        }

        public static void person(String info)
        {
            String [] str = info.split(",");
            System.out.println("person name: " + str[0] + " last name: " + str[1] + " age: " + str[2]);

            //your code here


        }//end person

    }

