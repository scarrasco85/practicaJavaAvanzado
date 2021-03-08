package com.scarrasco.practica.entities;

public interface ICar {

    void start(Battery battery, Motor motor, AirConditioner air);
    void stop();

}
