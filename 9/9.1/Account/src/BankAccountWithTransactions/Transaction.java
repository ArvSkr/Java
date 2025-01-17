package BankAccountWithTransactions;

import java.util.Date;

public class Transaction extends Account{

        private Date transactionDate;

        public Transaction(int id, String name , double balance, double interestRate, Date dateCreated) {
            super(id, name , balance, interestRate, dateCreated);
            this.transactionDate = new Date();
        }


        public void recordTransaction(String type, double amount) {
            if (type.equalsIgnoreCase("deposit")) {
                deposit(amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                withdraw(amount);
            }
        }


        public void displayTransactionDetails() {
            System.out.println("Transaction Date: " + transactionDate);
            System.out.println(super.toString());
        }
    }


