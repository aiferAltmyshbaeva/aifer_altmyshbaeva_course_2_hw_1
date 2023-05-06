import pl.aifer.bank.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client azamat = new Client("Mambetov Azamat", 40);
        Client indira = new Client("Mamytova Indira", 37);
        CardAccount azamatAccount = new CardAccount(azamat, "KG312", 8888.88, CardType.VISA);
        CreditCardAccount azamatCreditCard = new CreditCardAccount(azamat, "KG123", 3000.00, CardType.VISA);
        DebitCardAccount indiraDebitCard = new DebitCardAccount(indira, "KGZ312", 15000, CardType.MASTERCARD);

        System.out.println("azamatAccount = " + azamatAccount.getInfo());
        System.out.println("azamatCreditCard = " + azamatCreditCard.getInfo());
        System.out.println("indiraDebitCard = " + indiraDebitCard.getInfo());

        ArrayList<Transaction> transactions = new ArrayList<>();

        transactions.add(azamatAccount.makePayment(1111.11, "Adibas"));
        transactions.add(azamatCreditCard.makePayment(1500, "NoName", "Birthday party"));
        transactions.add(indiraDebitCard.makePayment(5000, "Дс Ромашка", "Питание май 2023, Мамытов Байэл"));

        System.out.println();
        for (Transaction transaction : transactions) {
            System.out.println("transaction = " + transaction);
        }

        System.out.println();
        System.out.println("azamatAccount = " + azamatAccount.getInfo());
        System.out.println("azamatCreditCard = " + azamatCreditCard.getInfo());
        System.out.println("indiraDebitCard = " + indiraDebitCard.getInfo());
    }
}