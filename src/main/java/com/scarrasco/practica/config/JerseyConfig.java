package com.scarrasco.practica.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        packages("com.scarrasco.practica.rest");
    }

}