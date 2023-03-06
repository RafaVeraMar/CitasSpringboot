package com.HelloWorld.Citas.Service.impl;

import com.HelloWorld.Citas.Models.Cita;
import com.HelloWorld.Citas.Repository.CitaRepository;
import com.HelloWorld.Citas.Repository.impl.CitaRepositoryMemory;
import com.HelloWorld.Citas.Service.CitaService;

import java.util.List;

public class CitasServiceImpl implements CitaService {
    CitaRepository citaRepository;

    public CitasServiceImpl(CitaRepositoryMemory citaRepositoryMemory) {

    }

    @Override
    public void alta(Cita cita) {
        citaRepository.alta(cita);
    }
    @Override
    public void baja(int id){
        citaRepository.baja(id);
    }

    @Override
    public List<Cita> listar() {
        return null;
    }

}
