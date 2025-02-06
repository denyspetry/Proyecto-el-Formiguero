package org.example;

public class Empleado {
    // Creación de una variable contador para que pueda ser correctamente llamada y actualizada desde fuera de la Clase
    private static int contador = 0;
    private static final String EP = "EP";
    private static final String CARGO_DEF = "pte";
    // Creación de dos variables globales de tipo String

    // Definición de las variables de la Clase Empleado
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    // Constructor vacío
    public Empleado(){

    }

    // Constructor parametrizado
    public Empleado(String nombre, String cargo){
        this.nombre = nombre; // Asignación de nombre al nombre del Objeto
        setCargo(cargo); // Asignación de cargo
        setDirector(); // Si el cargo es director asignará a director null
        setId(); // Genera un ID automáticamente
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el Cargo
    public String getCargo() {
        return cargo;
    }

    // Setter para el cargo
    public void setCargo(String cargo) {
        this.cargo = comprobarCargo(cargo); // Métod para comprobar que el cargo introducido sea correcto
    }

    // Si el cargo introducido coincide con cualquiera de nuestras opciones lo daremos como válido, si no asignaremos a cargo el valor de la constante CARGO_DEF
    private String comprobarCargo(String cargo) {
        if (cargo.equalsIgnoreCase("director") ||
                cargo.equalsIgnoreCase("técnico") || cargo.equalsIgnoreCase("presentador")
                || cargo.equalsIgnoreCase("colaborador")) {
            return cargo;
        } else {
            return CARGO_DEF;
        }
    }

    // Getter para el ID
    public String getId() {
        return id;
    }

    // Setter para el ID Private, ya que no nos interesa que se pueda llamar desde fuera de la clase
    private void setId() {
        this.id = generarID(); // Este ID llama a generarID();
    }

    // Métod privado para generar ID, lo devolverá en forma de String al métod setID()
    private String generarID(){
        contador++; // Actualizamos la variable contador global, cada vez que llamemos a este métod
        if (contador > 0 && contador < 10){
            return EP + "00" + Integer.toString(contador);
        } else if (contador >= 10 && contador < 100) {
            return EP + "0" + Integer.toString(contador);
        } else {
         return EP + Integer.toString(contador);
        }
        // Si el contador se encuentra entre 0 y 10 sin incluir ambos, el ID será EP00 + X
        // Si el contador se encuentra entre 10 y 99 ambos inclusive, el ID será EP0 + XX
        // Si el contador es mayor a 100, el ID será EP + XXX
    }

    // Getter para obtener el director
    public Empleado getDirector() {
        return director;
    }

    // Setter para director, comprobamos antes que no este incluído en el cargo del objeto, en cuyo caso tendría que ser null
    public void setDirector() {
        if (this.cargo.equalsIgnoreCase("director")) {
            this.director = null;
        }
    }

    // Override para sobreescribir la impresión de un Objeto de la Clase Empleado
    @Override
    public String toString(){
        return "EMPLEADO [ Nombre = '" + nombre + "', ID = '" + id + "', Cargo = '" + cargo + "', Director = '" + director + "']";
    }
}
