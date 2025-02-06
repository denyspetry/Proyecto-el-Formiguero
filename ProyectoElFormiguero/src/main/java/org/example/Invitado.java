package org.example;

import java.time.LocalDate;
import java.util.Scanner;

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
        this.fecha_visita = introduceFechaVisita();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFechaVisita() {
        return fecha_visita;
    }

    public void setFechaVisita(LocalDate fecha_visita) {
        this.fecha_visita = comprobarFechaVisita(fecha_visita);
    }

    public LocalDate comprobarFechaVisita(LocalDate fechaVisita) {
        if (fechaVisita != null) {
            return fechaVisita;
        } else {
            return LocalDate.now();
        }
    }

    public LocalDate introduceFechaVisita() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el año de la visita: ");
        int anyo = entrada.nextInt();

        System.out.print("Introduce el mes de la visita: ");
        int mes = entrada.nextInt();

        System.out.print("Introduce el día de la visita: ");
        int dia = entrada.nextInt();

        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        return fecha;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString(){
        return "INVITADO [ Nombre = '" + nombre + "', Profesión = '" + profesion + "', Temporada = '" + temporada + "', Fecha Visita = '" + fecha_visita + "']";
    }
}
