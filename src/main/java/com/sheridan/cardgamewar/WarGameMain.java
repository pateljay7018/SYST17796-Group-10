/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sheridan.cardgamewar;
import com.sheridan.cardgamewar.controller.WarGameController;
import com.sheridan.cardgamewar.model.WarGameModel;
import com.sheridan.cardgamewar.view.WarGameView;

/**
 *
 * @author patel
 */

/**
 * Entry point for the console-based War Game.
 * We create Model, View, and Controller, then start the game.
 */
public class WarGameMain {
    public static void main(String[] args) {

        WarGameView view = new WarGameView();
        
        // Prompt player names via the view
        String player1Name = view.promptPlayerName(1);
        String player2Name = view.promptPlayerName(2);

        // Create model with player names
        WarGameModel model = new WarGameModel(player1Name, player2Name);

        // Create controller
        WarGameController controller = new WarGameController(model, view);

        // Start the game flow
        controller.startGame();

        // Close scanner (optional)
        view.closeScanner();
    }
}
