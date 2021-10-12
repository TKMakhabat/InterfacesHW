package com.makhabatusen.ship;

public class CargoShip implements Ship {
    @Override
    public void setDestination(String destination) {
        System.out.printf("\nShip's Sailing Destination: %s", destination);
    }
}
