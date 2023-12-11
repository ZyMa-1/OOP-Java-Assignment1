package Person;

public class MainPerson {
    public static void main(String[] args) {
        // Creating Persons
        Person person1 = new Person("Mikhail", 19);
        Person person2 = new Person();

        // Printing variables of each person
        System.out.println("person1: " + "\n" +
                "Full name - " + person1.fullName + "\n" +
                "Age -       " + person1.age + "\n");
        System.out.println("person2: " + "\n" +
                "Full name - " + person2.fullName + "\n" +
                "Age -       " + person2.age + "\n");

        // Testing move and talk methods
        person1.move();
        person2.talk();
    }
}
