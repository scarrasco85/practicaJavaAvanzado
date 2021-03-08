package com.scarrasco.practica.entities;

/**
 * Represents the starter battery of a car.
 */
public class Battery {

    private Boolean on;

    public Battery(){}

    public Boolean getOn() {
        return on;
    }

    public Battery setOn(Boolean on) {
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
