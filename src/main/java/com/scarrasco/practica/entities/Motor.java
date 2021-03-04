package com.scarrasco.practica.entities;

public class Motor {

    private Boolean on;

    public Motor(){}

    public void on(){
        this.on = true;
    }

    public void stop(){
        this.on = false;
    }
}
