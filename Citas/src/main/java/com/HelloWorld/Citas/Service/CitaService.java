package com.HelloWorld.Citas.Service;

import com.HelloWorld.Citas.Models.Cita;

import java.util.List;

public interface CitaService {

    void alta(Cita cita);
    void baja(int id);

    List<Cita> listar();


}
