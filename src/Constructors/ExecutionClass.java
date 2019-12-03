package Constructors;

public class ExecutionClass {
    public static void main(String[] args) {
        Phone myPhone = new Phone("iphone", "black", 12, true);
        myPhone.phoneNumber = 847_912_0578L;
        myPhone.info();
        myPhone.texting(1234567891L,"sdf");
        myPhone.calling(12345678910L);
    }
}
