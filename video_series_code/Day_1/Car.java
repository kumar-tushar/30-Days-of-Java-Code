package video_series_code.Day_1;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";


    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
        familyCar.wreckCar();
        familyCar.printVariables();
    }
}
