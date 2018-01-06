package enumeration_and_annotation_ex.g_deck_of_cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Card> cards = new ArrayList<>();

        for (SuitE suitE : SuitE.values()) {
            for (RankE rankE : RankE.values()) {
                Card card = new Card(rankE, suitE);
                cards.add(card);
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
