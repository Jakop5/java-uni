package E17;

public class SortSLL {
    private Node head;

    public void addSorted(int num){

    }

    public void show(){
        System.out.print("[ ");
        Node tmp = head;
        while(tmp.data != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.print("]");
    }

    public static void main(String[] args){

    }
}
