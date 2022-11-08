package E03;

public class Task1 {
    public static void main(String[] args) {
        int a = 15, b = 10, c = 5;
        int min = a, max = a, mid = 0;

        if (a>b) {min=b;}
        if (b>c) {min=c;}
        if (a<c) {min=a;}

        if (a<b) {max=b;}
        if (b<c) {max=c;}
        if (c<a) {max=a;}

        if (max == a && min == c || max == c && min == a) {mid = b;}
        if (max == b && min == c || max == c && min == b) {mid = a;}
        if (max == a && min == b || max == b && min == a) {mid = c;}

        System.out.println("Min "+min);
        System.out.println("Mid "+mid);
        System.out.println("Max "+max);

        if (min+mid>max) {
            System.out.println("OK Triangle");
        } else System.out.println("NOT OK Triangle");;
    }
}
