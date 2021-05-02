package video_series_code.Day_7;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
       int[] intArray1;
       int[] intArray2=new int[4];
       int[] intArray3={5, 2, 9, 1, 3};

       String[] shoppingList={"bananas", "apples", "pears"};

       intArray2[0]=10;
       intArray2[1]=8;
       intArray2[2]=5;
       intArray2[3]=10;

      System.out.println(Arrays.toString(intArray2));
      System.out.println(Arrays.toString(intArray3));

      System.out.println(" ");

       for ( int i:intArray3){
           System.out.println(i);
       }

       System.out.println(" ");

        for ( String s:shoppingList){
            System.out.print(s);
        }

    }
}
