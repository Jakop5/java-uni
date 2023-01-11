package E14;

import java.util.Enumeration;

public class Child {
    public static String name;
    public int numCandies = 2;
    public Child(String n) {
        name = n;
    }

    void givesCandyTo(Child other){
        if (numCandies==0){
            System.out.println("This child doesn't have any candy.");
        } else{
            other.numCandies += numCandies; //add candy to the other child
        }
    }

    static Child getChildByName(Child[] children, String name){
        for (int i=0;i!=children.length;i++){
            if (children[i] == new Child(name)){
                return new Child(name);
            }
        }
        //else
        return null;
    }

    static void printChildren(Child[] children) {
        System.out.print(children.length + " children: ");
        System.out.print("[ ");
        for (int k = 0; k!=children.length; k++) {
            System.out.print("( " + children[k].name + ", " + children[k].numCandies + " candies" + " ) , ");
        }
        System.out.print(" ]");
    }
}
