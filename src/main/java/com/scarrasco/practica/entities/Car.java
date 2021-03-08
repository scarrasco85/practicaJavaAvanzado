package com.scarrasco.practica.entities;

/**
 * Model Car
 */
public abstract class Car implements ICar {


    private Long id;
    private String carType;
    private Battery battery;
    private Motor motor;
    private AirConditioner air;
    private String brand;
    private String model;
    private String color;
    private Integer numDoors;


    public Car(){}

    public Car(Long id, String carType, String brand, String model, String color, Integer numDoors){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numDoors = numDoors;
        this.battery = null;
        this.motor = null;
        this.air = null;
        this.carType = carType;
    }

    public Long getId() {
        return id;
    }

    public Car setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCarType() {
        return carType;
    }

    public Car setCarType(String carType) {
        this.carType = carType;
        return this;
    }

    public Battery getBattery() {
        return battery;
    }

    public Car setBattery(Battery battery) {
        this.battery = battery;
        return this;
    }

    public Motor getMotor() {
        return motor;
    }

    public Car setMotor(Motor motor) {
        this.motor = motor;
        return this;
    }

    public AirConditioner getAir() {
        return air;
    }

    public Car setAir(AirConditioner air) {
        this.air = air;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getNumDoors() {
        return numDoors;
    }

    public Car setNumDoors(Integer numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    @Override
    public void start(Battery battery, Motor motor, AirConditioner air){
        this.battery = battery;
        this.motor = motor;
        this.air = air;
    }

    @Override
    public void stop(){
        this.battery.stop();
        this.motor.stop();
        this.air.stop();
    }

}
