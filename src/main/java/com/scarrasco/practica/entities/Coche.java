package com.scarrasco.practica.entities;

public abstract class Coche implements ICar {


    private Battery battery;
    private Motor motor;
    private AirConditioner air;

    private String color;
    private Integer numPuertas;


    public Coche(String color, Integer numPuertas){
        this.color = color;
        this.numPuertas = numPuertas;
        this.battery = null;
        this.motor = null;
        this.air = null;
    }

    @Override
    public void start(Battery battery, Motor motor, AirConditioner air){
        this.battery = battery;
        this.motor = motor;
        this.air = air;
    }

}
