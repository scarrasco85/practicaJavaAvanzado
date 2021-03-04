package com.scarrasco.practica.entities;

public class CocheFacade {

    public Coche start(Coche car){

        Battery battery = new Battery();
        battery.on();

        // todo - check sim

        Motor motor = new Motor();
        motor.on();

        AirConditioner air = new AirConditioner();
        air.on();
        car.start(battery, motor, air);

        return car;

    }
}
