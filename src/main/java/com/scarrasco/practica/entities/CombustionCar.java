package com.scarrasco.practica.entities;

public class CombustionCar extends Coche{

    private String combustible;

    public CombustionCar(String color, Integer numPuertas, String combustible) {
        super(color, numPuertas);
        this.combustible = combustible;
    }
}
