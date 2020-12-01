package com.company.battleship.Models;

public class Missile {
    private int xCordinate;
    private int yCordinate;

    public Missile(int xCordinate, int yCordinate) {
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
