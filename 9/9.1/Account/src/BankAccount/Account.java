package BankAccount;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance, double interestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = interestRate;
        this.dateCreated = dateCreated;
    }

    public int createAccountID(int newid) {
        return id;
    }

    public double createAccountBalance(double newbalance) {
        return balance;
    }

    public String date(Date dateCreated) {
        return dateCreated.toString();
    }

    public void updateAccount(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        double rate = (annualInterestRate / 100) / 12;
        return rate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 100);
    }

    public void withdraw(double withdraw) {

        balance -= withdraw;


    }

    public void deposit(double deposit) {

        balance += deposit;


    }


    @Override
    public String toString() {
        return "Account created " + " Balance: $" + balance + " Monthly Interest : " + getMonthlyInterest() + " Date: " + dateCreated;
    }
}
