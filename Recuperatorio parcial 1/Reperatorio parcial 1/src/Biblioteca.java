import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Prestable{
    private String nombre;
    private List<Libro> librosDisponibles;
    private List<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.librosDisponibles = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public class PrestamoException extends Exception {
        public PrestamoException(String mensaje) {
            super(mensaje);
        }
    }


    public void prestarLibro(Libro libro, Usuario usuario) throws PrestamoException, Prestamo.PrestamoException {
        prestarLibro(libro, usuario, "30/05/2024", "30/06/2024");
    }

    public void prestarLibro(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucion) throws PrestamoException, Prestamo.PrestamoException {
        if (!librosDisponibles.contains(libro)) {
            throw new PrestamoException("El libro \"" + libro.getTitulo() + "\" no está disponible.");
        }
        librosDisponibles.remove(libro);
        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion, libro, usuario);
        prestamos.add(prestamo);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido prestado a " + usuario.getNombre() + " " + usuario.getApellido() + " desde " + fechaPrestamo + " hasta " + fechaDevolucion + ".");
    }

    public void devolverLibro(Libro libro, Usuario usuario) throws PrestamoException {
        Prestamo prestamoAEliminar = null;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.getUsuario().equals(usuario)) {
                prestamoAEliminar = prestamo;
                break;
            }
        }
        if (prestamoAEliminar == null) {
            throw new PrestamoException("El libro \"" + libro.getTitulo() + "\" no estaba prestado.");
        }
        prestamos.remove(prestamoAEliminar);
        librosDisponibles.add(libro);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido devuelto por " + usuario.getNombre() + " " + usuario.getApellido() + ".");
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca \"" + nombre + "\": ");
        if (!librosDisponibles.isEmpty()) {
            for (Libro libro : librosDisponibles) {
                System.out.println(libro);
            }
        } else {
            System.out.println("No hay libros disponibles en la biblioteca.");
        }
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados en la biblioteca \"" + nombre + "\": ");
        if (!prestamos.isEmpty()) {
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
            }
        } else {
            System.out.println("No hay libros prestados en la biblioteca.");
        }
    }
}
