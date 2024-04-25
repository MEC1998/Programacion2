package Asociacion_Bidireccional;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro 1");
        Libro libro2 = new Libro("Libro 2");

        Persona persona1 = new Persona("Persona 1");
        Persona persona2 = new Persona("Persona 2");
        Persona persona3 = new Persona("Persona 3");

        persona1.AgregarLibro(libro1);
        persona2.AgregarLibro(libro1);
        persona2.AgregarLibro(libro2);
        persona3.AgregarLibro(libro2);

        persona1.MostrarListaLibros();
        persona2.MostrarListaLibros();
        persona3.MostrarListaLibros();
    }
}
