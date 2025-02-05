package org.example;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director = null;

    public Programa(){

    }

    public Programa(String nombre, Cadena cadena, int temporadas, Empleado director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.director = director;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
    }
}
