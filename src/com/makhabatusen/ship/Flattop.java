package com.makhabatusen.ship;

public class Flattop extends MilitaryShip {
    private String model;

    public Flattop(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setDestination(String destination) {
        System.out.printf("\nShips Model: %s", getModel());
        super.setDestination(destination);

    }
}
