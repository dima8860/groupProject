package Constructors;

public class Sky {

    public Sky(String colorCode) { // hidden constructor
        this.color = colorCode; // this.color means we are using variable color from instance variables.
    }
    public Sky(String colorCode, long visibleStars){
        this.color = colorCode;
        this.visibleStars = visibleStars;
    }
    public void info() {
        System.out.println("\nColor is " + color);
        System.out.println("Visible stars " + visibleStars);
    }

    String color;
    long visibleStars;

    public static void main(String[] args) {
        Sky sky = new Sky("Blue"); // 'sky' is a reference name that pointing to the object ==>; new Sky() is an object.
        System.out.println(sky.color);

        Sky newSky = new Sky("grey", 100000000000000000L);
        sky.info();
        newSky.info();


    }

}
