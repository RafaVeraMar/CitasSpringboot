package com.HelloWorld.Citas.infra.console;

import com.HelloWorld.Citas.Models.Cita;
import com.HelloWorld.Citas.Service.CitaService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {
    CitaService citaService;
    SimpleDateFormat fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));
    public void init() {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        String entradaConsola;
        while (opcion != 0);
        System.out.println("Menu por consola");
        System.out.println("1.- Registrar nueva cita");
        System.out.println("2.- Modificar una cita");
        System.out.println("3.- Borrar una citas");
        System.out.println("4.- Listar todas las citas");
        System.out.println("0.- Salir");
        System.out.println("Ingrese la accion a realizar: ");
        entradaConsola = sc.next();
        try {
            opcion = Integer.parseInt(entradaConsola);

        } catch (Exception e){
            System.out.println("Opción no válida, ingresa un número");
        }
        switch (opcion){
            case 0:
                System.out.println("Hasta luego!!");
                break;
            case 1:
                System.out.println("Ingrese nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese apellidos");
                String apellidos = sc.next();
                System.out.println("ingrese fecha (dd-MM-YYYY HH:mm:ss");
                String fecha = sc.nextLine();

                Date fechaCita;
                try {
                    fechaCita = fechaFormateador.parse(fecha);
                    citaService.alta(new Cita(nombre, apellidos, fechaCita));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                break;

            case 2:

                //TODO Por desarrollar
                break;
            case 3:
                // TODO Por desarrollar
                break;
            case 4:
                List<Cita> citas = citaService.listar();
                System.out.println("Listado de citas");
                for (Cita cita : citas){
                    System.out.printf("Id %s, nombre: %s, apellidos: %s", citas.indexOf(citas), cita.getNombre(), cita.getApellidos(), fechaFormateador.format(cita));
                    System.out.println();
                            
                }
                break;
            default:
                System.out.println("Vete a tu casa");
                break;

        }
    }
}

