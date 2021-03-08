package com.scarrasco.practica.entities;

public class CarFacade {

    /**
     * Method that prepares the car to start it
     * @param car a new car created.
     * @return a car ready to go.
     */
    public Car prepareCar(Car car){

        Battery battery = new Battery();
        battery.on();

        Motor motor = new Motor();
        motor.on();

        AirConditioner air = new AirConditioner();
        air.on();
        car.start(battery, motor, air);

        return car;

    }
}
