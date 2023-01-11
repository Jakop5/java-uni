package E08;

import java.util.Arrays;

public class Task1 { //problem 1 & 2
    public static int getLargest(int[] arr){
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i != len; i++){
            for (int clong = i + 1; clong < len; clong++){
                if (arr[i] > arr[clong])
                {
                    temp = arr[i];
                    arr[i] = arr[clong];
                    arr[clong] = temp;
                }
            }
        }
        return temp;
    }

    public static int getSmallest(int[] arr){
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i != len; i++){
            for (int clong = i + 1; clong < len; clong++){
                if (arr[i] < arr[clong])
                {
                    temp = arr[i];
                    arr[i] = arr[clong];
                    arr[clong] = temp;
                }
            }
        }
        return temp;
    }

    public static int[] swapBigSmall(int[] arr) {
        int small = getSmallest(arr);
        int big = getLargest(arr);

        int[] arr_swap = arr;
        int len = arr.length;
        int i, j;
        int small_i = 0, big_i = 0;
        
        for (i = 0; i != len - 1; i++) {
            if (small == arr[i]) {
                small_i = i;
                break;
            }
        }
        
        for (j = 0; j != len - 1; j++) {
            if (big == arr[j]) {
                big_i = j;
                break;
            }
        }

        arr_swap[big_i] = getSmallest(arr);
        arr_swap[small_i] = getLargest(arr);

        return arr_swap;
    }

    public static void main(String[] args){
        // starting array
        int[] arr1 = {3,4,5,5,6,15,7,10,23,12,10,3,4,2,3,9,7};

        System.out.println("Biggest value in array: "+ getLargest(arr1));
        System.out.println("Smallest value in array: "+ getSmallest(arr1));

        System.out.println("Difference between the maximum and minimum elements: "
                            + (getLargest(arr1) - getSmallest(arr1)));

        // swap the max with min
        System.out.println("Array before swap: " + Arrays.toString(arr1));
        System.out.println("Array after swap: " + Arrays.toString(swapBigSmall(arr1)));

  //      System.out.print("Array before swap: ");
  //      for (int num: arr1){
  //          System.out.print(num+" ");
  //      }

  //      System.out.println("Array after swap: ");
  //      for (int num: swapBigSmall(arr1)){
  //         System.out.print(num+" ");
  //      }
    }
}
