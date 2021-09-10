package video_series_code.Day_18;

import java.util.Stack;

public class Stacky {
    public static void main(String[] args) {
        Stack<String> stacky=new Stack<>();
        stacky.push("there");
        stacky.push("Hi");
        System.out.print(stacky.pop()+" ");
        System.out.print(stacky.pop()+"!");
    }
}
