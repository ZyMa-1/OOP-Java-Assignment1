package Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(4, "home", 4),
                new Cat(5, "backyard", 7),
                new Horse(6, "field", 10)};
        Veterinary vet = new Veterinary("John",  35);
        for(Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
