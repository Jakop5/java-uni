package E14;

public class Task1 {
    public static void main(String[] args){
        Square a = new Square(3);
        Square b = new Square(4);

        System.out.println(a.getArea());
        System.out.println(a.getSide());
        System.out.println(a.getPerimeter());
        System.out.println(a.getDiagonal());
        System.out.println((Square.getSideSum(a,b)).getSide());
    }
}
