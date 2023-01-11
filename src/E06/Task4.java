package E06;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input width:");
        int w = scan.nextInt();
        System.out.print("Input height:");
        int h = scan.nextInt();

        for (int hei = h - 1; hei>=0; hei--){
            if (hei + 1 == h || hei == 0){
                for (int wid = w; wid>0; wid--){
                    System.out.print("*");
                }
                if (hei == 0){
                    break;
                }
            }else {
                System.out.print("\n*");
                for (int floor = w - 2; floor>=0; floor--){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
    }
}
