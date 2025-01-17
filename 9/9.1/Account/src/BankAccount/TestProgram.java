package BankAccount;

import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {

        Account account = new Account(1122, 20000, 20, new Date());
        CheckingAccount checkingAccount = new CheckingAccount(1122, 5000000.465, 40, new Date());
        checkingAccount.checkIfYouCanWithdraw(400000, 4);
        SavingsAccount savings = new SavingsAccount(1122, 5000000.465, 40, new Date());
        savings.checkifyoucandeposit(400000);
        System.out.println(checkingAccount);

    }
}
