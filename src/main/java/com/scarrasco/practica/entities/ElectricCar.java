package com.scarrasco.practica.entities;

public class ElectricCar extends Coche{

    private Integer cargaBateria;
   /* private String marca;
    private String modelo;
    private Integer anio;*/


    public ElectricCar(String color, Integer numPuertas) {
        super(color, numPuertas);
        this.cargaBateria = 100;
    }

}
