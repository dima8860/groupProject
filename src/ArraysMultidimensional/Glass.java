package ArraysMultidimensional;

public class Glass {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 1, 7},
                {2, 3, 9, 9, 1, 8},
                {7, 8, 1, 9, 9, 9},
                {3, 4, 9, 9, 9, 9},
                {1000, 2, 3, 9, 9, 100}
        };
        System.out.println(biggestShapeSum(arr));
    }

    public static int biggestShapeSum(int arr[][]) {
        int sum = 0;
        int biggestSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= arr.length / 2 && j <= arr.length / 2) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > biggestSum) biggestSum = sum;
                }
            }
        }
        return biggestSum;
    }
}



