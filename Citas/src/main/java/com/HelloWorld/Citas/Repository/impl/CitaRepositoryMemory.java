package com.HelloWorld.Citas.Repository.impl;

import com.HelloWorld.Citas.Models.Cita;
import com.HelloWorld.Citas.Repository.CitaRepository;

import java.util.ArrayList;
import java.util.List;

public class CitaRepositoryMemory implements CitaRepository {

    private List<Cita> citas;

    public CitaRepositoryMemory(){
        this.citas = new ArrayList<>();
    }
    @Override
    public void alta(Cita cita) {
        citas.add(cita);
    }

    @Override
    public void baja(int id) {
        citas.remove(id);
    }

    @Override
    public List<Cita> Listar() {
        return citas;
    }
}
