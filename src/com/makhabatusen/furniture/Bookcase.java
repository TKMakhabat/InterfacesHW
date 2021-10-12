package com.makhabatusen.furniture;

public class Bookcase extends Locker {
    @Override
    public void madeFrom(String material) {
        System.out.print("\nThe bookcase ");
        super.madeFrom(material);
    }
}
