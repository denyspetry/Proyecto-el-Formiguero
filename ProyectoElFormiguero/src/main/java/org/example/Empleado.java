package org.example;

public class Empleado {

    private static int contador = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(){

    }

    public Empleado(String nombre, String cargo, Empleado director){
        this.nombre = nombre;
        this.cargo = cargo;
        this.director = null;
        this.id = id;
    }
}
