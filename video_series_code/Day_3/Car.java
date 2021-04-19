package video_series_code.Day_3;

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
    int maxNumberOfPeopleInCar=6;

    public Car(){

    }

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
        if(numberOfPeopleInCar<maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }
        else{
            System.out.println("The car is full! "+numberOfPeopleInCar + "="+maxNumberOfPeopleInCar);
        }
    }

    public void getOut(){
        if(numberOfPeopleInCar>0){
            numberOfPeopleInCar--;
        }
        else{
            System.out.println("No one is in the Car"+ numberOfPeopleInCar);
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel*mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel*mpg;
    }

    public void turnTheCarOn(){
        if(!isTheCarOn){
            isTheCarOn=true;
        }else{
            System.out.println("The car is already on " + true);
        }
    }

    public static void main(String[] args) {
        Car tommyCar=new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

    }
}
