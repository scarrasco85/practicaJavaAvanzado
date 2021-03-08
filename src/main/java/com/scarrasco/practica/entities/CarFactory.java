package com.scarrasco.practica.entities;

import com.scarrasco.practica.error.CarNotFoundException;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Class that handles the creation of new car instances
 */
public class CarFactory {

    public static final String ELECTRIC_CAR   = "electrico";
    public static final String HYBRID_CAR     = "hibrido";
    public static final String COMBUSTION_CAR = "combustion";

    /**
     * Method that handles the creation of new car instances.
     * @param tipo It is the type of car you want to create (Electric, Hybrid or Combustion).
     * @param id Id car.
     * @param queryParams Car model fields.
     * @return a starter Car.
     * @throws CarNotFoundException In case the type of car does not exist
     */
    public static Car createCar(String tipo, Long id, MultivaluedMap<String, String> queryParams) throws CarNotFoundException {

        CarFacade facade = new CarFacade();
        String brand     = queryParams.getFirst("brand");
        String model     = queryParams.getFirst("model");
        String color     = queryParams.getFirst("color");
        String numDoors  = queryParams.getFirst("numDoors");
        String fuel      = queryParams.getFirst("fuel");


        return switch (tipo) {
            case ELECTRIC_CAR -> facade.prepareCar(
                    new ElectricCar(id, brand, model, color, Integer.parseInt(numDoors))
            );
            case HYBRID_CAR -> facade.prepareCar(
                    new HybridCar(id, brand, model, color, Integer.parseInt(numDoors), fuel)
            );
            case COMBUSTION_CAR -> facade.prepareCar(
                    new CombustionCar(id, brand, model, color, Integer.parseInt(numDoors), fuel)
            );
            default -> throw new CarNotFoundException();
        };

    }
}
