package com.HelloWorld.Citas.Repository;

import com.HelloWorld.Citas.Models.Cita;

import java.util.List;

public interface CitaRepository {
    void alta(Cita cita);
    void baja(int id);
    public List<Cita> Listar();
}
