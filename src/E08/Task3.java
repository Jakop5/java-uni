package E08;

import java.util.Arrays;

public class Task3 {
    public static int getLargest(int[] arr){
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void arrayToHistogram(int[] arr){
        int h = getLargest(arr);

        for (int i=h; i!=0; i--){
            for (int j = 0; j!= arr.length; j++){
                if (!(arr[j]-i<0)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.print("\n");
        }
    }

    public static void main(String[] args){
        int [] array = {1,5,8,2,6};

        arrayToHistogram(array);
    }
}
