package pl.aifer.bank;

import java.math.BigDecimal;

public abstract class Account {
    private Client client;
    private String accountNumber;
    private double balance;

    public Account(Client client, String accountNumber, double balance) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void updateBalance(double amount) {
        balance += amount;
    }

    public String getInfo() {
        return "Account{" +
                "client=" + client +
                ", accountNumber='" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
