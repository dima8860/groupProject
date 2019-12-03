package StaticExamples;

public class Lexus {
    String model;
    int year;
    String color;
    double mileage;
    boolean newOrNot;
    static double price = 100;
    static int totalNumOfLexus;
    static {
        price = 200;
    }


    public Lexus(String model, int year) {
        this.model = model;
        this.year = year;
        totalNumOfLexus++;
    }

    public static double mileToKm(double miles) {
        double kilometers = miles * 1.6;
        return kilometers;
    }
    public static void evaluateCar(Lexus lexus) {
        int age = 2019 - lexus.year;
        if(lexus.mileage < 50 && age < 3 ) {
            System.out.println("Best choice ever!!!!! Pay cash");
        }
        else if(lexus.mileage >= 50 && lexus.mileage < 100  && age >=3 && age < 7 ) {
            System.out.println("Fair choice buddy");
        }
        else if(lexus.mileage >= 100 && lexus.mileage < 200  ) {
            System.out.println("You must decide today");
        }
        else if(lexus.mileage >= 200   ) {
            System.out.println("Stay away from this car my friend");
        }
        else {
            System.out.println("Not able to evaluate");
        }
    }
}
