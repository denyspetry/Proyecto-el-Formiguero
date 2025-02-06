package org.example;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(){

    }

    public Cadena(String nombre){
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anyadirPrograma(Programa programa){
        listaProgramas.add(programa);
    }

    public void borrarPrograma(Programa programa){
        listaProgramas.remove(programa);
    }

    public ArrayList<Programa> getListaProgramas(){
        return listaProgramas;
    }

    @Override
    public String toString(){
        return "CADENA [Nombre = '" + nombre + "', Lista de Programas = '" + listaProgramas + "']";
    }
}
