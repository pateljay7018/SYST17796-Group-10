/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgamewar;
import java.util.Scanner;

/**
 *
 * @author Jay patel
 * @team member : Jasleen Kaur, Lakshit
 */

/**
 * Main driver class for the War Game. 
 * Prompts the user for player names, sets total rounds, 
 * and runs the WarGame.
 */
public class CardGameWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();

        System.out.print("How many rounds do you want to play? ");
        int totalRounds = Integer.parseInt(scanner.nextLine());

        // Create and start the game
        WarGame game = new WarGame(player1Name, player2Name, totalRounds);
        game.playGame();

        scanner.close();
    }
}
