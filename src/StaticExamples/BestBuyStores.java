package StaticExamples;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy storeOne = new BestBuy();
        BestBuy storeTwo = new BestBuy();
        System.out.println(storeOne.numOfComputers);
        storeOne.numOfComputers--;
        System.out.println(storeTwo.numOfComputers);
        System.out.println(BestBuy.numOfComputers);
        storeOne.day = "tuesday";
        System.out.println(BestBuy.day);


    }




}
