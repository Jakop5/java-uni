package E12;

public class Task1 {
    public static double[] getAverages(int[][] array) {
        int len = array.length;
        double[] all = new double[len];
        double row_average = 0;

        for (int row = 0; row != len; row++) {
            int sum = 0;
            for (int e = 0; e != array[row].length; e++) {
                sum = sum + array[row][e];
            }
            row_average = sum / array[row].length;
            all[row] = row_average;
        }

        return all;
    }

    public static void main(String[] args){
        int[][] arr = { {1,3},
                        {3,4,5,8},
                        {6,8},
                        {9} };
        double[] res = getAverages(arr);
        for (double e : res) System.out.print(e + "\n");
    }
}
