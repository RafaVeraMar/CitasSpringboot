package com.HelloWorld.Citas.Service.impl;

import com.HelloWorld.Citas.Models.Cita;
import com.HelloWorld.Citas.Repository.CitaRepository;
import com.HelloWorld.Citas.Repository.impl.CitaRepositoryMemory;
import com.HelloWorld.Citas.Service.CitaService;

import java.util.List;

public class CitasServiceImpl implements CitaService {
    private CitaRepository citaRepository;

    public CitasServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
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
        return citaRepository.Listar();
    }

}
