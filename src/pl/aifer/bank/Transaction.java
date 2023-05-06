package pl.aifer.bank;

public class Transaction {
    private Client client;
    private double amount;
    private String merchant;
    private String transactionDescription;

    public Transaction(Client client, double amount, String merchant, String transactionDescription) {
        this.client = client;
        this.amount = amount;
        this.merchant = merchant;
        this.transactionDescription = transactionDescription;
    }

    public Client getClient() {
        return client;
    }

    public double getAmount() {
        return amount;
    }

    public String getMerchant() {
        return merchant;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "client=" + client +
                ", amount=" + amount +
                ", merchant='" + merchant + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                '}';
    }
}
