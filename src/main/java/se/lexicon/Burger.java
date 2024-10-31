package se.lexicon;

public final class Burger extends Product {

    private String type;
    private boolean hasCheese;


    public Burger(String name, double price, String type, boolean hasCheese) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Type: " + type;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", hasCheese=" + hasCheese +
                '}';
    }


}
