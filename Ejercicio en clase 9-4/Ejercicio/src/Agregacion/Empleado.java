package Agregacion;

public class Empleado {

    private String cargo;
    private String nombre;
    private static int contador = 0;
    private int id;

    public Empleado(String cargo, String nombre) {
        this.cargo = cargo;
        this.nombre = nombre;
        contador ++;
        id = contador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void CrearEmpleado(String cargo, String nombre){
        new Empleado(cargo,nombre);
    }
}
