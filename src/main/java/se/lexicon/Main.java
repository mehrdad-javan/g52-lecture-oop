package se.lexicon;

public class Main {
    public static void main(String[] args) {
        // Product product = new Product("Cheeseburger", 12.99);

        OrderItem order1 = new OrderItem();

        Burger cheeseBurger = new Burger("Cheeseburger", 12.99, "Beef", true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "Chicken", false);
        Fries smallFries = new Fries(Size.SMALL, true);


        order1.addItem(cheeseBurger);
        order1.addItem(chickenBurger);
        order1.addItem(smallFries);

        order1.printItems();
    }
}