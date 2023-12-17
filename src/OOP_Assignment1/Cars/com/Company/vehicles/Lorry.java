package OOP_Assignment1.Cars.com.Company.vehicles;

import OOP_Assignment1.Cars.com.Company.details.Engine;
import OOP_Assignment1.Cars.com.Company.professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine motor, int carrying) {
        super(carBrand, carClass, weight, driver, motor);
        this.carrying = carrying;
    }
}
