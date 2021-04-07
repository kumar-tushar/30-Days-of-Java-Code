package com.company;

public class Car {

    int maxSpeed;
    int minSpeed=0;

    double weight;
    
    boolean isTheCarOn;
    char condition='A';
    String nameOfCar="Lucy";

    double maxFuel=16;
    double currentFuel=8;
    double mpg=26.4;

    int numberOfPeopleInCar=1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed=customMaxSpeed;
        weight=customWeight;
        isTheCarOn=customIsTheCarOn;
    }

    public void printVariables(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Min Speed: "+minSpeed);
        System.out.println("weight: "+weight);
        System.out.println("IsTheCarOn: "+isTheCarOn);
        System.out.println("condition: "+condition);
        System.out.println("Name of Car: "+nameOfCar);
        System.out.println("Number of People in Car: "+numberOfPeopleInCar);
    }

    public void getIn(){
        numberOfPeopleInCar++;
    }

    public void getOut(){
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel*mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel*mpg;
    }

    public static void main(String[] args) {
        Car birthdayPresent=new Car(500, 5000.545, true);

        System.out.println("---BIRTHDAY CAR V1---");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: "+birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " +birthdayPresent.maxMilesPerFillUp());
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("---BIRTHDAY CAR V2---");
        birthdayPresent.printVariables();
    }
}