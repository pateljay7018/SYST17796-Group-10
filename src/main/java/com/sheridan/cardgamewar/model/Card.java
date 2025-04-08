/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.model;


/**
 *
 * @author Jay patel
 * @team member : Jasleen Kaur, Lakshit
 */

/**
 * Represents a single playing card with suit, rank, and numeric value.
 */


/**
 * SRP: The Card class only represents a playing card with suit, rank, value.
 * OCP: If we add new card types (e.g., Joker), we can extend or modify suits/ranks 
 *      without changing the rest of the system significantly.
 */
public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return rank + " of " + suit;
    }
    
    // Additional getters/setters if needed
}