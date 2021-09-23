package video_series_code.Day_21;

import java.util.LinkedList;

public class Queuey <D> {

    LinkedList<D> queue;

    public Queuey(){
        queue=new LinkedList<>();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(D n){
        queue.addLast(n);
    }

    public D dequeue(){
        return queue.remove(0);
    }

    public D peek(){
        return queue.get(0);
    }

    public static void main(String[] args) {
        Queuey<Object> queue=new Queuey<>();
        queue.enqueue(5);
        queue.enqueue("Ram");
        queue.enqueue(6);
        System.out.println("First out: "+ queue.dequeue());
        System.out.println("Second out: "+ queue.dequeue());
        System.out.println("Third out: "+ queue.dequeue());

    }
}