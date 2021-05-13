package video_series_code.Day_15;

import java.util.LinkedList;

public class LinkedListUS {

    Node head;
    int count;

    public LinkedListUS() {
        head = null;
        count = 0;
    }

    public LinkedListUS(int data) {
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

    public boolean isEmpty(){
        return head==null;
    }

    public void remove(){
        Node current=head;
        while(current.getNext().getNext()!=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args){
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alexa");
        System.out.println(linkedList);

    }
}