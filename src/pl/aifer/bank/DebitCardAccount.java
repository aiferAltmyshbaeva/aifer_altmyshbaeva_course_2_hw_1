package pl.aifer.bank;

public final class DebitCardAccount extends CardAccount{
    public DebitCardAccount(Client client, String accountNumber, double balance, CardType cardType) {
        super(client, accountNumber, balance, cardType);
    }

    @Override
    public Transaction makePayment(double amount, String merchantName, String transactionDescription) {
        Transaction transaction = super.makePayment(amount, merchantName);
        transaction.setTransactionDescription("Debit card: " + transactionDescription);
        return transaction;
    }

    @Override
    public String getInfo() {
        return "DebitCardAccount{" +
                "cardType=" + getCardType() +
                ", client=" + getClient() +
                ", accountNumber='" + getAccountNumber() +
                ", balance=" + getBalance() +
                '}';
    }
}
