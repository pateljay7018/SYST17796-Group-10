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
public class Player {
    private String name;
    private Queue<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void addWonCards(List<Card> wonCards) {
        hand.addAll(wonCards);
    }

    public Card playCard() {
        return hand.poll();
    }

    public int getHandSize() {
        return hand.size();
    }

    public String getName() {
        return name;
    }
}
