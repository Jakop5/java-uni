package E13;

public class Task1 {
    public static void selSort(int[] arr) {

    }
    public static void sortRows(int[][] arr) {

    }
    public static void sortCols(int[][] arr) {

    }
    public static void printArr2D(int[][] arr) {

    }


    public static void main (String[] args) {
        int[][] a = { {3,2,6,1,3,5,6,1,3},
                {3,1,2,1,5,7,2},
                {8,9,2,1} };
        System.out.println("Before:");
        printArr2D(a);
        sortRows(a);
        System.out.println("After:");
        printArr2D(a);

        int[][] b = { {3,2,6,1,6},
                {7,1,2,1,5},
                {5,3,1,8,7},
                {8,9,2,7,1} };
        System.out.println("Now columns\nBefore:");
        printArr2D(b);
        sortCols(b);
        System.out.println("After:");
        printArr2D(b);
    }
}

