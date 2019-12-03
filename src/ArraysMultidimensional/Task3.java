package ArraysMultidimensional;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [][] numbers ={ {1,2,3,4}, {3,4,4,3,2,2,}, {3,3,4,4,}};
        for(int [] innerArr: numbers) {
for(int element : innerArr) {
    element = 1;
}
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
