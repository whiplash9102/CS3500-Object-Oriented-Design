package hw02.hwmodeling;

public class Card {
    private final int value; // 1 - 13
    private final String suit;

    Card(int value, String suit) {
        if (value < 1 || value > 13 || suit == null){
            throw new IllegalArgumentException("Invalid Card");
        }

        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }
}
