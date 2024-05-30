public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;

    public class LibroException extends Exception {
        public LibroException(String mensaje) {
            super(mensaje);
        }
    }

    public Libro(String titulo, String autor, int anioPublicacion, String genero) throws LibroException {
        if (titulo == null || titulo.isEmpty()) {
            throw new LibroException("El título del libro no puede estar vacío.");
        }
        if (autor == null || autor.isEmpty()) {
            throw new LibroException("El autor del libro no puede estar vacío.");
        }
        if (anioPublicacion <= 0) {
            throw new LibroException("El año de publicación del libro debe ser un valor positivo.");
        }
        if (genero == null || genero.isEmpty()) {
            throw new LibroException("El género del libro no puede estar vacío.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "LIBRO:\n-Título: " + titulo + "\n-Autor: " + autor + "\n-Año de publicación: " + anioPublicacion + "\n-Género: " + genero;
    }
}
