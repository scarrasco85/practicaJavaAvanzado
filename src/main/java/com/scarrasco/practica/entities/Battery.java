package com.scarrasco.practica.entities;

public class Battery {

    private Boolean on;

    public Battery(){}

    public void on(){
        this.on = true;
    }

    public void stop(){
        this.on = false;
    }
}
