package E03;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a -> ");
        int a = scan.nextInt();

        System.out.print("Enter b -> ");
        int b = scan.nextInt();
        scan.close();

        // s1 should be " = " or " != "
        String s1 = (a==b) ? "=" : "!=";

        // s2 should be " = " or " < " or " > "
        String s2 = (a==b) ? "=" : (a>b) ? ">": "<";

        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);
    }
}
