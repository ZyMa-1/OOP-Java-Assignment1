package OOP_Assignment1.Animals;

import OOP_Assignment1.Person.Person;

public class Veterinary extends Person {
    public Veterinary(String fullName, int age) {
        super(fullName, age);
    }

    public void treatAnimal(Animal animal) {
        String formattedOutput = String.format("Treating animal with %d food and %s location",
                animal.food, animal.location);
        System.out.println(formattedOutput);
    }
}
