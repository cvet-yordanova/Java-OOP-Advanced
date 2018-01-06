package enumeration_and_annotation_ex.h_card_game;

@Suit
public enum SuitE {

    CLUBS(0), DIAMONDS(13),  HEARTS(26), SPADES(39);

    private int power;

    SuitE(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
