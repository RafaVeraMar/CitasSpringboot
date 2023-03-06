package com.HelloWorld.Citas;

import com.HelloWorld.Citas.Repository.impl.CitaRepositoryMemory;
import com.HelloWorld.Citas.Service.impl.CitasServiceImpl;
import com.HelloWorld.Citas.infra.console.ConsoleReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasApplication {
	public static void main(String[] args) {
		SpringApplication.run(CitasApplication.class, args);
		ConsoleReader consoleReader = new ConsoleReader(new CitasServiceImpl(new CitaRepositoryMemory()));
		consoleReader.init();
	}
}
