package enumeration_and_annotation_ex.h_card_game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public Card getHighestCard(){
        Card highestCard = cards.get(0);

        for (Card card : cards) {
            if(card.getPower() > highestCard.getPower()){
                highestCard = card;
            }
        }

        return highestCard;

    }

    public String getName() {
        return name;
    }

    public Integer getCardsSize() {
        return cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }
}
