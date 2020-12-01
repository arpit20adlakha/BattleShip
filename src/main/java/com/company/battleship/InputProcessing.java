package com.company.battleship;

import com.company.battleship.Factories.GameFactory;
import com.company.battleship.Models.GameBoard;
import com.company.battleship.service.GameService;

import java.util.Scanner;


// 1,1:2,0:2,3:3,4:4,3
// 0,1:0,0:1,1:2,3:4,3

public class InputProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the BattleGround");
        int gridSize = scanner.nextInt();

        System.out.println("Enter the number of ships");
        int numberOfShips = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the ship Positions");
        String shipPositons = scanner.nextLine();

        System.out.println("Enter the number of missiles each player has");
        int numberOfMissiles = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Missile Positions");
        String missilePositons = scanner.nextLine();

        GameBoard gameBoard = GameFactory.getDefaultGameBoard(gridSize);

        GameService gameService = new GameService(gameBoard);
        gameService.processInput(shipPositons, missilePositons);

    }

}
