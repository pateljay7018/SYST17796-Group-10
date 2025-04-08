/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author patel
 */

/**
 * SRP: The WarGameModel handles the data and rules for the War game:
 *      - Creating players
 *      - Creating deck
 *      - Distributing cards
 *      - Tracking rounds
 *
 * OCP: We can extend WarGameModel if we introduce new variants of War
 *      without changing the rest of the code significantly.
 */
public class WarGameModel {

    private Player player1;
    private Player player2;
    private Deck deck;
    private List<Round> rounds;

    public WarGameModel(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
        this.deck = new Deck(); // standard deck
        this.rounds = new ArrayList<>();
    }

    public void distributeCards() {
        while (!deck.isEmpty()) {
            Card c1 = deck.drawCard();
            if (c1 != null) player1.addCard(c1);

            Card c2 = deck.drawCard();
            if (c2 != null) player2.addCard(c2);
        }
    }

    public Round playRound(int roundNumber) {
        // Each player plays one card
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        // In case a player runs out of cards
        if (card1 == null || card2 == null) {
            return null;
        }

        Round round = new Round(roundNumber, card1, card2);
        rounds.add(round);

        // Update score
        int result = round.compareCards();
        if (result == 1) {
            player1.addScore();
        } else if (result == 2) {
            player2.addScore();
        }
        return round;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public List<Round> getRounds() {
        return rounds;
    }
}
