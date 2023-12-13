package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine motor, int carrying) {
        super(carBrand, carClass, weight, driver, motor);
        this.carrying = carrying;
    }
}
