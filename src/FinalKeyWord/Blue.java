package FinalKeyWord;

public class Blue {
    final String name = "Jason";  // default value was "null" at this point. When we use final for instance variable
    // we have to initialize it (give value at this point) because it will complaint


    public static  void main(String[] args) {
        final int k;
        System.out.println("Program");
        k = 9;
        System.out.println(k);
      //   k = 12; can not be done because of final;
        Blue b = new Blue();
        System.out.println(b.name);
     //   b.name = "Mark";  can not reassign final;

        Bag bag = new Bag("White");
        Bag bag2 = new Bag("Black");
        System.out.println(bag.color);
        System.out.println(bag2.color);
        System.out.println(Bag.model);

        String name = "Jason";
        String str = "Jason";
        String str2 = new String ("Jason");
        System.out.println(name.hashCode());
        System.out.println(str.hashCode());
        System.out.println(str2 == str);
        System.out.println(Integer.toHexString(str.hashCode()));
        System.out.println(Integer.toHexString(str2.hashCode()));

    }

}
