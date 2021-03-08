package com.scarrasco.practica.rest;

import com.scarrasco.practica.entities.Car;
import com.scarrasco.practica.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;


/**
 * Controller that interacts with the service to return data to the user.
 */
@Path("/cars")
@Component
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_FORM_URLENCODED})
@Produces(MediaType.APPLICATION_JSON)
public class CarController {

    @Autowired
    CarService carService;

    /**
     * Cars: Get all cars
     * @return List<car>
     */
    @GET
    public List<Car> findAll(){
        return carService.findAll();
    }

    /**
     * Get a car by Id
     * @param id Id of car
     * @return Car
     */
    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Long id){
        Car car = carService.findOne(id);
        if (car == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(car).build();
    }


    /**
     * Create a new car.
     */
    @Context UriInfo uriInfo;
    @POST
    @Path("{tipo}")
    public Response create(@PathParam("tipo") String tipo) {

        try {
            MultivaluedMap<String, String> queryParams = uriInfo.getQueryParameters();

            Car car = carService.save(tipo,queryParams);

            return Response.ok(car).build();

        }catch (Exception e){
            e.printStackTrace();
            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }

    /**
     * Update car by Id.
     */
    @Context UriInfo uriInfoUpdate;
    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id) {

        try {
            MultivaluedMap<String, String> queryParams = uriInfoUpdate.getQueryParameters();

            Car car = carService.update(id,queryParams);

            return Response.ok(car).build();

        }catch (Exception e){
            e.printStackTrace();
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Delete a car by Id.
     * @param id url param:Id of car you want delete.
     * @return Response status.
     */
    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Long id){

        if(!carService.delete(id))
            return Response.ok(Response.Status.NOT_FOUND).build();
        return Response.ok(Response.Status.OK).build();

    }

    /**
     * Delete all cars.
     * @return Response status.
     */
    @DELETE
    public Response deleteAll(){

        carService.deleteAll();
        return Response.ok(Response.Status.OK).build();

    }

}
