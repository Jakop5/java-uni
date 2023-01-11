package E19;

public class Calculator extends CalculatingDevice {
    public Calculator(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double sub = x-y;
        String retrn = x + "-" + y + "=" + sub + "; ";

        return super.calculate(x,y) + retrn;
    }
}
