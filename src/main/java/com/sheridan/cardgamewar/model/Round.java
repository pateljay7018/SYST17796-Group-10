/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.model;

/**
 *
 * @author patel
 */

/**
 * Represents a single round in the War game, holding two cards and round number.
 */

/**
 * SRP: The Round class holds logic/data for a single round in the game.
 */
public class Round {
    private int roundNumber;
    private Card card1;
    private Card card2;

    public Round(int roundNumber, Card card1, Card card2) {
        this.roundNumber = roundNumber;
        this.card1 = card1;
        this.card2 = card2;
    }

    // Compare logic
    public int compareCards() {
        if (card1.getValue() > card2.getValue()) {
            return 1;
        } else if (card1.getValue() < card2.getValue()) {
            return 2;
        } else {
            return 0; // tie
        }
    }

    public int getRoundNumber() { return roundNumber; }
    public Card getCard1() { return card1; }
    public Card getCard2() { return card2; }
}
