package Zad5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów Debenture i Stock
        Debenture debenture = new Debenture(new BigDecimal("1000.0"), 1, new BigDecimal("0.05"));
        Stock stock = new Stock(new BigDecimal("50.0"), 2);

        // Tworzenie kolekcji papierów wartościowych
        Collection<Securities> securities = new ArrayList<>();
        securities.add(debenture);
        securities.add(stock);

        // Tworzenie obiektu Portfolio
        Portfolio portfolio = new Portfolio(securities);

        // Wyświetlenie początkowej wartości portfela
        System.out.println("Początkowa wartość portfela: " + portfolio.getTotalValue());

        // Wykonanie kroku
        portfolio.step();

        // Wyświetlenie wartości portfela po kroku
        System.out.println("Wartość portfela po kroku: " + portfolio.getTotalValue());
    }
}
