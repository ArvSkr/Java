
public class Main {

    public static void main(String[] args) {

        PaymentCard petesCard = new PaymentCard(10.0);
        System.out.println("Money: " + petesCard.balance());


        boolean wasSuccessful = petesCard.takeMoney(8.0);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money: " + petesCard.balance());


        wasSuccessful = petesCard.takeMoney(4.0);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money: " + petesCard.balance());


        PaymentTerminal unicafeExactus = new PaymentTerminal();
        double charge = unicafeExactus.eatAffordably(10.0);
        System.out.println("Remaining change: " + charge);

        charge = unicafeExactus.eatAffordably(2.5);
        System.out.println("Remaining change: " + charge);

        charge = unicafeExactus.eatHearty(4.3);
        System.out.println("Remaining change: " + charge);


        System.out.println(unicafeExactus);


        PaymentCard annesCard = new PaymentCard(2.0);
        System.out.println("Amount of money on the card: " + annesCard.balance() + " euros");

        boolean cardPaymentSuccess = unicafeExactus.eatAffordably(annesCard);
        System.out.println("There was enough money for affordable meal: " + cardPaymentSuccess);


        unicafeExactus.addMoneyToCard(annesCard, 100.0);


        cardPaymentSuccess = unicafeExactus.eatHeartily(annesCard);
        System.out.println("There was enough money for hearty meal: " + cardPaymentSuccess);


        System.out.println("Amount of money on the card: " + annesCard.balance() + " euros");


        System.out.println(unicafeExactus); // Prints updated terminal status
    }
}


