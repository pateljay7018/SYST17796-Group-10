/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sheridan.cardgamewar.controller;

import com.sheridan.cardgamewar.model.Round;
import com.sheridan.cardgamewar.model.WarGameModel;
import com.sheridan.cardgamewar.view.WarGameView;
/*
 *
 * @author patel
 */

/**
 * SRP: The WarGameController orchestrates the flow between Model and View.
 *      - Gathers input from the View
 *      - Updates the Model
 *      - Sends results back to the View
 *
 * OCP: If we have a new type of War game or new rules, we could extend the controller
 *      without modifying existing classes significantly.
 */

/**
 * SRP: The WarGameController orchestrates the flow between Model and View.
 *      - Gathers input from the View
 *      - Updates the Model
 *      - Sends results back to the View
 *
 * OCP: If we have a new type of War game or new rules, we could extend the controller
 *      without modifying existing classes significantly.
 */
public class WarGameController {
    private WarGameModel model;
    private WarGameView view;

    public WarGameController(WarGameModel model, WarGameView view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        // Distribute cards first
        model.distributeCards();

        // Prompt for total rounds
        int totalRounds = view.promptTotalRounds();

        for (int roundNum = 1; roundNum <= totalRounds; roundNum++) {
            view.displayRoundStart(roundNum);

            Round round = model.playRound(roundNum);
            if (round == null) {
                // A player ran out of cards
                view.displayGameOver();
                break;
            }

            // Show what each player played
            view.displayCardPlayed(model.getPlayer1(), round.getCard1());
            view.displayCardPlayed(model.getPlayer2(), round.getCard2());

            // Figure out who won
            int result = round.compareCards();
            if (result == 1) {
                view.displayRoundResult(model.getPlayer1());
            } else if (result == 2) {
                view.displayRoundResult(model.getPlayer2());
            } else {
                view.displayRoundResult(null);
            }
        }

        // Final results
        view.displayFinalScore(model.getPlayer1(), model.getPlayer2());
        view.displayWinner(model.getPlayer1(), model.getPlayer2());
    }
}
