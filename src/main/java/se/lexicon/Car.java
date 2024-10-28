package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public class Car {
    // ## Fields
    private String regNumber;
    private String brand;
    private String model;
    private int year;
    private String color;

    private Person owner;
    // and more fields as needed

    // ## Constructors
    /*public Car(){
        this.regNumber = null;
        this.brand = null;
        this.year = 0;
        this.model = null;
        this.color = null;
    }*/

    // Why Constructors: Constructors are used to set up initial values for objects' fields,
    // ensuring that objects start (create) with meaningful data rather than relying on default values.
    public Car(String brand, String model, int year) {
        this.generateRegNumber();
        this.setBrand(brand);
        this.setModel(model);
        this.year = year;
    }

    public Car(String brand, String model) {
        this(brand, model, LocalDate.now().getYear());
    }


    // ## Methods
    // Getters and Setters are used to access and modify the private fields of a class
    // they are part of the principles of Encapsulation in OOP.
    private void generateRegNumber() {
        this.regNumber = UUID.randomUUID().toString();
    }

    public void setBrand(String brand) {
        if (brand == null) throw new IllegalArgumentException("Brand should not be null or empty.");
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null) throw new IllegalArgumentException("Model should not be null or empty.");
        this.model = model;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getRegNumber() {
        return this.regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCarInfo() {
        //return "Car Info > " + "#: " + regNumber + ", Brand: " + brand + ", Model: " + model;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car Info: ");
        stringBuilder.append("Reg Number: ");
        stringBuilder.append(regNumber);
        stringBuilder.append(" , Brand: ");
        stringBuilder.append(brand);
        if (owner != null) {
            stringBuilder.append(" , Owner Name: ");
            stringBuilder.append(owner.getName());
        } else {
            stringBuilder.append(" , No Owner assigned. ");

        }

        return stringBuilder.toString();
    }
}
