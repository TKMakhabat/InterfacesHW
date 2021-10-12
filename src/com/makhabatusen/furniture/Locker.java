package com.makhabatusen.furniture;

public class Locker implements Furniture {

    @Override
    public void madeFrom(String material) {
        System.out.printf("made from: %s", material);
    }
}
