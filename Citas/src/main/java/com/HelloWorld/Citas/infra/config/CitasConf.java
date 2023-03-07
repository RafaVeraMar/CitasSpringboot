package com.HelloWorld.Citas.infra.config;

import com.HelloWorld.Citas.Repository.CitaRepository;
import com.HelloWorld.Citas.Repository.impl.CitaRepositoryMemory;
import com.HelloWorld.Citas.Service.CitaService;
import com.HelloWorld.Citas.Service.impl.CitasServiceImpl;
import com.HelloWorld.Citas.infra.console.ConsoleReader;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitasConf {
    @Bean
    CitaRepository getCitaRepository(){
        return new CitaRepositoryMemory();
    }

    @Bean
    CitaService getCitaService(){
        return new CitasServiceImpl(getCitaRepository());
    }
    @Bean
    ConsoleReader getConsoleReader(){
        return new ConsoleReader();
    }
}
