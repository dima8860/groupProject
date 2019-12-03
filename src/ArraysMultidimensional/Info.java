package ArraysMultidimensional;

import java.util.Arrays;

public class Info {
    public static void main(String[] args) {
        /*
        Multi dimensional array :
        an array inside of an array;

        datatype [] [] varName = new datatype [size of 2D array(count of inner arrays)] [size of inner array(can be empty also)];
        int [][] groups = new int
         */
        int [][] groups = new int [3][4];
        int [] num = {1,2,3,4,5};
        groups[0] = num;
        System.out.println(Arrays.deepToString(groups));
        int [][] numbers = {{1,2,3}, {4,5,6,6}, {7,8,9}};
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(numbers[0][2]);
        System.out.println(numbers[1].length);
        System.out.println();
        for(int i = 0; i < numbers.length; i++) {
            for(int j= 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
            System.out.println("We will use for each next:");
        }

        for(int [] inner: numbers) {
            System.out.println();
            for (int element : inner) {
                System.out.println(element);
            }
        }


    }
}
