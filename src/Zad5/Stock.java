package Zad5;

import java.math.BigDecimal;
import java.util.Random;

class Stock extends Securities {
    public Stock(BigDecimal value, int id) {
        super(value, id);
    }

    @Override
    public void step() {
        // Losowo zwiększ lub zmniejsz cenę akcji o 10%
        Random random = new Random();
        boolean increase = random.nextBoolean();
        BigDecimal change = getValue().multiply(new BigDecimal("0.10"));
        if (increase) {
            setValue(getValue().add(change));
        } else {
            setValue(getValue().subtract(change));
        }
    }
}
