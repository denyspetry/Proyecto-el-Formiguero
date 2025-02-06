package org.example;

import java.util.ArrayList;

public class Programa {
    private final int TEMPORADAS_DEF = 0;

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(){

    }

    public Programa(String nombre, Cadena cadena, Empleado director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = TEMPORADAS_DEF;
        this.director = director;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados.add(director);
    }

    public String getNombre(){
        return nombre;
    }

    public Cadena getCadena(){
        return cadena;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public Empleado getDirector(){
        return director;
    }

    public ArrayList<Empleado> getListaEmpleados(){
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public void anyadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    public void anyadirInvitado(Invitado invitado){
        listaInvitados.add(invitado);
    }

    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    public void invitadosTemporada(int temporada) {
        int contador = 0;
        System.out.println("Los invitados que han acudido a la " + temporada + "son :");
        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                contador++;
                System.out.println("Nombre: '" + invitado.getNombre() + "', Profesión: '" + invitado.getProfesion() + "'");
            }
        }
        System.out.println("El número total de Invitados ha sido: " + contador);
    }

    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
        }
        return contador;
    }

    public void rastrearInvitado(String nombre) {
        int vecesQueHaIdo = vecesInvitado(nombre);
        System.out.println("El invitado " + nombre + " ha asistido " + vecesQueHaIdo + " veces al programa:");
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Fecha de visita: '" + invitado.getFechaVisita() + "', Temporada: '" + invitado.getTemporada() + "'");
            }
        }
    }

    public boolean buscarInvitado(String nombre) {
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "PROGRAMA [Nombre = '" + nombre + "', Cadena = '" + cadena.getNombre() +
                "', Director = '" + director.getNombre() + "', Temporadas = '" + temporadas +
                "', Lista de Empleados = '" + listaEmpleados + "', Lista de Invitados = '" + listaInvitados + "']";
    }
}
