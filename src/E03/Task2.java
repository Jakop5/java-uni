package E03;

public class Task2 {
    public static void main(String[] args) {
        int a1 = 2, a2 = 4, b1 = 1, b2 = 6;
        int x = 5;

        boolean inA = x>= a1 && x<=a2;
        boolean inB = x>= b1 && x<=b2;
        boolean inAminB = inA == true || (inA == true && inB == false) || !(inB == true);
        boolean inBminA = inB == true || (inB == true && inA == false) || !(inA == true);
        boolean interAB = inA && inB;
        boolean unionAB = inA || inB;
        boolean symAB = unionAB && !(interAB);

        System.out.println("Value x: " + x);
        System.out.println("x in A: " + inA);
        System.out.println("x in B: " + inB);
        System.out.println("x in A-B: " + inAminB);
        System.out.println("x in B-A: " + inBminA);
        System.out.println("x in intersection of A and B:" + interAB);
        System.out.println("x in union of A and B: " + unionAB);
        System.out.println("x in symm. diff. of A and B: " + symAB);
    }
}
