package E05;

import java.io.PrintStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Value d:");
        double d = scan.nextDouble();
        System.out.print("Name of figure:");
        String name = scan.next();

        int rand = (int) (Math.random()*10);
        while (rand>3){
            rand = rand/2;
        }
        System.out.println("rand: "+rand);

        double area = switch (name) {
            default -> throw new IllegalStateException("Unexpected value: " + name);
            case "disc" ->  Math.PI * d;
            case "triangle" -> (Math.pow(d,2)*Math.cbrt(3))/4;
            case "square" -> Math.pow(d,2);
            case "rand" -> switch (rand) {
                case 1 ->  Math.PI * d;                   //disc
                case 2 -> (Math.pow(d,2)*Math.cbrt(3))/4; //triangle
                case 3 -> Math.pow(d,2);                  //square
                default -> throw new IllegalStateException("Unexpected value: " + rand);
            };

        };

        if(name.equals("rand")) {
            String rand_name = switch (rand) {
                case 1 -> "disc";
                case 2 -> "triangle";
                case 3 -> "square";
                default -> throw new IllegalStateException("Unexpected value: " + rand);
            };
            System.out.println("Area of your "+ rand_name + " is: "+ area);
        }
        else System.out.println("Area of your "+ name + " is: "+ area);

    }
}
