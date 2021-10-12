package com.makhabatusen.ship;

public class Tanker extends CargoShip {

    private String model;

    public Tanker(String model) {
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
