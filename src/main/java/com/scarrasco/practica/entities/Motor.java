package com.scarrasco.practica.entities;

/**
 * Represents the engine of a car.
 */
public class Motor {

    private Boolean on;

    public Motor(){}

    public Boolean getOn() {
        return on;
    }

    public Motor setOn(Boolean on) {
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
