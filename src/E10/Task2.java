package E10;

import java.util.Arrays;

public class Task2 {
    public static int[][] trans(int[][] arr){
        int[][] b = new int[arr[0].length][arr.length];

        for (int i=0; i < arr.length; i++){ //rows to columns
            for (int j=0; j < arr[i].length;j++){
                b[j][i] = arr[i][j];
            }
        }
        return b;
    }

    public static void main(String[] args){
        int[][] array = { {1,2,3,4,5,6},
                          {2,3,4,5,6,7},
                          {3,4,5,6,7,8},
                          {4,5,6,7,8,9} };

        for (int[] r : array)
            System.out.println(Arrays.toString(r));
        System.out.println();

        for (int[] tr : trans(array))
            System.out.println(Arrays.toString(tr));
    }
}
