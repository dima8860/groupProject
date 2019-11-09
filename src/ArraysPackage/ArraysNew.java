package ArraysPackage;

public class ArraysNew {
    public static void main(String[] args) {
        /* 
        Array is one group of collections thar can hold multiple things of the same kind
        // ex:
        // String name1 = "james";
        String name2 = "joe";
        String name3 = "mary";

                                                String [] names = new String[4]; ---> last index is 3!!!!!!!!!! (0,1,2,3 --> total 4)
        Syntax :

        dataType [] variableName = new dataType[size];

        (dataType variableName [] = new dataType[size]; ---- same but not professional;)

        --->dataType: primitive or objects type;
        --->[] : syntax to show that this is an array;
        --->new : keyword to make an  object;
        --->variableName : follows the same variables naming rules;
        --->[size] : an integer that tells home many things the array will store;
        --->each part of an array is called an element;
        --->when you make new String array all elements are null;

        String [] names = new String[4];

        HOW TO STORE ELEMENTS INTO AN ARRAY?

        nameOfArray[index] = value;
        names[0] = name1; ----> names[0] = "james";
        name[1] = name2;

       -> The value being stored into the array should be the same datatype of the array being storing into
        System.out.println(Arrays.toString(nums));
        HOW TO READ INFORMATION FROM ARRAY?
         */

        int [] nums = new int[4];
        String [] names = new String[3];
        names[0] = "James";
        names[1] = "Dmytro";
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = nums[0] + nums[1];

        System.out.println(nums[1] + 1);
        System.out.println(names[0].replace('J', 'P'));

        /*
        LOOPING THROUGH AN ARRAY
        length() ------ only for String;
        length ------- length of Array ( how many elements)

        int [] nums = {2,3,4,5,6};

         */


    }
}
