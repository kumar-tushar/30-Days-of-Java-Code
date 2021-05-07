package Solutions.Day_11;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);


        int row = 6;
        int col = 6;
        int[][] myArray = new int[row][col];


        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                int count=scan.nextInt();
                myArray[i][j] = count;
            }
        }




        int max_sum =-81;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int sum = (myArray[i][j] + myArray[i][j + 1] + myArray[i][j + 2]) + (myArray[i + 1][j + 1]) + (myArray[i + 2][j] + myArray[i + 2][j + 1] + myArray[i + 2][j + 2]);
                if(max_sum<sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println(max_sum);


    }
}
