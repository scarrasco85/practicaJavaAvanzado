package com.scarrasco.practica.entities;

/**
 * Represents the air conditioning of a car.
 */
public class AirConditioner {

    private Boolean on;

    public AirConditioner(){}

    public Boolean getOn() {
        return on;
    }

    public AirConditioner setOn(Boolean on) {
        this.on = on;
        return this;
    }

    public void on(){
        this.on = true;
    }

    public void stop(){
        this.on = false;
    }
}
