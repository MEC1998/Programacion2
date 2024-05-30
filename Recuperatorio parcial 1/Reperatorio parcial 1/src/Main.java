import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UTN");
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("Iniciando Sistema de " + biblioteca.getNombre() + ". Selecciones una opción del menú: \n1-Agregar libro\n2-Agregar usuario\n3-Prestar libro\n4-Devolver libro\n5-Mostrar libros disponibles\n6-Mostrar libros prestados\n7-Salir\nSeleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        agregarLibro(biblioteca, scanner);
                        break;
                    case 2:
                        agregarUsuario(scanner);
                        break;
                    case 3:
                        prestarLibro(biblioteca, scanner);
                        break;
                    case 4:
                        devolverLibro(biblioteca, scanner);
                        break;
                    case 5:
                        biblioteca.mostrarLibrosDisponibles();
                        break;
                    case 6:
                        biblioteca.mostrarLibrosPrestados();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("¡ERROR! Ocurrió un error: " + e.getMessage());
            }
        }
    }

    private static void agregarLibro(Biblioteca biblioteca, Scanner scanner) {
        try {
            System.out.println("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.println("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.println("Ingrese el año de publicación del libro: ");
            int anioPublicacion = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el género del libro: ");
            String genero = scanner.nextLine();
            Libro libro = new Libro(titulo, autor, anioPublicacion, genero);
            biblioteca.agregarLibro(libro);
            System.out.println("Libro agregado correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida para el año de publicación. Por favor, ingrese un número.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("¡ERROR! Ocurrió un error al agregar el libro: " + e.getMessage());
        }
    }

    private static void agregarUsuario(Scanner scanner) {
        try {
            System.out.println("Ingrese el nombre del usuario: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del usuario: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el DNI del usuario: ");
            String dni = scanner.nextLine();
            Usuario usuario = new Usuario(nombre, apellido, dni);
            usuarios.add(usuario);
            System.out.println("Usuario agregado correctamente.");
        } catch (Exception e) {
            System.out.println("¡ERROR! Ocurrió un error al agregar el usuario: " + e.getMessage());
        }
    }

    private static Usuario buscarUsuario(Scanner scanner) {
        try {
            System.out.println("Ingrese el DNI del usuario: ");
            String dni = scanner.nextLine();
            for (Usuario usuario : usuarios) {
                if (usuario.getDni().equals(dni)) {
                    return usuario;
                }
            }
            System.out.println("Usuario no encontrado.");
        } catch (Exception e) {
            System.out.println("¡ERROR! Ocurrió un error al buscar el usuario: " + e.getMessage());
        }
        return null;
    }

    private static Libro buscarLibroPorTitulo(Biblioteca biblioteca, Scanner scanner) {
        try {
            System.out.println("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            for (Libro libro : biblioteca.getLibrosDisponibles()) {
                if (libro.getTitulo().equals(titulo)) {
                    return libro;
                }
            }
            System.out.println("Libro no encontrado.");
        } catch (Exception e) {
            System.out.println("¡ERROR! Ocurrió un error al buscar el libro: " + e.getMessage());
        }
        return null;
    }

    private static void prestarLibro(Biblioteca biblioteca, Scanner scanner) {
        try {
            Usuario usuario = buscarUsuario(scanner);
            if (usuario != null) {
                Libro libro = buscarLibroPorTitulo(biblioteca, scanner);
                if (libro != null) {
                    System.out.print("Ingrese la fecha de préstamo (Día, Mes, Año): ");
                    String fechaPrestamo = scanner.nextLine();
                    System.out.print("Ingrese la fecha de devolución (Día, Mes, Año): ");
                    String fechaDevolucion = scanner.nextLine();
                    biblioteca.prestarLibro(libro, usuario, fechaPrestamo, fechaDevolucion);
                }
            }
        } catch (Exception e) {
            System.out.println("¡ERROR! Ocurrió un error al prestar el libro: " + e.getMessage());
        }
    }

    private static void devolverLibro(Biblioteca biblioteca, Scanner scanner) {
        try {
            Usuario usuario = buscarUsuario(scanner);
            if (usuario != null) {
                System.out.print("Ingrese el título del libro a devolver: ");
                String titulo = scanner.nextLine();
                for (Prestamo prestamo : biblioteca.getPrestamos()) {
                    if (prestamo.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
                        biblioteca.devolverLibro(prestamo.getLibro(), usuario);
                        return;
                    }
                }
                System.out.println("El libro no está prestado.");
            }
        } catch (Exception e) {
            System.out.println("¡ERROR! Ocurrió un error al devolver el libro: " + e.getMessage());
        }
    }
}
