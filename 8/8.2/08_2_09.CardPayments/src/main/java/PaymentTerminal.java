public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;


    public PaymentTerminal() {
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }


    public double eatAffordably(double payment) {
        double mealCost = 2.5;
        if (payment >= mealCost) {
            money += mealCost;
            affordableMeals++;
            return payment - mealCost;
        }
        return payment;
    }


    public double eatHearty(double payment) {
        double mealCost = 4.3;
        if (payment >= mealCost) {
            money += mealCost;
            heartyMeals++;
            return payment - mealCost;
        }
        return payment;
    }


    public void addMoneyToCard(PaymentCard card, double amount) {
        card.addMoney(amount);
        money += amount;
    }


    public boolean eatAffordably(PaymentCard card) {
        double mealCost = 2.5;
        if (card.takeMoney(mealCost)) {
            affordableMeals++;
            return true; // Successful transaction
        }
        return false; // Insufficient funds on the card
    }


    public boolean eatHeartily(PaymentCard card) {
        double mealCost = 4.3;
        if (card.takeMoney(mealCost)) {
            heartyMeals++;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Money: " + money + ", Number of sold affordable meals: " + affordableMeals + ", Number of sold hearty meals: " + heartyMeals;
    }
}
