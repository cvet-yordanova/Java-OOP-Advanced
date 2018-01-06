package enumeration_and_annotation_ex.a_card_suit;

import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (Suit suit : Suit.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    suit.getValue(), suit.name()));
        }
    }
}
