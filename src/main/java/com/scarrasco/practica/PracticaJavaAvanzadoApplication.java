package com.scarrasco.practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaJavaAvanzadoApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticaJavaAvanzadoApplication.class, args);
		// Probando ...
	/*	Coche electrico = CocheFactory.crearCoche("electrico");
		System.out.println("Coche electrico" + electrico);

		Coche hibrido = CocheFactory.crearCoche("hibrido");
		System.out.println("Coche hibrido" + hibrido);

		Coche combustion = CocheFactory.crearCoche("combustion");
		System.out.println("Coche combustion" + combustion);

		Coche noExiste = CocheFactory.crearCoche("noexiste");*/
	}

}
