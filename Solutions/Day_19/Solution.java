package Solutions.Day_19;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args){

        Calculator calc=new Calculator();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(calc.divisorSum(n));

    }
}
