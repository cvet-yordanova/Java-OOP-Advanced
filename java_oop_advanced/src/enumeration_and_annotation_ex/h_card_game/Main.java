package enumeration_and_annotation_ex.h_card_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Player player1 = new Player(reader.readLine());
        Player player2 = new Player(reader.readLine());

        List<Card> cards = new ArrayList<>();
        HashMap<String, Card> deck = new HashMap<>();

        for (SuitE suitE : SuitE.values()) {
            for (RankE rankE : RankE.values()) {
                Card card = new Card(rankE, suitE);
                cards.add(card);
                deck.putIfAbsent(card.toString(), card);
            }
        }

        String db = "";

        while(true){
            String nameOfCard = reader.readLine();
            Card currentCard = deck.get(nameOfCard);

            if (currentCard == null){
                if(cards.stream().anyMatch(a -> a.toString().equals(nameOfCard))){
                    System.out.println("Card is not in the deck.");
                }else{
                    System.out.println("No such card exists.");
                }
            }else{
                if(player1.getCardsSize() < 5 ){
                    player1.addCard(currentCard);
                    deck.remove(currentCard.toString());
                }else if(player2.getCardsSize() < 5){
                    player2.addCard(currentCard);
                    deck.remove(currentCard.toString());
                }
            }

            if(player1.getCardsSize() == 5 && player2.getCardsSize() == 5){
                break;
            }
        }

        Card firstPlayerWinnigCard = player1.getHighestCard();
        Card secondPlayerWinnigCard = player2.getHighestCard();

        String str = "%s wins with %s.";

        System.out.println(firstPlayerWinnigCard.getPower() > secondPlayerWinnigCard.getPower()
                ? String.format(str, player1.getName(), firstPlayerWinnigCard)
                : String.format(str, player2.getName(), secondPlayerWinnigCard));

    }
}
