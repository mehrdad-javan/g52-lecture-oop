package se.lexicon.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTest {


    @Test
    @DisplayName("Create account with valid initial deposit")
    public void createAccountValidDeposit() {
        Customer customer = new Customer("Mehrdad Javan", "mehrdad.javan@lexicon.se", "1234567890");
        BankAccount account = new BankAccount(customer, 10.00);
        Assertions.assertEquals(10.00, account.getBalance());
    }

    @Test
    @DisplayName("Fail to create account with invalid initial deposit")
    public void createAccountWithLowDeposit() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Customer customer = new Customer("Mehrdad Javan", "mehrdad.javan@lexicon.se", "1234567890");
            BankAccount account = new BankAccount(customer, 5.00);
        });
    }
}
