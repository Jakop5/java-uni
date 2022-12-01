package E11;

public class FuncStat { // run from the E11/Task3 file
    public static int fiboR(int n){
        if (n<2 && n>=0){
            return n;
        }
        return fiboR(n-1) + fiboR(n-2);
    }
    public static int fiboI(int n){
        while (!(n<2)&&!(n>=0)){
            n = n-1 + n-2;
        }
        return n;
    }
}
