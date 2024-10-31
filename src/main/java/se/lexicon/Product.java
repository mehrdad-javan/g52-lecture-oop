package se.lexicon;

public abstract class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateTax();

    public String getDescription() {
        return "Item: " + name + ", Price: " + price;
    }

}
