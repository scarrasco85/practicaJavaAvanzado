package com.scarrasco.practica.entities;

import static com.scarrasco.practica.entities.CarFactory.COMBUSTION_CAR;

/**
 * Represents a car that runs on a fuel engine.
 */
public class CombustionCar extends Car {

    private String fuel;

    public CombustionCar(Long id, String brand, String model, String color, Integer numDoors, String fuel) {
        super(id, COMBUSTION_CAR, brand, model, color, numDoors );
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public CombustionCar setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }
}
