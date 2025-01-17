package BankAccount;

import java.util.Date;

public class CheckingAccount extends Account {
    public CheckingAccount(int id, double balance, double interestRate, Date dateCreated) {
        super(id, balance, interestRate, dateCreated);
    }


    public void checkIfYouCanWithdraw(double withdraw, int limit) {
        int uses = 0;

        while (true) {
            if (withdraw > 0 && uses != limit) {
                withdraw(withdraw);
                uses++;
            } else {
                break;
            }
        }
    }

    public void checkifyoucandeposit(double deposit) {

        if (deposit > 0) {
            deposit(deposit);
        }
    }
}
