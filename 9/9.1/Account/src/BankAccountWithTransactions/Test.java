package BankAccountWithTransactions;

import java.util.Date;

public class Test {
     public static void main(String[] args) {
        Transaction transaction = new Transaction(1122, "George", 1000, 1.5, new Date());
        transaction.recordTransaction("deposit", 30);
         transaction.recordTransaction("deposit", 40);
         transaction.recordTransaction("deposit", 50);
         transaction.recordTransaction("withdraw", 5);
         transaction.recordTransaction("withdraw", 4);
         transaction.recordTransaction("withdraw", 2);

         transaction.displayTransactionDetails();
    }
}
