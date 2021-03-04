package com.scarrasco.practica.entities;

import com.scarrasco.practica.error.CocheNotFoundException;

public class CocheFactory {

    private static final String C_ELECTRICO = "electrico";
    private static final String C_HIBRIDO = "hibrido";
    private static final String C_COMBUSTION = "combustion";

    public static Coche crearCoche(String tipo) throws CocheNotFoundException {

        CocheFacade facade = new CocheFacade();

        switch(tipo){
            case C_ELECTRICO:
                return facade.start(new ElectricCar("rojo", 5));

            case C_HIBRIDO:
                return facade.start(new HybridCar("rojo", 3));
            case C_COMBUSTION:
                return facade.start(new CombustionCar("Gris", 3, "Diesel"));
            default:
                throw new CocheNotFoundException();
        }


    }
}
