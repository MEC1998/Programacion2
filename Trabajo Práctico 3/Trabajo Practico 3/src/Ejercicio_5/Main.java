package Ejercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ListTask listTask = new ListTask();

        boolean proceed = true;
        while (proceed){
            System.out.println("\nMENÚ\n1-Agregar una nueva tarea\n2-Mostrar todas las tareas\n3-Eliminar una tarea\n4-Salir\nSeleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Ingrese la descripción de la tarea: ");
                    String description = scanner.nextLine();
                    System.out.println("Ingrese la prioridad de la tarea: ");
                    int priority = scanner.nextInt();
                    listTask.addTask(new Task(description, priority));
                    break;
                case 2:
                    System.out.println("\nLISTA DE TAREAS");
                    for (Task task:listTask){
                        System.out.println(task);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la descripción de la tarea a eliminar: ");
                    String deleteDescription = scanner.nextLine();
                    listTask.removeTask(deleteDescription);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    proceed = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciones una opción válida del menú");
            }
        }
        scanner.close();
    }
}
