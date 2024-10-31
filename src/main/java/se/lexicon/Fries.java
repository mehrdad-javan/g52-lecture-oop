package se.lexicon;

public final class Fries extends Product {
    private Size size;
    private boolean isSpicy;

    public Fries(Size size, boolean isSpicy) { // Size.LARGE
        super(size.getName(), size.getPrice());
        this.size = size;
        this.isSpicy = isSpicy;
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * 0.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Size: " + size.getName();
    }

    @Override
    public String toString() {
        return "Fries{" +
                "size=" + size +
                ", isSpicy=" + isSpicy +
                '}';
    }
}
