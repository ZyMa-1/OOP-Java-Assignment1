package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Driver;

public class Car {
    public String carBrand, carClass;
    int weight;
    public Driver driver;
    public Engine motor;
    public Car(String carBrand, String carClass, int weight, Driver driver, Engine motor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }
    public void start() {
        System.out.println("Let's go");
    }
    public void stop() {
        System.out.println("Let's stop");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    public String toString() {
        return String.format(
                "Car:%n" +
                "%s - car brand%n" +
                "%s - car class%n" +
                "%s - car weight%n" +
                "%s - driver name%n" +
                "%s - motor manufacturer",
                carBrand,
                carClass,
                weight,
                driver.fullName,
                motor.company);
    }
}
