/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;

import java.util.*;
/**
 *
 * @author patel
 Team member= Jasleen kaur
 */
public class Deck {
    private List<Card> cards;

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        cards = new ArrayList<>();
        for (String suit : suits) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(suit, ranks[j], values[j]));
            }
        }
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
    
    public boolean isEmpty() {
        return cards.isEmpty();
    }

}
