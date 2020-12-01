package com.company.battleship.service;

import com.company.battleship.Models.GameBoard;
import com.company.battleship.Models.Missile;
import com.company.battleship.Models.Ship;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    GameBoard gameBoard;

    public GameService(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public List<Ship> createShips(String shipPositons) {
        List<Ship> listOfShips = new ArrayList();
        String[] shipCords = shipPositons.split(":");

        for (String singleCord : shipCords) {
            String[] cords = singleCord.split(",");

            listOfShips.add(new Ship(Integer.parseInt(cords[0]), Integer.parseInt(cords[1])));
        }
        return listOfShips;
    }

    public List<Missile> createMissiles(String missilePositons) {
        String[] missileCords = missilePositons.split(":");
        List<Missile> listOfMissiles = new ArrayList();

        for (String singleCord: missileCords) {
            String[] cords = singleCord.split(",");

            listOfMissiles.add(new Missile(Integer.parseInt(cords[0]), Integer.parseInt(cords[1])));
        }
        return listOfMissiles;
    }

    public void processInput(String shipPositons, String missilePositons) {
        gameBoard.processShips(createShips(shipPositons));
        gameBoard.processMissiles(createMissiles(missilePositons));
        gameBoard.showBoard();
    }


}
