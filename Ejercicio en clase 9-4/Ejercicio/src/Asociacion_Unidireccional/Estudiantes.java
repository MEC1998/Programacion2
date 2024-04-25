package Asociacion_Unidireccional;

public class Estudiantes {
    private String nombre;
    public Universidad  universidad;
    private static int contador = 0;
    private int id;

    public Estudiantes(String nombre) {
        this.nombre = nombre;
        contador ++;
        id = contador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public int getId() {
        return id;
    }
    public void CrearEstudiantes (String nombre){
        new Estudiantes(nombre);
    }
}
