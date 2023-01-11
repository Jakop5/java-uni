package E06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number:");
        int stars = scan.nextInt();

        for(int sp = 0; stars>=1 ;sp++){
            for (int spa = sp; spa!=0; spa--){
                System.out.print(" ");
            }
            for (int star = stars; star!=0; star--){
                System.out.print("*");
            }
            stars = stars - 2;
            System.out.print("\n");
        }
    }
}
