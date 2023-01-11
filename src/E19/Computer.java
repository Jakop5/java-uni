package E19;

public class Computer extends Calculator{
    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double multi = x*y;
        String retrn1 = String.valueOf(x) + '*' + y + '=' + multi + "; ";

        double div = x/y;
        String retrn2 = String.valueOf(x) + '/' + y + '=' + div + "; ";

        return super.calculate(x, y) + retrn1 + retrn2;
    }
}
