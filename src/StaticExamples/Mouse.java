package StaticExamples;

public class Mouse {
    String color;  // all instance variable belong to an object. To use the we have to create an object.
    int size;
    String condition;  // default false;
    boolean wireless; // default false;

    public Mouse(String color, int size, boolean wireless, String name) {
         name = name;
        this.color = color;
        this.size = size;
        this.wireless = wireless;
        System.out.println(name + " created this mouse object");
    }

    public Mouse(){

    }

}
