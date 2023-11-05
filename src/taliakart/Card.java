package taliakart;

public class Card {
    private String value;
    private String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + " - " + suit;
    }

    public static void main(String[] args) {

        }
    }

