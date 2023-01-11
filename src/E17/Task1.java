package E17;

public class Task1 {
    public static String stringSwap(String s){
        int len = s.length();
        String front, back;

        if (len%2==0){ //even length
            front = s.substring(len/2,len); //new front
            back = s.substring(0,len/2); // new back
            return front + back;
        } else { //odd length
            front = s.substring(len/2+1,len);
            back = s.substring(0,len/2);
            return front + s.substring(len/2, len/2+1) + back;
        }
    }

    public static void main(String[] args){
        String str1 = "abcd";
        System.out.println("Pre-swap -> " + str1);
        System.out.println("After swap -> " + stringSwap(str1));

        String str2 = "abcde";
        System.out.println("Pre-swap -> " + str2);
        System.out.println("After swap -> " + stringSwap(str2));
    }
}
