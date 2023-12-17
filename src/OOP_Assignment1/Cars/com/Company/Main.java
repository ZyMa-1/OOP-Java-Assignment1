package OOP_Assignment1.Cars.com.Company;

import OOP_Assignment1.Cars.com.Company.details.Engine;
import OOP_Assignment1.Cars.com.Company.professions.Driver;
import OOP_Assignment1.Cars.com.Company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Ford", 30);
        Driver driver = new Driver("Michael Schumacher", 54, 44);
        Car car = new Car("idk1", "idk2", 2000, driver, engine);
        System.out.println(car);
    }
}
