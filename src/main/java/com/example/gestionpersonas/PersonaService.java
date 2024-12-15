package com.example.gestionpersonas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaFabrica personaFabrica;

    public Persona crearPersona(String nombre, int edad, String empleo) {
        Persona persona = personaFabrica.crearPersona(nombre, edad, empleo);
        return personaRepository.save(persona);
    }

    /*
    el metodo debe ver cuantas personas faltan en los repositorios de Escuela o Seguridad
    y crear tantos empleos segun lo que necesite
    public otorgarEmpleo(){

    }
     */
}
