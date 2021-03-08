package com.scarrasco.practica.service;

import com.scarrasco.practica.entities.Car;
import com.scarrasco.practica.entities.CarFactory;
import com.scarrasco.practica.error.CarNotFoundException;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.MultivaluedMap;
import java.util.*;

/**
 * Service that interacts with the database to return the data to the controller.
 */
@Service
public class CarServiceImpl implements CarService {

    // Simulate car's DB
    private static final Map<Long, Car> cars = new HashMap<>();
    static Long staticIdCar = null;


    /**
     * Get all cars of DB.
     * @return ArrayList
     */
    @Override
    public List<Car> findAll() {
        return new ArrayList<>(cars.values());
    }

    /**
     * Get car by Id of DB.
     * @param id Identificator car
     * @return Car
     */
    @Override
    public Car findOne(Long id) {
        return cars.get(id);
    }

    /**
     * Save in Db a new car.
     * @param tipo url param:Type of car you want to create("electrico", "hibrido", "combustion").
     * @param queryParams data necessary to create the car.
     * @return Car created.
     * @throws CarNotFoundException It indicates that the car not found in the database.
     */
    @Override
    public Car save(String tipo, MultivaluedMap<String, String> queryParams) throws CarNotFoundException {

        // New car
        if (staticIdCar == null || cars.isEmpty()){
            staticIdCar =1L;
        }else{
            staticIdCar = getMaxCarId() + 1L;
        }

        Car car = CarFactory.createCar(tipo, staticIdCar, queryParams);

        cars.put(staticIdCar, car);

        return car;
    }

    /**
     * Get the highest Id car found in the DB.
     * @return Id
     */
    private Long getMaxCarId() {
        return Collections.max(cars.entrySet(),
                (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey())
        ).getKey();
    }

    /**
     * Update car by Id in DB.
     * @param id Id of car you want to update.
     * @param queryParams data necessary to update the car.
     * @return Car updated.
     * @throws CarNotFoundException It indicates that the car not found in the database.
     */
    @Override
    public Car update(Long id, MultivaluedMap<String, String> queryParams) throws CarNotFoundException {

        Car oldCar = cars.get(id);

        if (oldCar == null) throw new CarNotFoundException();

        String tipo = oldCar.getCarType();

        Car car = CarFactory.createCar(tipo, id, queryParams);

        cars.put(id, car);

        return car;
    }

    /**
     * Delete a car by Id of DB.
     * @param id Id of car you want delete.
     * @return Boolean.
     */
    @Override
    public boolean delete(Long id) {

        if (id == null || !cars.containsKey(id))
            return false;

        cars.remove(id);

        return true;
    }

    /**
     * Delete all cars of DB.
     */
    @Override
    public void deleteAll() {

        if (!cars.isEmpty()){
            cars.clear();
            staticIdCar = null;
        }

    }
}
