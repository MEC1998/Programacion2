public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

    public class PrestamoException extends Exception {
        public PrestamoException(String mensaje) {
            super(mensaje);
        }
    }

    public Prestamo(String fechaPrestamo, String fechaDevolucion, Libro libro, Usuario usuario) throws PrestamoException {
        if (fechaPrestamo == null || fechaPrestamo.isEmpty() || fechaDevolucion == null || fechaDevolucion.isEmpty()) {
            throw new PrestamoException("Las fechas de préstamo y devolución no pueden estar vacías.");
        }
        if (libro == null) {
            throw new PrestamoException("El libro del préstamo no puede ser nulo.");
        }
        if (usuario == null) {
            throw new PrestamoException("El usuario del préstamo no puede ser nulo.");
        }
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String toString() {
        return "PRESTAMO: \n-Usuario: " + usuario + "\n-Libro: " + libro + "\n-Fecha de Préstamo: " + fechaPrestamo + "\n-Fecha de Devolución: " + fechaDevolucion;
    }
}
