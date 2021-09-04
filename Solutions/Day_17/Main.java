package Solutions.Day_17;

import java.util.Scanner;

class Calculator {
    int power(int n, int p) throws Exception {
        if (n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int) Math.pow(n, p);
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T>0) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            Calculator calc = new Calculator();
            try {
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            T--;
        }
        scan.close();

    }
}

