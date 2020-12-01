package com.company.battleship.Factories;

import com.company.battleship.Models.GameBoard;

public class GameFactory {

    public static GameBoard getDefaultGameBoard(int sizeOfGrid) {
        return new GameBoard(sizeOfGrid);
    }
}
