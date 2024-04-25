package Asociacion_Unidireccional;

public class Universidad {
    private String nombre;
    private static int contador = 0;
    private int id;
    public Universidad(String nombre) {
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

    public int getId() {
        return id;
    }
    public void CambiarUniversidad(String nuevaUniversidad){
        setNombre(nuevaUniversidad);
    }

    public void CrearUniversidad(String nombre){
        new Universidad(nombre);
    }

    public String VerUniversidad(){
        return ("Id Universidad: "+ getId() +
                "\r\nUniversidad: " + this.nombre);
    }
}
