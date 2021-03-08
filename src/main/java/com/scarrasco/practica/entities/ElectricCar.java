package com.scarrasco.practica.entities;

import static com.scarrasco.practica.entities.CarFactory.ELECTRIC_CAR;

/**
 * Represents a car that runs on a electric engine.
 */
public class ElectricCar extends Car {

    private Integer energyBattery;


    public ElectricCar(){}

    public ElectricCar(Long id, String brand, String model, String color, Integer numDoors) {
        super(id, ELECTRIC_CAR, brand, model, color, numDoors);
        this.energyBattery = 100;
    }

    public Integer getEnergyBattery() {
        return energyBattery;
    }

    public ElectricCar setEnergyBattery(Integer energyBattery) {
        this.energyBattery = energyBattery;
        return this;
    }
}
