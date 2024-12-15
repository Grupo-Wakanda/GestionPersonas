package com.example.gestionpersonas;

import org.springframework.stereotype.Component;

@Component
public class PersonaFabrica {

    public Persona crearPersona(String nombre, int edad, String empleo) {
        return new Persona(nombre, edad, empleo);
    }
}
