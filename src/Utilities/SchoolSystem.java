package Utilities;

import java.util.ArrayList;

public class SchoolSystem {
    public static void main(String[] args) {

       // ArrayList<String> myList =  MyCollection.getStringList();
       // System.out.println(myList);
        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("sdf");
        myList2.add("sdfg");
        myList2.add("ghj");
        myList2.add("sdf");
        myList2.add("ghj");
        ArrayList<String> k = MyCollection.filterList(myList2,3);
        ArrayList<String> m = MyCollection.removeDuplicate(myList2);

        System.out.println(k);
        System.out.println(m);





    }
}
