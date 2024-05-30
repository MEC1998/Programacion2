public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new IllegalArgumentException("El apellido no puede estar vacío.");
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni != null && !dni.isEmpty()) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("El DNI no puede estar vacío.");
        }
    }

    public String toString() {
        return "USUARIO\n-Nombre: " + nombre + "\n-Apellido: " + apellido + "\n-DNI: " + dni;
    }
}
