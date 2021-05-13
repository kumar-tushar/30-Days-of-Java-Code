package Solutions.Day_16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        String s=scan.nextLine();
        try{
            int c=Integer.parseInt(s);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }


    }

}
