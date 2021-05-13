package video_series_code.Day_15;

public class LinkedList {

    Node head;
    int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    public LinkedList(int data) {
        head = new Node(data);
        count = 1;
    }

    public void add(int newData){
        Node temp=new Node(newData);
        Node current=head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public int get(int index){
        if(index<=0){
            return -1;
        }
        Node current=head;
        for (int i=1; i<index; i++){
            current=current.getNext();
        }
        return current.getData();
    }

    public int size(){
        return count;
    }

    public bool






    public static void main(String[] args){

    }
}
