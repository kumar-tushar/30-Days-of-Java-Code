package Solutions.Day_21;

public class Solution {
    public static <E> void printArray(E[] array){
        for(E element: array)
            System.out.println(element);
    }


    public static void main(String[] args) {
        printArray(new Object[]{3, 1, 2, 3, 2, "Hello", "World"});

    }
}
