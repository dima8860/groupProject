package StaticExamples;

public class BestBuy {

      String location;
    static int numOfComputers;
    static  String day;
    static {
        System.out.println("run first");
        numOfComputers = 50;
        day = "monday";
    }
    static {
        System.out.println("run 2nd");
        numOfComputers = 100;
    }

    public static void main(String[] args) {
        System.out.println(numOfComputers);
    }



}
