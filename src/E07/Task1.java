package E07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number:");
        int n = scan.nextInt();

        for(int rows = 1; rows!=n+1; rows++){
            System.out.printf("%4d",rows);
            for(int cols = n-(n-2); cols!=n+1; cols++){
                System.out.printf("%4d",rows*cols);
            }
            System.out.print("\n");
        }
    }
}
