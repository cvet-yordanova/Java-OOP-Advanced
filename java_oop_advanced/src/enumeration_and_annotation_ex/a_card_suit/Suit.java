package enumeration_and_annotation_ex.a_card_suit;

public enum Suit {

    CLUBS(0), DIAMONDS(1),  HEARTS(2), SPADES(3);

    private int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
