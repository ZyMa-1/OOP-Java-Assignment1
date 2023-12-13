package Cars.com.company;

import Cars.com.company.details.*;
import Cars.com.company.professions.*;
import Cars.com.company.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Ford", 30);
        Driver driver = new Driver("Michael Schumacher", 54, 44);
        Car car = new Car("idk1", "idk2", 2000, driver, engine);
        System.out.println(car);
    }
}
