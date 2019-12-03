package ArrayListPackage;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jason");
        names.add("Adam");
        names.add(0,"Vasyl");
        names.add(1,"Tyrone");
        System.out.println(names.size());
        System.out.println(names.get(3));
         System.out.println(names);
         ArrayList<Cat> catsForSale = new ArrayList<>();
         Cat cat1 = new Cat();
         cat1.color = "white";
         cat1.age = 3;

         catsForSale.add(cat1);
         Cat cat2 = new Cat();
         cat2.color = "Grey";
         cat2.age = 4;
         catsForSale.add(cat2);
        System.out.println(catsForSale);

        for(int i = 0 ; i < catsForSale.size(); i++) {
            System.out.println("Cat# is " + (i + 1));
            System.out.println("Color is " + catsForSale.get(i).color);
            System.out.println("Age is " + catsForSale.get(i).age + "\n");
        }

        ArrayList<String> words = new ArrayList<>();
        words.add(("Hi"));
        words.add("Grass");
        words.add("pen");
        String s  = words.get(1);
        int lengthS = words.get(1).length();

     }
}
