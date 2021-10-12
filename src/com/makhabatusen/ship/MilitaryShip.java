package com.makhabatusen.ship;

public class MilitaryShip implements Ship {

    @Override
    public void setDestination(String destination) {
        System.out.printf("\nShip's Sailing Destination: %s", destination);
    }
}
