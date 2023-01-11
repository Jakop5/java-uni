package E12;

public class Task2 {
    static int[] add(int[] a, int elem){
        int[] new_a = new int[a.length+1];


        return new_a;
    }

    static int[] delIndex(int[] a, int ind){ //done
        int[] new_a = new int[a.length-1];
        System.arraycopy(a, 0, new_a, 0, ind);
        System.arraycopy(a, ind+1, new_a, ind, a.length-ind-1);

        return new_a;
    }

    static int[] delFirst(int[] a, int e){ //done
        int[] new_a = new int[a.length-1];
        for (int i=0;i!=a.length;i++){
            if(a[i]==e){
                int e_ind = i;
                System.arraycopy(a, 0, new_a, 0, e_ind);
                System.arraycopy(a, e_ind+1, new_a, e_ind, a.length-e_ind-1);
                break;
            }
        }
        return new_a;
    }

    static int[] delLast(int[] a, int e){
        int[] new_a = new int[a.length-1];
        for (int i=0;i!=a.length;i++){
            if(a[i]==e){
                int e_ind = i;
                System.arraycopy(a, 0, new_a, 0, e_ind);
                System.arraycopy(a, e_ind+1, new_a, e_ind, a.length-e_ind-1);
            }
        }
        return new_a;
    }

    static int[] delAll(int[] a, int e){
        int sum_e = 0;
        int[] new_a = new int[a.length-sum_e];
        for (int i=0;i!=a.length;i++){
            if(a[i]==e){
                int e_ind = i;
                System.arraycopy(a, 0, new_a, 0, e_ind);
                System.arraycopy(a, e_ind+1, new_a, e_ind, a.length-e_ind-1);
            }
        }
        return new_a;
    }


    static void info(int[] a){
        System.out.print("Length " + a.length + ": ");

        System.out.print("[ ");
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,3,5};
        info(a);
        a = delAll(a, 3);
        info(a);

    }
}
/*
System.arraycopy(sArr, sIndex, tArr, tIndex, count)
*/