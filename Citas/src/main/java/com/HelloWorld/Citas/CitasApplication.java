package com.HelloWorld.Citas;

import com.HelloWorld.Citas.Repository.impl.CitaRepositoryMemory;
import com.HelloWorld.Citas.Service.impl.CitasServiceImpl;
import com.HelloWorld.Citas.infra.console.ConsoleReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitasApplication.class, args);

	}
}
