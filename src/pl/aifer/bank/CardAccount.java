package pl.aifer.bank;

public class CardAccount extends Account {
    private CardType cardType;

    public CardAccount(Client client, String accountNumber, double balance, CardType cardType) {
        super(client, accountNumber, balance);
        this.cardType = cardType;
    }

    public CardType getCardType() {
        return cardType;
    }

    public final Transaction makePayment(double amount, String merchantName) {
        if (amount <= getBalance()) {
            updateBalance(-amount);
            return new Transaction(getClient(), amount, merchantName, "default transaction");
        } else {
            throw new RuntimeException("Insufficient balance");
        }
    }

    public Transaction makePayment(double amount, String merchantName, String transactionDescription) {
        Transaction transaction = makePayment(amount, merchantName);
        transaction.setTransactionDescription(transactionDescription);
        return transaction;
    }

    @Override
    public String getInfo() {
        return "CardAccount{" +
                "cardType=" + cardType +
                ", client=" + getClient() +
                ", accountNumber='" + getAccountNumber() +
                ", balance=" + getBalance() +
                '}';
    }
}
