package com.company;

import java.util.Scanner;

public class Day_1_Data_Types {

    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "This ";

        Scanner scan = new Scanner(System.in);

        int a;
        double b;
        String c;

        a=scan.nextInt();
        b=scan.nextDouble();
        scan.nextLine();
        c=scan.nextLine();

        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);

        scan.close();
    }
}
