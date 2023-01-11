package E15;

public class Square {
    double side;
    public Square (double s){
        side = s;
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getInscribedCircle(){
        return (Math.PI/4)*side*side;
    }

    public double getCircumscribedCircle(){
        return (side*side*(Math.PI/2));
    }

    public Circle sameAreaSquare(){
        double area_circle = side/Math.sqrt(Math.PI); //calc area of circle same size as this square
        Circle SqCircle = new Circle(Math.sqrt((area_circle/Math.PI))); // calc radius of the new circle based on it's area
        return SqCircle;
    }
}
