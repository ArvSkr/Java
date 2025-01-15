public class PaymentTerminal {
    private double money; // Amount of cash in the terminal
    private int affordableMeals; // Number of sold affordable meals
    private int heartyMeals; // Number of sold hearty meals

    // Constructor to initialize the terminal
    public PaymentTerminal() {
        this.money = 1000.0; // Initial amount of cash in the terminal
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    // Method to process a cash payment for an affordable meal
    public double eatAffordably(double payment) {
        double mealCost = 2.5;
        if (payment >= mealCost) {
            money += mealCost;
            affordableMeals++;
            return payment - mealCost; // Return remaining change
        }
        return payment; // Not enough money for the meal, return full payment
    }

    // Method to process a cash payment for a hearty meal
    public double eatHearty(double payment) {
        double mealCost = 4.3;
        if (payment >= mealCost) {
            money += mealCost;
            heartyMeals++;
            return payment - mealCost; // Return remaining change
        }
        return payment; // Not enough money for the meal, return full payment
    }

    // Method to add money to a payment card
    public void addMoneyToCard(PaymentCard card, double amount) {
        card.addMoney(amount);
        money += amount; // The terminal receives the money
    }

    // Method to process card payment for an affordable meal
    public boolean eatAffordably(PaymentCard card) {
        double mealCost = 2.5;
        if (card.takeMoney(mealCost)) {
            affordableMeals++;
            return true; // Successful transaction
        }
        return false; // Insufficient funds on the card
    }

    // Method to process card payment for a hearty meal
    public boolean eatHeartily(PaymentCard card) {
        double mealCost = 4.3;
        if (card.takeMoney(mealCost)) {
            heartyMeals++;
            return true; // Successful transaction
        }
        return false; // Insufficient funds on the card
    }

    // Method to return the current state of the payment terminal
    @Override
    public String toString() {
        return "Money: " + money + ", Number of sold affordable meals: " + affordableMeals + ", Number of sold hearty meals: " + heartyMeals;
    }
}
