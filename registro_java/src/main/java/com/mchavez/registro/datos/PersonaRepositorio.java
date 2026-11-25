package com.mchavez.registro.datos;

import java.util.concurrent.ConcurrentMap;

import com.mchavez.registro.modelo.Persona;

public class PersonaRepositorio {
    private final ConcurrentMap<Integer, Persona> personas = new ConcurrentSkipListMap<>();

}
