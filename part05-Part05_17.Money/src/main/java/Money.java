
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
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        boolean isLessThan = false;
        if (this.euros < compared.euros) {
            isLessThan = true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                isLessThan = true;
            }
        }
        return isLessThan;
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        } else {
            int localEuros = this.euros - decreaser.euros;
            int localCents = this.cents - decreaser.cents;
            if ((this.cents - decreaser.cents) < 0) {
                localEuros = localEuros - 1;
                localCents = 100 + this.cents - decreaser.cents;
            }
            return new Money(localEuros, localCents);
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
