package com.makhabatusen.doctor;

public class Neurosurgeon extends Surgeon {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Neurosurgeon(String name) {
        this.name = name;
    }

    @Override
    public void placeOfWork(String place) {
        System.out.printf("\nNeurosurgeon's name: %s", getName());
        super.placeOfWork(place);
    }
}
