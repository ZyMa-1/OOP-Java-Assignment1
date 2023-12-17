package OOP_Assignment1.Cars.com.Company.professions;

import OOP_Assignment1.Person.Person;

public class Driver extends Person {
    public int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }
}
