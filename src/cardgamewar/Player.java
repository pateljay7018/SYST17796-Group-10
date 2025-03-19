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
class Player {
    private String name;
    private Queue<Card> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
        this.score = 0;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        return hand.poll();
    }

    public void addScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
