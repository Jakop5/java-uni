package E10;

public class Task3 {
    public static int[] Calc(int[][] arr){
        int[] b = new int[4];

        // largest row
        int row_sum, max_row=0;
        for (int i=0; i!=arr[i].length; i++){ //sum of rows
            row_sum = arr[i][0]+arr[i][1]+arr[i][2];
            if (row_sum > max_row){
                max_row = row_sum;
            }
        }
        b[0] = max_row;

        // largest column
        int col_sum=0, max_col=0;
        for(int ii=0; ii!=arr.length;ii++){
            for(int jj=0;jj!=arr.length;jj++){
                col_sum = col_sum + arr[ii][jj];
            }
            if (col_sum > max_row){
                max_col = col_sum;
            }
        }
        b[1] = max_col;

        return b;
    }

    public static void main(String[] args){
        int[][] arr = { {1,3,2},
                        {2,6,8},
                        {3,4,8},
                        {1,8,5} };

        int[] ab = Calc(arr);
        System.out.println("Max row: " + ab[0] + "Max col: " + ab[1]);
    }
}
