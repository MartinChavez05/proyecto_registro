package com.mchavez.registro.modelo;

public class Persona {
    private int id;
    private String NombreCompleto;
    private String email;
    private int edad;

    public Persona(int id, String nombreCompleto, String email, int edad) {
        this.id = id;
        NombreCompleto = nombreCompleto;
        this.email = email;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {

    }

}
