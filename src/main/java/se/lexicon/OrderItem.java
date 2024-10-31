package se.lexicon;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class OrderItem implements IOrderItem {
    private String id;
    private LocalDateTime orderDateTime;
    private Product[] items;
    // add more fields as needed. :)


    public OrderItem() {
        items = new Product[0];
        id = UUID.randomUUID().toString();
        orderDateTime = LocalDateTime.now();
    }

    @Override
    public void addItem(Product product) {
        if (product == null) throw new IllegalArgumentException("Item cannot be null.");

        Product[] newItems = new Product[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[newItems.length - 1] = product;
        items = newItems;
    }

    @Override
    public void removeItem(Product product) {
        // todo: needs completion.

    }

    @Override
    public void printItems() {

        System.out.println("Order ID: " + id);
        System.out.println("Date/Time: " + orderDateTime);

        for (Product product : items) {
            System.out.println("  " + product.getDescription());
        }
        System.out.println("Total Order Cost: " + calculateTotalCost());

    }

    @Override
    public Product[] getItems() {
        // todo: needs completion.
        return Arrays.copyOf(items, items.length);
    }

    @Override
    public double calculateTotalCost() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String totalCost = decimalFormat.format(total);

        return Double.parseDouble(totalCost);
    }

    @Override
    public double calculateTotalCostWithTax() {
        // todo: needs completion.
        return 0;
    }


}
