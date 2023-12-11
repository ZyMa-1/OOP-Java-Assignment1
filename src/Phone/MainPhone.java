package Phone;

public class MainPhone {
    public static void main(String[] args) {
        // Creating Phones
        Phone phone1 = new Phone("123-4567", "nokia", 69.96);
        Phone phone2 = new Phone("987-6543", "iphone", 13);
        Phone phone3 = new Phone("876-5432", "samsong", 16);

        // Printing variables of each phone
        System.out.println("phone1: " + "\n" +
                "Number - " + phone1.getNumber() + "\n" +
                "Model -  " + phone1.getModel() + "\n" +
                "Weight - " + phone1.getWeight() + "\n");
        System.out.println("phone2: " + "\n" +
                "Number - " + phone2.getNumber() + "\n" +
                "Model -  " + phone2.getModel() + "\n" +
                "Weight - " + phone2.getWeight() + "\n");
        System.out.println("phone3: " + "\n" +
                "Number - " + phone3.getNumber() + "\n" +
                "Model -  " + phone3.getModel() + "\n" +
                "Weight - " + phone3.getWeight() + "\n");

        // Receiving calls
        phone1.receiveCall("The US Government");
        phone2.receiveCall("The UK Government");
        phone3.receiveCall("The JP Government");

        // Calling getNumber method
        System.out.println("phone1 number: " + phone1.getNumber());
        System.out.println("phone2 number: " + phone2.getNumber());
        System.out.println("phone3 number: " + phone3.getNumber());

        // Testing receiveCall and sendMessage methods
        phone1.receiveCall("The US Government", "321-3215");
        phone1.sendMessage("8-800", "555-35-35");
    }
}