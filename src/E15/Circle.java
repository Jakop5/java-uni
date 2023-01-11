package E15;

public class Circle {
    double rad;
    public Circle (double radius){
        rad = radius;
    }

    public double getRadius(){
        return rad;
    }

    public double getArea(){
        return (Math.PI)*rad*rad;
    }

    public double getPerimeter(){
        return 2*(Math.PI)*rad;
    }

    public double getInscribedSquare(){
        return (Math.PI)*rad*rad;
    }

    public double getCircumscribedSquare(){
        return (2*rad*rad);
    }

    public static Square[] getSquares(Circle[] arr){
        Square[] squares = new Square[arr.length];

        for (int i = 0; i < arr.length; i++) {
            double radius = arr[i].getRadius();
            double area = Math.PI*radius*radius;
            squares[i] = new Square(Math.sqrt(area));
        }

        return squares;
    }
}
