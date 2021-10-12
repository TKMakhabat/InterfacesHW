package com.makhabatusen.building;

public class PublicBuilding implements Building{

    @Override
    public void build(int floors) {
        System.out.printf("\nBuilt %d floors", floors);
    }
}
