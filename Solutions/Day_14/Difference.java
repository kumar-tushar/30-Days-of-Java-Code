package Solutions.Day_14;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] myArray){
        elements=myArray;
    }

    public void computeDifference(){
        int maxDifference=0;
        int consecutiveDifference;
        for (int i = 0; i < elements.length-1; i++) {
            for(int j=0; j<elements.length-1;j++) {
                consecutiveDifference = Math.abs(elements[i] - elements[j + 1]);
                if (consecutiveDifference > maxDifference) {
                    maxDifference = consecutiveDifference;
                }
            }
            maximumDifference=maxDifference;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }

}