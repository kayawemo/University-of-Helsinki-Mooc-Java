
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }


    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    //compare
    public boolean lessThan(Money compared) {

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        if (this.euros < compared.euros) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {

        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;
        System.out.println(totalEuros);

        if (totalEuros >= 0) {
            if (totalCents < 0) {
                totalEuros = totalEuros -1;
                totalCents = totalCents + 100;
            }
        } else {
            totalEuros = 0;
            totalEuros = 0;
        }

        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;

    }


}
