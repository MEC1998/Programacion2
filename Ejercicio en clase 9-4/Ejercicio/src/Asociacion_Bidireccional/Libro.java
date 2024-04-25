package Asociacion_Bidireccional;
import java.util.ArrayList;
import java.util.List;
public class Libro {

    private List<Persona> propietarios = new ArrayList<>();
    private String titulo;
    private static int contador = 0;
    private int id;

    public Libro(String titulo) {
        this.titulo = titulo;
        contador++;
        id = contador;
    }
    public List<Persona> getPropietarios() {
        return propietarios;
    }
    public void setPropietarios(List<Persona> propietarios) {
        this.propietarios = propietarios;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void CrearLibro(String titulo){
        new Libro(titulo);
    }

    public void MostrarListaPersonas(){
        System.out.println("Propietarios:");
        for (Persona persona:propietarios) {
            System.out.println("-" + persona.getNombre() + ".");
        }
    }
}
