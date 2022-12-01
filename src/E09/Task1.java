package E09;

import java.util.Arrays;

public class Task1 {
    public static int[] findEven(int[] arr) {
        int[] even = {};
        int[] temp_even = new int[0];

        for (int i = 0; i != arr.length - 1; i++) {
            if (arr[i] % 2 == 0) { //even check

                temp_even = new int[even.length + 1];
                for (int a = 0; a < even.length; a++)
                    temp_even[i] = even[i];
                temp_even[even.length] = arr[i];

            }
        }

        return temp_even; //return array of all even numbers
    }

    public static void main(String[] args){
        int[] array = {1,7,4,5,8,2,3,6,2};
        System.out.println("All even numbers:" + Arrays.toString(findEven(array)));
    }
}