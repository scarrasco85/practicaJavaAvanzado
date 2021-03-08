package com.scarrasco.practica.entities;

import static com.scarrasco.practica.entities.CarFactory.HYBRID_CAR;

/**
 * Represents a car that runs on a fuel and electric engine.
 */
public class HybridCar extends Car {

    private Integer energyBattery;
    private String fuel;

    public HybridCar(){}

    public HybridCar(Long id, String brand, String model, String color, Integer numDoors, String fuel) {

        super(id, HYBRID_CAR, brand, model, color, numDoors);
        this.energyBattery = 100;
        this.fuel          = fuel;

    }

    public Integer getEnergyBattery() {
        return energyBattery;
    }

    public HybridCar setEnergyBattery(Integer energyBattery) {
        this.energyBattery = energyBattery;
        return this;
    }

    public String getFuel() {
        return fuel;
    }

    public HybridCar setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }
}
