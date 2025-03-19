/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;
import java.util.*;
/**
 *
 * @author patel
 */
class WarGame {
    private Player player1;
    private Player player2;
    private final int totalRounds = 4;

    public WarGame(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);

        Deck deck = new Deck();
        while (deck.drawCard() != null) {
            player1.addCard(deck.drawCard());
            player2.addCard(deck.drawCard());
        }
    }

    public void playGame() {
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round + "!");
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            if (card1.getValue() > card2.getValue()) {
                player1.addScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.addScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
        }
        determineWinner();
    }

    private void determineWinner() {
        System.out.println("Final Score: " + player1.getName() + " " + player1.getScore() + " - " + player2.getName() + " " + player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}