package se.lexicon;

public enum Size {

    LARGE("L", 20), MEDIUM("M", 15), SMALL("S", 10);


    private String name;
    private double price;

    Size(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
