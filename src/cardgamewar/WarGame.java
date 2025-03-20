/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patel
 */

/**
 * Controls the overall flow of the War game with multiple rounds,
 * two players, and a deck of cards.
 */
public class WarGame {
    private Player player1;
    private Player player2;
    private Deck deck;
    private int totalRounds;

    // Optional: Track each round in a list, if you want the history
    private List<Round> rounds;

    /**
     * Constructs a WarGame with two player names and default total rounds.
     * If you want a dynamic totalRounds, pass it in as a constructor parameter.
     */
    public WarGame(String player1Name, String player2Name, int totalRounds) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
        this.deck = new Deck();
        this.totalRounds = totalRounds;
        this.rounds = new ArrayList<>();

        // Distribute all cards in the deck (splitting between players)
        while (!deck.isEmpty()) {
            Card c1 = deck.drawCard();
            if (c1 != null) {
                player1.addCard(c1);
            }
            Card c2 = deck.drawCard();
            if (c2 != null) {
                player2.addCard(c2);
            }
        }
    }

    /**
     * Plays the War game for 'totalRounds'.
     */
    public void playGame() {
        for (int roundNum = 1; roundNum <= totalRounds; roundNum++) {
            System.out.println("Round " + roundNum + "!");
            
            // Each player plays one card
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            // In case a player runs out of cards prematurely
            if (card1 == null || card2 == null) {
                System.out.println("A player has run out of cards! Ending game.");
                break;
            }

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            // Create a Round object for logic & possible tracking
            Round round = new Round(roundNum, card1, card2);
            int result = round.compareCards();
            rounds.add(round);

            if (result == 1) {
                player1.addScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (result == 2) {
                player2.addScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println();
        }

        // Determine final winner
        determineWinner();
    }

    /**
     * Compares player scores and announces the final result.
     */
    private void determineWinner() {
        System.out.println("=== Final Score ===");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}
