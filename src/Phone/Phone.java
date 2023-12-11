package Phone;

import java.io.Serializable;

public class Phone implements Serializable {
    private String number, model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = -1;
    }

    public Phone() {
        this.number = "Not specified";
        this.model = "Not specified";
        this.weight = -1;
    }

    public void receiveCall(String callerName) {
        String formattedOutput = String.format("%s is ringing", callerName);
        System.out.println(formattedOutput);
    }

    public void receiveCall(String callerName, String callerPhoneNumber) {
        String formattedOutput = String.format("%s is ringing (%s number)", callerName, callerPhoneNumber);
        System.out.println(formattedOutput);
    }

    public void sendMessage(String... phoneNumbers) {
        String formattedOutput = String.format("Sending messages to the %d phones", phoneNumbers.length);
        System.out.println(formattedOutput);
    }

    // Getters & Setters

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}