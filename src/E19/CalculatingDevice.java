package E19;

public class CalculatingDevice {
    private String device_name;
    public CalculatingDevice(String name) {
        device_name = name;
    }

    public String calculate(double x, double y){
        double sum = x+y;
        return device_name + ": " + x + '+' + y + '=' + sum + "; ";
    }

    public static void printRes(CalculatingDevice[] a, double x, double y){
        for (CalculatingDevice device : a){
            System.out.println(device.calculate(x,y));
        }
    }
}
