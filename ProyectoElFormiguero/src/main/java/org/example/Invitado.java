package org.example;

import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(){

    }

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = LocalDate.now();
    }


}
