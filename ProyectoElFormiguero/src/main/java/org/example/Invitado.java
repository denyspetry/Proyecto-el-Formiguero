package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    // Definición de los atributos private para la Clase Invitado
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    // Constructor Vacío
    public Invitado(){

    }

    // Constructor parametrizado de la Clase Invitado
    public Invitado(String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = introduceFechaVisita();
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la Profesión
    public String getProfesion() {
        return profesion;
    }

    // Setter para la Profesión
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Getter para la fecha de la visita
    public LocalDate getFechaVisita() {
        return fecha_visita;
    }

    // Primer métod para Settear la fecha de la visita, si se encontraba vacía se deficía la fecha de la visita al día de creación del Objeto Invitado
    public void setFechaVisita(LocalDate fecha_visita) {
        this.fecha_visita = comprobarFechaVisita(fecha_visita);
    }

    // Métod para comprobar que la fecha introducida sea correcta
    public LocalDate comprobarFechaVisita(LocalDate fechaVisita) {
        if (fechaVisita != null) {
            return fechaVisita;
        } else {
            return LocalDate.now();
        }
    }

    // Métod para introducir pedir al usuario que introduzca una serie de números y guardarlos en nuestro atríbuto del Objeto como fecha
    public LocalDate introduceFechaVisita() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el año de la visita: ");
        int anyo = entrada.nextInt();

        System.out.print("Introduce el mes de la visita: ");
        int mes = entrada.nextInt();

        System.out.print("Introduce el día de la visita: ");
        int dia = entrada.nextInt();

        LocalDate fecha = LocalDate.of(anyo, mes, dia); // Mediante LocalDate.of asignamos los valores que le hemos pedido al usuario como año, mes y dia
        return fecha; // Devolvemos la fecha al constructor
    }

    // Getter para temporada
    public int getTemporada() {
        return temporada;
    }

    // Setter para temporada
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    // Override para sobreescribir la impresión de un Objeto de la Clase Invitado
    @Override
    public String toString(){
        return "INVITADO [ Nombre = '" + nombre + "', Profesión = '" + profesion + "', Temporada = '" + temporada + "', Fecha Visita = '" + fecha_visita + "']";
    }
}
