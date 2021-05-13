package video_series_code.Day_15;

public class Node {
    Node next;
    int data;

    public Node(int newData){
        data=newData;
    }

    public Node(int newData, Node newNext){
        data=newData;
        next=newNext;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(int newData){
        data=newData;
    }

    public void setNext(Node newNode){
        next=newNode;
    }




}
