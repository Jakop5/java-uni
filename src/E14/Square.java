package E14;

public class Square {
    private double side;
    public Square(double side_len) {
        side = side_len;
    }

    public double getSide(){
        return side;
    }

    public double getDiagonal(){
        return side*Math.sqrt(2);
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getArea(){
        return side * side;
    }

    public static Square getSideSum (Square sq1, Square sq2) {
        double sidesum = Math.sqrt(sq1.getArea()+sq2.getArea());
        return new Square(sidesum);
    }
}
