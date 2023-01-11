package E14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Child[] children = new Child[3];

        for (int i=0; i!=children.length; i++){
            System.out.println("Names left to input -> " + (children.length-i));
            System.out.print("Input a name for the child: ");
            String name = scan.next();
            children[i] = new Child(name);

        }
        System.out.print("\n");

        for(int j=0; j!=children.length;j++){
            System.out.println("Name of the child no " + j + ":"+ children[j].getChildByName(children, children[j].name));
        }

        Child.printChildren(children);
    }
}
