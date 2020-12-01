package com.company.battleship.Models;

public class Ship {
    private int xCordinate;
    private int yCordinate;

    public Ship(int xCordinate, int yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }

    public int getxCordinate() {
        return xCordinate;
    }


    public int getyCordinate() {
        return yCordinate;
    }

}
