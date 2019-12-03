package StaticExamples;

public class Executing {
    public static void main(String[] args) {
        Lexus myCar = new Lexus("Ferrari", 2018);
        myCar.mileage = 10;
        System.out.println(myCar.mileToKm(100));
        System.out.println(Lexus.mileToKm(200));
        Lexus.evaluateCar(myCar);
        System.out.println(myCar.price);
    }
}
