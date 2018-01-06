package enumeration_and_annotation_ex.d_card_to_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank = reader.readLine();
        String suit = reader.readLine();

        Card card = new Card(Rank.valueOf(rank.toUpperCase()), Suit.valueOf(suit.toUpperCase()));

        System.out.println(card);
    }
}
