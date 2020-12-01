package com.company.battleship.service;

import com.company.battleship.Models.GameBoard;
import com.company.battleship.Models.Missile;
import com.company.battleship.Models.Ship;
import com.sun.javafx.sg.prism.NGPhongMaterial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {



    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createShips() {
        GameBoard gameBoard = new GameBoard(5);
        GameService gameService = new GameService(gameBoard);
        String shipPositions = "1,1:4,3";

        List<Ship> shipList = gameService.createShips(shipPositions);

        assertTrue(!shipList.isEmpty());

    }

    @Test
    void createMissiles() {
        GameBoard gameBoard = new GameBoard(5);
        String missilePositions = "1,1";
        GameService gameService = new GameService(gameBoard);
        List<Missile> missileList = gameService.createMissiles(missilePositions);

        assertTrue(!missileList.isEmpty());
        for (int i = 0; i< missileList.size(); i++) {
            assertEquals(missileList.get(i).getxCordinate(), );

        }
    }

}