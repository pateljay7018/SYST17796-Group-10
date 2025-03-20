/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgamewar;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author patel
 */

/**
 * Represents a player in the War card game.
 */
public class Player {
    private String name;
    private Queue<Card> hand;
    private int score;

    /**
     * Constructs a new Player with a given name.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
        this.score = 0;
    }

    /**
     * Adds a single card to the player's hand.
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Removes and returns the top card from the player's hand (or null if empty).
     */
    public Card playCard() {
        return hand.poll();
    }

    /**
     * Increments the player's score (by 1 per round won).
     */
    public void addScore() {
        this.score++;
    }

    /**
     * Returns the current score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the size of the player's hand.
     */
    public int getHandSize() {
        return hand.size();
    }

    /**
     * Returns the player's name.
     */
    public String getName() {
        return name;
    }
}
