package Scanner;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //name - string
        //gender - char
        //age - int
        //phone number - long gpa - double
        //—> After getting the information print the information in this format:
        //Name: givenName Gender: givenGender
        //etc....
        System.out.println("Whats your name?");
        String name = input.nextLine();
        System.out.println("What is your gender?");
        char gender = input.nextLine().charAt(0);
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("What is your phone number?");
        long phoneNumber = input.nextLong();
        System.out.println("What is your gpa?");
        double gpa = input.nextDouble();
        System.out.println("Name " + name);
        System.out.println("Gender " + gender);
        System.out.println("Age " + age);
        System.out.println("Phone number " + phoneNumber);
        System.out.println("GPA " + gpa);




    }
}
