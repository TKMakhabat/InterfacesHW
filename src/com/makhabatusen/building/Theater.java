package com.makhabatusen.building;

public class Theater extends PublicBuilding {

    public void build(int floors, String address) {
        System.out.printf("\nBuilt %d floors in %s", floors, address);
    }

}
