package enumeration_and_annotation_ex.b_card_rank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (Rank suit : Rank.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",
                    suit.getValue(), suit.name()));
        }
    }
}
