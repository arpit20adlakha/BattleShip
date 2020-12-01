package com.company.battleship.Models;

import java.util.List;



public class GameBoard {
    private char[][] gameBoard;

    public GameBoard(int M) {
        gameBoard = new char[M][M];
        for (int i = 0; i< M; i++) {
            for (int j = 0; j < M; j++) {
                 gameBoard[i][j] = '_';
            }
        }
    }

    public void processShips(List<Ship> battleShips) {
        for (Ship ship : battleShips) {
            gameBoard[ship.getxCordinate()][ship.getyCordinate()] = 'B';
        }
    }

    public void processMissiles(List<Missile> missiles) {
        for(Missile missile : missiles) {
            if (gameBoard[missile.getxCordinate()][missile.getyCordinate()] == '_') {
                gameBoard[missile.getxCordinate()][missile.getyCordinate()] = 'O';
            } else {
                gameBoard[missile.getxCordinate()][missile.getyCordinate()] = 'X';
            }
        }
    }


    public void showBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

}
