package Constructors;

public class Phone {
    public Phone (String model, String color){
       this.model = model;
       this.color = color;
    }

    public Phone(String model, String color, int memory, boolean touchscreen) {
        this.model = model;
        this.color = color;
        this.touchscreen = touchscreen;
        if(memory < 0) {
            System.out.println("Invalid memory");
        }
            else this.memory = memory;

    }
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public void info() {
        System.out.println("\nTouchscreen is: " + touchscreen);
        System.out.println("Model is: " + model );
        System.out.println("Memory is: " + memory);
        System.out.println("Color is: " + color);
        System.out.println("Phone number is: " + phoneNumber);
    }
/*
Create a method text that accepts long(phone number) and String(text) and returns boolean. Check given number length and text body.
Print: “%textBody sent to %givenPhoneNumber” if length is 10 and text body is not empty then return true; Print: “Invalid phone number or text body” and return false if otherwise.

Create a method call that accepts long (phone number). Print “Calling to %phoneNumber”
if phone number length is 10. Print “Invalid phone number” if otherwise.
 */
    public boolean texting(long phoneNumber, String text) {
        String phoneNumberNew = phoneNumber + "";
        if(phoneNumberNew.length() == 10 && !text.equals("")) {
            System.out.println(text + " sent to " + phoneNumber);
            return true;
        }
        else {
            System.out.println("Invalid phone number or text body");
            return false;
        }
    }

    public void calling(long phoneNumber) {
        String phoneNumberNew = phoneNumber + "";
        if(phoneNumberNew.length() == 10) {
            System.out.println("Calling to " + phoneNumber);
        }
        else {
            System.out.println("Invalid phone number");
        }
    }
}
