package Animals;

public class Animal {
    public int food;
    public String location;
    public Animal(int food, String location) {
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Such an animal is making some NoIsE");
    }
    public void eat() {
        String formattedOutput = String.format("%d food available", food);
        if (food > 0) {
            formattedOutput += "\nEating food";
        }
        else {
            formattedOutput += "\nCannot eat food";
        }
        System.out.println(formattedOutput);
    }
    public void sleep() {
        System.out.println("Such an animal is sleeping");
    }
}
