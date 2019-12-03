package ClassAndObjects;

public class ExecutionClass {
    public static void main(String[] args) {

        String name = " James";
        Flag f1 = new Flag();
        f1.country = "USA";
        f1.color = "Red/white/blue";
        f1.size = 5;
        f1.material = "wood and cloth";
        f1.flap();

        Flag f2 = new Flag();
        System.out.println(f2.country);

        f1.info();
        f1.upgrade(6,"wood");
        f1.info();

        Car myCar = new Car();
        myCar.make = "Chevy";
        myCar.mileage = 7600;
        myCar.sportEdition = false;
        myCar.year = 2019;

        myCar.drive();
        myCar.drive(35);
        myCar.drive("Des Plaines");
        myCar.info();

        BankAccount myAccount = new BankAccount();
        myAccount.accountNumber = 123456789;
        myAccount.type = "checking";
        myAccount.balance = 5009.00;
        myAccount.holderName = "Dmytro Chernetskyi";
        myAccount.deposit(123);
        System.out.println(myAccount.balance);
        myAccount.info();
        myAccount.transfer(5000.89);


    }
}
