package org.example;

public class Empleado {

    private static int contador = 0;
    private static final String EP = "EP";
    private static final String CARGO_DEF = "pte";

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(){

    }

    public Empleado(String nombre, String cargo){
        this.nombre = nombre;
        setCargo(cargo);
        setDirector(this.cargo);
        setId();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = comprobarCargo(cargo);
    }

    private String comprobarCargo(String cargo) {
        if (cargo.equalsIgnoreCase("director") || cargo.equalsIgnoreCase("técnico") || cargo.equalsIgnoreCase("presentador") || cargo.equalsIgnoreCase("colaborador")) {
            return cargo;
        } else {
            return CARGO_DEF;
        }
    }

    public String getId() {
        return id;
    }

    private void setId() {
        this.id = generarID();
    }

    private String generarID(){
        contador++;
        if (contador > 0 && contador < 10){
            return EP + "00" + Integer.toString(contador);
        } else if (contador >= 10 && contador < 100) {
            return EP + "0" + Integer.toString(contador);
        } else {
         return EP + Integer.toString(contador);
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(String cargo) {
        this.director = comprobarDirector(cargo);
    }

    private Empleado comprobarDirector(String cargo) {
        if (cargo.equals("director")) {
            return null;
        } else {
            return director;
        }
    }

    @Override
    public String toString(){
        return "EMPLEADO [ Nombre = '" + nombre + "', ID = '" + id + "', Cargo = '" + cargo + "', Director = '" + director + "']";
    }
}
