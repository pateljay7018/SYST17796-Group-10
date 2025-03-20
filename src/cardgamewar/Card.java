/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;

/**
 *
 * @author Jay patel
 * @team member : Jasleen Kaur, Lakshit
 */

/**
 * Represents a single playing card with suit, rank, and numeric value.
 */
public class Card {
    private String suit;
    private String rank;
    private int value;

    /**
     * Constructs a Card.
     * @param suit  e.g., "Hearts", "Clubs", "Diamonds", "Spades"
     * @param rank  e.g., "2", "3", ... "K", "A"
     * @param value A numerical representation (2..14)
     */
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    /**
     * Returns the card's numeric value (for comparison in the game).
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a string representation, e.g. "Ace of Spades".
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}


