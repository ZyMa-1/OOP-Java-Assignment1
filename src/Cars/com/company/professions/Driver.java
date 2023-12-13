package Cars.com.company.professions;

import Person.Person;

public class Driver extends Person {
    public int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }
}
