package se.lexicon.model;

import se.lexicon.util.AccountNumberSequencer;
import se.lexicon.util.BankAccountConstant;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private Customer customer;

    public BankAccount(Customer customer, double initialDeposit) {
        if (initialDeposit < BankAccountConstant.MINIMUM_INITIAL_DEPOSIT){
            throw new IllegalArgumentException("Initial deposit must be at least " + BankAccountConstant.MINIMUM_INITIAL_DEPOSIT);
        }
        this.deposit(initialDeposit);
        this.accountNumber = AccountNumberSequencer.nextId();
        this.customer = customer;
    }


    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount for deposit.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount for withdrawal.");
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient found for withdrawal.");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getAccountInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account Number: ").append(accountNumber);
        sb.append(" , Balance: ").append(balance);
        sb.append(" , Customer: ").append(customer.getCustomerInfo());
        return sb.toString();
    }

}
