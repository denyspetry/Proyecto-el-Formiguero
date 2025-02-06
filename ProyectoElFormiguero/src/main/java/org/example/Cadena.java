package org.example;

import java.util.ArrayList;

public class Cadena {
    // Definición de los atributos private de tipo String y de tipo ArrayList de Programa
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    //Constructor vacío
    public Cadena(){

    }

    // Constructor parametrizado
    public Cadena(String nombre){
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    // Creación de los métodos para definir y para obtener el nombre de la clase Cadena
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métod para añadir un nuevo programa a la lista de programas
    public void anyadirPrograma(Programa programa){
        listaProgramas.add(programa);
    }
    // Métod para borrar un programa de la lista de programas
    public void borrarPrograma(Programa programa){
        listaProgramas.remove(programa);
    }
    // Métod para mostrar la lista de los programas que contiene la Clase Cadena
    public ArrayList<Programa> getListaProgramas(){
        return listaProgramas;
    }

    // Override para sobreescribir la impresión de un Objeto de la Clase Cadena
    @Override
    public String toString(){
        return "CADENA [Nombre = '" + nombre + "', Lista de Programas = '" + listaProgramas + "']";
    }
}
