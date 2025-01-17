package BankAccount;

import java.util.Date;

public class SavingsAccount extends CheckingAccount{
    public SavingsAccount(int id, double balance, double interestRate, Date dateCreated) {
        super(id, balance, interestRate, dateCreated);

    }
    public void checkifyoucandeposit(double deposit) {

        if (deposit > 0) {
            deposit(deposit);
        }
    }
    public double InterestRate() {

        return getMonthlyInterestRate();
    }

    public double MonthlyInterest() {
        return getMonthlyInterest();
    }


}
