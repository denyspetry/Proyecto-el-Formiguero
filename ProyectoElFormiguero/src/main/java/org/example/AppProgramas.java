package org.example;

public class AppProgramas {
    public static void main(String[] args) {
        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3, new Empleado("Jose","director"));
        System.out.println(el_hormiguero);
        System.out.println(antena3);
        //insertamos empleados en el programa
        el_hormiguero.anyadirEmpleado(new Empleado("Pablo Motos","presentador"));
        System.out.println(el_hormiguero);
        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        //insertamos invitados en el programa
        el_hormiguero.anyadirInvitado(new Invitado("Aitana","Cantante", 1));
        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());

    }
}
