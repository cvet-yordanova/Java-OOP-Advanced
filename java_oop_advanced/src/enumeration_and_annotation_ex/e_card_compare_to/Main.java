package enumeration_and_annotation_ex.e_card_compare_to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank1 = reader.readLine();
        String suit1 = reader.readLine();

        String rank2 = reader.readLine();
        String suit2 = reader.readLine();

        Card card1 = new Card(Rank.valueOf(rank1.toUpperCase()), Suit.valueOf(suit1.toUpperCase()));
        Card card2 = new Card(Rank.valueOf(rank2.toUpperCase()), Suit.valueOf(suit2.toUpperCase()));

        if (card1.compareTo(card2) > 0){
            System.out.println(card1);
        }else{
            System.out.println(card2);
        }
    }
}
