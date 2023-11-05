package taliakart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        // Lista możliwych wartości i kolorów
        List<String> values = new ArrayList<>();
        values.add("2");
        values.add("3");
        values.add("4");
        values.add("5");
        values.add("6");
        values.add("7");
        values.add("8");
        values.add("9");
        values.add("10");
        values.add("J");
        values.add("Q");
        values.add("K");
        values.add("A");

        List<String> suits = new ArrayList<>();
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        suits.add("Spades");

        // Tworzenie talii kart
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(value, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // Talia jest pusta
        }
        return cards.remove(0); // Usuń i zwróć pierwszą kartę z talii
    }

    public Card getLastCard() {
        if (cards.isEmpty()) {
            return null; // Talia jest pusta
        }
        return cards.get(cards.size() - 1); // Pobierz ostatnią kartę z talii
    }

    public int getSize() {
        return cards.size();
    }


    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("Początkowa talia kart:");
        for (Card card : deck.cards) {
            System.out.println(card);
        }

        deck.shuffle();
        System.out.println("\nTalia kart po wymieszaniu:");
        for (Card card : deck.cards) {
            System.out.println(card);
        }

        Card drawnCard = deck.drawCard();
        System.out.println("\nWylosowana karta: " + drawnCard);

        Card lastCard = deck.getLastCard();
        System.out.println("\nOstatnia karta w talii: " + lastCard);
    }
}