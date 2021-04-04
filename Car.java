package com.company;

public class Car {

    int maxSpeed=100;
    int minSpeed=0;
    double weight=4079;
    boolean isTheCarOn=false;
    char condition='A';
    String nameOfCar="Lucy";

    public void printVariables(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Min Speed: "+minSpeed);
        System.out.println("weight: "+weight);
        System.out.println("IsTheCarOn: "+isTheCarOn);
        System.out.println("condition: "+condition);
        System.out.println("Name of Car: "+nameOfCar);
    }

    public void wreckCar(){
        condition='C';
    }

    public static void main(String[] args) {
        Car familyCar=new Car();
        familyCar.printVariables();
        familyCar.wreckCar();
        System.out.println("---CONDITION CHANGED---");
        familyCar.printVariables();
    }
}
