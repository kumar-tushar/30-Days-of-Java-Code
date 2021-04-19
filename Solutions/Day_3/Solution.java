package Solutions.Day_3;

import java.util.Scanner;

public class Solution {

    public void numCheck(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N%2==1){
            System.out.println("Weird");
        }
        else if(N%2==0 && N>=6 && N<=20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }

    public static void main(String[] args) {
        Solution s1=new Solution();
        s1.numCheck();
    }
}
