package com.scarrasco.practica.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Component
public class HelloWorldController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return "Hola mundo cruel!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/bonjour")
    public String bonjour(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Title</title>
                </head>
                <body>
                <h1>BONJOUR!!</h1>
                </body>
                </html>
                """;
    }

}