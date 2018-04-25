package com.company;

public class Main {

    int maxSpeed = 100;
    int minSpeed = 0;
    double carWeight = 4079;
    boolean isTheCarOn = false;
    char carCondition = 'A';
    String nameOfCar = "Lucy";

    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(carWeight);
        System.out.println(isTheCarOn);
        System.out.println(carCondition);
        System.out.println(nameOfCar);
    }

    public void wreckCar() {
        carCondition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;

    }

    public static void main(String[] args) {
	// write your code here
        Main myCar = new Main();
        myCar.printVariables();
        Main aliceCar = myCar;
        myCar.wreckCar();
        aliceCar.printVariables();
        myCar.upgradeMinSpeed();
        myCar.printVariables();



    }
}
