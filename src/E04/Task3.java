package E04;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your fuel consumption:");
        double fuel = scan.nextDouble();
        System.out.print("European or USA units (eu or usa):");
        String unit = scan.next();

        switch (unit){
            case "eu": // l/100km
                double conv = fuel/3.785412;
                conv = 100/conv;
                conv = conv/1.609344;
                System.out.println(fuel + " l/100km = " + conv +" mpg");
                break;
            case "usa": // mpg
                conv = fuel*1.609344;
                conv = 100/conv;
                conv = conv*3.785412;
                System.out.println(fuel + " mpg = " + conv + " l/100km");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
