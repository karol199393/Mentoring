package Zad5;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Random;

abstract class Securities {
    private BigDecimal value;
    private int id;

    public Securities(BigDecimal value, int id) {
        this.value = value;
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public abstract void step();
}
