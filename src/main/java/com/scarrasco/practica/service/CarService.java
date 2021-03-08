package com.scarrasco.practica.service;

import com.scarrasco.practica.entities.Car;
import com.scarrasco.practica.error.CarNotFoundException;

import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car findOne(Long id);

    Car save(String tipo, MultivaluedMap<String, String> color) throws CarNotFoundException;

    boolean delete(Long id);

    void deleteAll();

    Car update(Long id, MultivaluedMap<String, String> queryParams) throws CarNotFoundException;
}
