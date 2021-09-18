package Solutions.Day_20;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0; i<a.length; i++){
            a[i]=scan.nextInt();
        }

        int numberOfSwaps = 0;
        int temp;

        for(int i=0; i<n; i++){
            for (int j = 0; j < n-1; j++) {
                if (a[j] > a[j + 1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberOfSwaps++;
                }
            }

        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+(a[n-1]));

        scan.close();

    }
}
