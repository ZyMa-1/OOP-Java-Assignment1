package OOP_Assignment1.Animals;

public class Horse extends Animal {
    public int speed;

    public Horse(int food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    public void makeNoise() {
        System.out.println("Such an animal snorts");
    }
    public void eat() {
        String formattedOutput = String.format("%d sugar available", food);
        if (food > 0) {
            formattedOutput += "\nEating food";
        }
        else {
            formattedOutput += "\nCannot eat food";
        }
        System.out.println(formattedOutput);
    }
}
