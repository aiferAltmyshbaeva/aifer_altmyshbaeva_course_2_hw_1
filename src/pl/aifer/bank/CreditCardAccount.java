package pl.aifer.bank;

import java.math.BigDecimal;

public final class CreditCardAccount extends CardAccount {
    public CreditCardAccount(Client client, String accountNumber, double balance, CardType cardType) {
        super(client, accountNumber, balance, cardType);
    }

    @Override
    public Transaction makePayment(double amount, String merchantName, String transactionDescription) {
        Transaction transaction = super.makePayment(amount, merchantName);
        transaction.setTransactionDescription("Credit card: " + transactionDescription);
        return transaction;
    }

    @Override
    public String getInfo() {
        return "CreditCardAccount{" +
                "cardType=" + getCardType() +
                ", client=" + getClient() +
                ", accountNumber='" + getAccountNumber() +
                ", balance=" + getBalance() +
                '}';
    }
}
