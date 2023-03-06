package com.HelloWorld.Citas.Models;

import java.util.Date;

public class Cita {
    private String Nombre;
    private String Apellidos;
    private Date Fecha;

    public Cita(String nombre, String apellidos, Date fecha) {
        Nombre = nombre;
        Apellidos = apellidos;
        Fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}

