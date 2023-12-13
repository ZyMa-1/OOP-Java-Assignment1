package Animals;

public class Dog extends Animal {
    public int loyalty;

    public Dog(int food, String location, int loyalty) {
        super(food, location);
        this.loyalty = loyalty;
    }

    public void makeNoise() {
        System.out.println("Such an animal barks");
    }
    public void eat() {
        String formattedOutput = String.format("%d meet available", food);
        if (food > 0) {
            formattedOutput += "\nEating food";
        }
        else {
            formattedOutput += "\nCannot eat food";
        }
        System.out.println(formattedOutput);
    }
}
