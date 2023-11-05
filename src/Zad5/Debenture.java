package Zad5;

import java.math.BigDecimal;

class Debenture extends Securities {
    private BigDecimal interestRate;

    public Debenture(BigDecimal value, int id, BigDecimal interestRate) {
        super(value, id);
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void step() {
        // Dodaj odsetki do wartości
        BigDecimal interest = getValue().multiply(interestRate);
        setValue(getValue().add(interest));
    }
}
