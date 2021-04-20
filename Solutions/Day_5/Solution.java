package Solutions.Day_5;

import java.util.Scanner;

public class Solution {

    public static void intTable(int n){
        for(int i=1; i<11; i++){
            int result=n*i;
            System.out.println(n + " x "+ i + " = "+ result);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        intTable(n);
    }
}
