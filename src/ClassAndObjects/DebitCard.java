package ClassAndObjects;

public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public DebitCard(long cardNumber, String holderName, double balance) {
        if(String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        }
        else {
            System.out.println("Invalid card number");
        }
        this.holderName = holderName;
        this.balance = balance;

    }

    public DebitCard(long cardNumber, String holderName, double balance, String cardType, int pin) {
        this(cardNumber,holderName,balance);
        if(cardType.equalsIgnoreCase("MasterCard") || cardType.equalsIgnoreCase("Visa")) {
            this.cardType = cardType;
        }
        else {
            System.out.println("Invalid card type");
        }
        if(String.valueOf(pin).length() == 4) {
            this.pin = pin;
        }
        else {
            System.out.println("Invalid pin length");
        }
    }

    public void info() {
        System.out.println("Card number: " + cardNumber);
        System.out.println("Holder name: " + holderName);
        if(cardType != null) {
            System.out.println("Card type: " + cardType);
        }
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
