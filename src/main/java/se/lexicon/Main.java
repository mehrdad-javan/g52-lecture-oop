package se.lexicon;

import se.lexicon.model.BankAccount;
import se.lexicon.model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Test", "Test@test.se", "123456789");
        BankAccount account1 = new BankAccount(customer1, 20);
        System.out.println(account1.getAccountInfo());

    }
}