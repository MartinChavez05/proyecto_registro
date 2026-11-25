package com.mchavez.registro.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.mchavez.registro.datos.PersonaRepositorio;
import com.mchavez.registro.modelo.Persona;

public class PersonaService {
    private final Pattern EMAIL = Pattern
            .compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    private final PersonaRepositorio repositorio;

    public PersonaService(PersonaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<String> registrarPersona(String idTexto, String nombreCompleto, String email, String edadTexto) {
        List<String> errores = new ArrayList<>();

        Integer id = convertirEntero(idTexto);
        if (id == null || id <= 0) {
            errores.add("El id debe ser un numero mayor a 0");
        }
        String nombre = limpiarTexto(nombreCompleto);
        if (nombre.length() < 3) {
            errores.add("El nombre completo debe tener al menos 3 caracteres");
        }

        String correo = limpiarTexto(email);

        if (!EMAIL.matcher(correo).matches()) {
            errores.add("El email no tiene un formato valido");
        }

        Integer edad = convertirEntero(edadTexto);
        if (edad == null || edad < 1 || edad > 120) {
            errores.add("la edad debe ser un numero entre 1 y 120");

        }

        if (!errores.isEmpty()) {
            return errores;
        }

        boolean guardada = repositorio.guardarPersona(new Persona(id, nombreCompleto, email, edad));
        if (!guardada) {
            errores.add("Ya existe una persona con el id: " + id + ".");
        }
        return errores;
    }

    public List<Persona> listaPersonas() {
        return repositorio.listarPersonas();
    }

    private Integer convertirEntero(String numero) {
        if (numero == null) {
            return null;
        }
        try {
            return Integer.valueOf(numero.trim());
        } catch (NumberFormatException ex) {
            return null;
        }

    }

    private String limpiarTexto(String texto) {
        return texto == null ? "" : texto.trim();

    }
}
