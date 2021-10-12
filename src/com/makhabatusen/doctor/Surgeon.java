package com.makhabatusen.doctor;

public class Surgeon implements Doctor {
    @Override
    public void placeOfWork(String place) {
        System.out.printf("\nSurgeon's place of work: %s", place);
    }
}
