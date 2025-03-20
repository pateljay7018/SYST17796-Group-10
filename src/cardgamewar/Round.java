/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;

/**
 *
 * @author patel
 */

/**
 * Represents a single round in the War game, holding two cards and round number.
 */
public class Round {
    private int roundNumber;
    private Card card1;
    private Card card2;

    /**
     * Constructs a Round object.
     * @param roundNumber the round index (1, 2, 3, ...)
     * @param card1       the card played by player1
     * @param card2       the card played by player2
     */
    public Round(int roundNumber, Card card1, Card card2) {
        this.roundNumber = roundNumber;
        this.card1 = card1;
        this.card2 = card2;
    }

    /**
     * Compares card1 vs. card2 and returns:
     *   1 if card1 wins, 2 if card2 wins, 0 if tie.
     */
    public int compareCards() {
        if (card1.getValue() > card2.getValue()) {
            return 1;
        } else if (card1.getValue() < card2.getValue()) {
            return 2;
        } else {
            return 0;  // tie
        }
    }

    /**
     * Returns the round number.
     */
    public int getRoundNumber() {
        return roundNumber;
    }

    // Optional getters for the cards
    public Card getCard1() {
        return card1;
    }

    public Card getCard2() {
        return card2;
    }
}
