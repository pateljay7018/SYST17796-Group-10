/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.mytest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.sheridan.cardgamewar.model.Card;
import com.sheridan.cardgamewar.model.Round;
/**
 *
 * @author patel
 */
public class WarGameModelTest {

    @Test
    public void testCompareCards_Player1Wins() {
        Card card1 = new Card("Hearts", "K", 13);
        Card card2 = new Card("Clubs", "Q", 12);
        Round round = new Round(1, card1, card2);

        int result = round.compareCards();
        assertEquals(1, result, "Expected player1's card (value=13) to beat player2's (value=12)");
    }

    @Test
    public void testCompareCards_Tie() {
        Card card1 = new Card("Diamonds", "10", 10);
        Card card2 = new Card("Spades", "10", 10);
        Round round = new Round(1, card1, card2);

        int result = round.compareCards();
        assertEquals(0, result, "Expected tie, both card values are 10");
    }
}
