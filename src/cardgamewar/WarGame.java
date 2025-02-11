/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;
import java.util.*;
/**
 *
 * @author patel
 Team member=Jasleen kaur 
 */
public class WarGame {
    private Player player1;
    private Player player2;

    public WarGame(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);

        Deck deck = new Deck();
        while (!deck.isEmpty()) {
            player1.addCard(deck.drawCard());
            player2.addCard(deck.drawCard());
        }
    }

    public void playGame() {
        System.out.println("Round 1!");
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        System.out.println(player1.getName() + " plays " + card1);
        System.out.println(player2.getName() + " plays " + card2);

        if (card1.getValue() > card2.getValue()) {
            System.out.println(player1.getName() + " wins this round!\n");
            System.out.println(player1.getName() + " wins the game!\n");
        } else {
            System.out.println(player2.getName() + " wins this round!\n");
            System.out.println(player2.getName() + " wins the game!\n");
        }
    }
}
