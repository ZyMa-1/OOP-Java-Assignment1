package OOP_Assignment1.Cars.com.Company.vehicles;

import OOP_Assignment1.Cars.com.Company.details.Engine;
import OOP_Assignment1.Cars.com.Company.professions.Driver;

public class SportCar extends Car {
    public int speed;

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine motor, int speed) {
        super(carBrand, carClass, weight, driver, motor);
        this.speed = speed;
    }
}
