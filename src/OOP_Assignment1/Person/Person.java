package OOP_Assignment1.Person;

public class Person {
    public String fullName;
    public int age;

    public Person() {
        this.fullName = "Not specified";
        this.age = -1;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        String formattedOutput = String.format("OOP_Assignment1.Person %s is moving", fullName);
        System.out.println(formattedOutput);
    }

    public void talk() {
        String formattedOutput = String.format("OOP_Assignment1.Person %s is talking", fullName);
        System.out.println(formattedOutput);
    }
}
