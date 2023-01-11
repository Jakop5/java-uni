package E14;

public class Temperature {
    private double temp;
    public Temperature(double tm, char unit){
        this.temp = switch (unit){
            case 'C' -> tm; // C
            case 'K' -> tm - 273.15; // Kel to C
            case 'F' -> 5./9*(tm - 32); //fahr to C
            default -> throw new IllegalStateException();
        };
    }

    public double getInC(){
        return temp; // C
    }

    public double getInF(){
        return 9./5*temp + 32; // from C to Fahr
    }

    public double getInK(){
        return temp + 273.15; // from C to kel
    }
}