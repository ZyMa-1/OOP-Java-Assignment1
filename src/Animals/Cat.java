package Animals;

public class Cat extends Animal {
    public int livesLeft;

    public Cat(int food, String location, int livesLeft) {
        super(food, location);
        this.livesLeft = livesLeft;
    }

    public void makeNoise() {
        System.out.println("Such an animal is meowing");
    }
    public void eat() {
        String formattedOutput = String.format("%d sausages available", food);
        if (food > 0) {
            formattedOutput += "\nEating food";
        }
        else {
            formattedOutput += "\nCannot eat food";
        }
        System.out.println(formattedOutput);
    }
}
