/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jay Patel
 */

/**
 * Represents a standard deck of 52 playing cards.
 */

/**
 * SRP: The Deck class is responsible only for managing a collection of cards.
 */
public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        // Populate the deck
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values  = { 2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 14};

        for(String suit : suits) {
            for (int i=0; i<ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}