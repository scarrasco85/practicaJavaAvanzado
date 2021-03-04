package com.scarrasco.practica.entities;

public class AirConditioner {

    private Boolean on;

    public AirConditioner(){}

    public void on(){
        this.on = true;
    }

    public void stop(){
        this.on = false;
    }
}
