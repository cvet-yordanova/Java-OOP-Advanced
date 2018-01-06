package enumeration_and_annotation_ex.g_deck_of_cards;

public class Card implements Comparable<Card> {
    private RankE rank;
    private SuitE suit;

    public Card(RankE rank, SuitE suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank.name(), this.suit.name());
    }

    private int getPower(){
        return this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getPower(), o.getPower());
    }
}
