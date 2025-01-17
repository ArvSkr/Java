package BankAccountWithTransactions;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private String name;
    private ArrayList<String> transactions; // Store transaction types (Withdraw/Deposit)
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Constructor
    public Account(int id, String name, double balance, double interestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = interestRate;
        this.dateCreated = dateCreated;
        this.transactions = new ArrayList<>();
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }


    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 100);
    }


    public void withdraw(double amount) {
        if (balance > 0) {
            balance -= amount;
            transactions.add("W");
            transactions.add("Withdrawn: $" + amount);
            transactions.add(String.valueOf(balance));
            transactions.add("Transaction successful");

        }

    }


    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            transactions.add("D");
            transactions.add("Deposited: $" + amount);
            transactions.add(String.valueOf(balance));
            transactions.add("Transaction successful");
        }

    }


    @Override
    public String toString() {
        return "Account name: " + name + "\nBalance: $" + balance + "\nMonthly Interest Rate: $" + getMonthlyInterestRate() +
                 "\nTransactions: " + transactions;
    }
}