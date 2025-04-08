/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.view;

import com.sheridan.cardgamewar.model.Card;
import com.sheridan.cardgamewar.model.Player;
import com.sheridan.cardgamewar.model.Round;
import java.util.Scanner;
/**
 *
 * @author patel
 */

/**
 * SRP: The WarGameView is responsible for console-based input/output.
 */
public class WarGameView {

    private Scanner scanner;

    public WarGameView() {
        this.scanner = new Scanner(System.in);
    }

    public String promptPlayerName(int playerNumber) {
        System.out.print("Enter Player " + playerNumber + " name: ");
        return scanner.nextLine();
    }

    public int promptTotalRounds() {
        System.out.print("How many rounds do you want to play? ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void displayRoundStart(int roundNum) {
        System.out.println("\nRound " + roundNum + "!");
    }

    public void displayCardPlayed(Player player, Card card) {
        System.out.println(player.getName() + " plays " + card);
    }

    public void displayRoundResult(Player winner) {
        if (winner != null) {
            System.out.println(winner.getName() + " wins this round!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public void displayGameOver() {
        System.out.println("\nA player has run out of cards! Ending game.");
    }

    public void displayFinalScore(Player p1, Player p2) {
        System.out.println("\n=== Final Score ===");
        System.out.println(p1.getName() + ": " + p1.getScore());
        System.out.println(p2.getName() + ": " + p2.getScore());
    }

    public void displayWinner(Player p1, Player p2) {
        if (p1.getScore() > p2.getScore()) {
            System.out.println(p1.getName() + " wins the game!");
        } else if (p2.getScore() > p1.getScore()) {
            System.out.println(p2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}

