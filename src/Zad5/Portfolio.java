package Zad5;

import java.math.BigDecimal;
import java.util.Collection;

class Portfolio {
    private Collection<Securities> securities;

    public Portfolio(Collection<Securities> securities) {
        this.securities = securities;
    }

    public void step() {
        // Wykonaj krok dla każdego instrumentu w portfelu
        for (Securities security : securities) {
            security.step();
        }
    }

    public BigDecimal getTotalValue() {
        // Zwróć łączną wartość całego portfela
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Securities security : securities) {
            totalValue = totalValue.add(security.getValue());
        }
        return totalValue;
    }
}