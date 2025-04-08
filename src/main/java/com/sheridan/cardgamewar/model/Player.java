/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.model;
import java.util.LinkedList;
import java.util.Queue;
/*
 * @author Jay Patel
 */

/**
 * Represents a player in the War card game.
 */

/**
 * SRP: The Player class handles player-specific data (name, hand, score).
 */
public class Player {
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
        this.score++;
    }

    public int getScore() {
        return score;
    }

    public int getHandSize() {
        return hand.size();
    }

    public String getName() {
        return name;
    }
}