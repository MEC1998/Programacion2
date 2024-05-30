public interface Prestable {
    void prestarLibro(Libro libro, Usuario usuario) throws Biblioteca.PrestamoException, Prestamo.PrestamoException;
    void devolverLibro(Libro libro, Usuario usuario) throws Biblioteca.PrestamoException;
}