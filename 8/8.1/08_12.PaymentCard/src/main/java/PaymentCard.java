public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public void eatAffordably() {
        if ((balance - 2.60) >= 0) {
            balance -= 2.60;
        }

    }

    public void eatHeartily() {
        if ((balance - 4.60) >= 0) {
            balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0 && (balance + amount) <= 150) {
            balance += amount;
        } else if ((balance + amount) >= 150) {
            balance = 150.0;
        }

    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

}
