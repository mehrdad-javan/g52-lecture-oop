package se.lexicon;

public interface IOrderItem {

    int MAX_ITEMS = 10;

    void addItem(Product product);
    void removeItem(Product product);
    void printItems();
    Product[] getItems();
    double calculateTotalCost();
    double calculateTotalCostWithTax();

}
