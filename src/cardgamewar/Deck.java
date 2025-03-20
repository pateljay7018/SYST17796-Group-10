/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author patel
 */

/**
 * Represents a standard deck of 52 playing cards.
 */
public class Deck {
    private List<Card> cards;

    /**
     * Constructs and shuffles a 52-card deck.
     */
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        cards = new ArrayList<>();
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
        Collections.shuffle(cards);
    }

    /**
     * Draws the top card from the deck (removes it from the list).
     * Returns null if the deck is empty.
     */
    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    /**
     * Checks if the deck is empty.
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
