package org.example;

import java.util.ArrayList;

public class Programa {
    private final int TEMPORADAS_DEF = 0; // Constante para Temporadas por defecto establecido en 0

    // Creación de los atributos de tipo private de la clase Programa
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados; // Definición de dos listas, una para la clase Empleado y otra para la clase Invitado
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    // Constructor vacío
    public Programa(){

    }

    // Constructor parametrizado de la Clase Programa
    public Programa(String nombre, Cadena cadena, Empleado director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = TEMPORADAS_DEF;
        this.director = director;
        this.listaEmpleados = new ArrayList<>(); // Cuando se instancia un nuevo objeto de la Clase Programa se crea una nueva lista de Empleados e Invitados
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados.add(director); // Cada vez que se instancia un nuevo objeto añadimos al director automáticamente a la lista de Empleados creada
    }

    // Getter para el nombre
    public String getNombre(){
        return nombre;
    }

    // Getter para la cadena
    public Cadena getCadena(){
        return cadena;
    }

    // Getter para las temporadas
    public int getTemporadas(){
        return temporadas;
    }

    // Getter para el director
    public Empleado getDirector(){
        return director;
    }

    // Getter para la lista de Empleados
    public ArrayList<Empleado> getListaEmpleados(){
        return listaEmpleados;
    }

    // Getter para la lista de Invitados
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para la cadena
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    // Setter para las temporadas
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // Setter para el director
    public void setDirector(Empleado director) {
        this.director = director;
    }

    // Métod para añadir un empleado a la lista de Empleados
    public void anyadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    // Métod para borrar un empleado de la lista de Empleados
    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    // Métod para añadir un invitado a la lista de Invitados
    public void anyadirInvitado(Invitado invitado){
        listaInvitados.add(invitado);
    }

    // Métod para borrar un invitado de la lista de Invitados
    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    // Métod para mostrar el número de invitados que han acudido a una temporada y a cada uno de ellos
    public void invitadosTemporada(int temporada) {
        int contador = 0; // Definimos una variable contador para contar a los empleados
        System.out.println("Los invitados que han acudido a la " + temporada + "son :");
        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                contador++;
                System.out.println("Nombre: '" + invitado.getNombre() + "', Profesión: '" + invitado.getProfesion() + "'");
            }
            // Recorremos la lista de Invitados comprobando si sus temporadas coinciden con la que buscamos, y si coinciden, lo imprimimos y actualizampos el contador
        }
        System.out.println("El número total de Invitados ha sido: " + contador);
    }

    // Métod parecido al anterior que muestra el número de veces que ha acudido un invitado a nuestro programa
    public int vecesInvitado(String nombre) {
        int contador = 0; // Variable contador
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
            // Bucle para recorrer nuestra lista de invitados y si se encuentra se actualiza el contador y posteriormente se devuelve
        }
        return contador;
    }

    // Métod para mostrar el número de veces que ha asistido un invitado al programa a partir del métod anterior,
    // solo que en este mostramos también la fecha de la visita y la temporada en la que ha venido
    public void rastrearInvitado(String nombre) {
        int vecesQueHaIdo = vecesInvitado(nombre);
        System.out.println("El invitado " + nombre + " ha asistido " + vecesQueHaIdo + " veces al programa:");
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Fecha de visita: '" + invitado.getFechaVisita() + "', Temporada: '" + invitado.getTemporada() + "'");
            }
        }
    }

    // Métod booleano para comprobar si un invitado está en nuestra lista de invitados o no
    public boolean buscarInvitado(String nombre) {
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }// Recorremos el bucle y si se encuentra su nombre se devuelve true y si no se devuelve false
        return false;
    }

    // Override para sobreescribir la impresión de un Objeto de la Clase Programa
    @Override
    public String toString(){
        return "PROGRAMA [Nombre = '" + nombre + "', Cadena = '" + cadena.getNombre() +
                "', Director = '" + director.getNombre() + "', Temporadas = '" + temporadas +
                "', Lista de Empleados = '" + listaEmpleados + "', Lista de Invitados = '" + listaInvitados + "']";
    }
}
