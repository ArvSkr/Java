public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }


    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        return new Money(totalEuros, totalCents);
    }


    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }


    public Money minus(Money decreaser) {
        int totalCents1 = this.euros * 100 + this.cents;
        int totalCents2 = decreaser.euros * 100 + decreaser.cents;

        if (totalCents1 < totalCents2) {
            return new Money(0, 0);
        }

        int differenceCents = totalCents1 - totalCents2;
        return new Money(differenceCents / 100, differenceCents % 100);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
