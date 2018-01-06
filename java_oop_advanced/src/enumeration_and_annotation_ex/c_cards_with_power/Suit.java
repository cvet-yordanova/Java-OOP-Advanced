package enumeration_and_annotation_ex.c_cards_with_power;

public enum Suit {

    //(CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).

    CLUBS(0), DIAMONDS(13),  HEARTS(26), SPADES(39);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
