package E14;

public class Task2 {
    public static void main(String[]  args){
        Temperature t1 = new Temperature(25, 'C');
        System.out.printf("C: %6.2f%n", t1.getInC());
        System.out.printf("F: %6.2f%n", t1.getInF());
        System.out.printf("K: %6.2f%n", t1.getInK());

        Temperature t2 = new Temperature(77, 'F');
        System.out.printf("C: %6.2f%n", t2.getInC());
        System.out.printf("F: %6.2f%n", t2.getInF());
        System.out.printf("K: %6.2f%n", t2.getInK());

        Temperature t3 = new Temperature(298.15, 'K');
        System.out.printf("C: %6.2f%n", t3.getInC());
        System.out.printf("F: %6.2f%n", t3.getInF());
        System.out.printf("K: %6.2f%n", t3.getInK());

    }
}
