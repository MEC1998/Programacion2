package Ejercicio_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private static final Scanner scanner=new Scanner(System.in);
    private static final List<Student> studentsList= new ArrayList<>();

    public static void main(String[] args){
        boolean proceed = true;
        while(proceed){
            showMenu();
            int option=scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudentsList();
                    break;
                case 3:
                    showMeanQualifications();
                    break;
                case 4:
                    showStudentHighestQualification();
                    break;
                case 5:
                    searchStudentByName();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    proceed=false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor selecciones una opción válida del menú.");
            }
        }
    }

    private static void showMenu(){
        System.out.println("\nMENÚ\n1-Agregar nuevo alumno\n2-Mostrar lista de alumnos\n3-Calcular y mostrar la media de notas\n4-Mostrar alumno con la nota mas alta\n5-Buscar alumno por nombre\n6-Salir\n Seleccione una opción: ");
    }

    private static void addStudent(){
        System.out.println("\nAGREGAR NUEVO ALUMNO");
        try {
            System.out.println("\nIngrese el nombre del alumno: ");
            String name = scanner.nextLine();
            System.out.println("Ingrese la edad del alumno: ");
            int age = scanner.nextInt();
            System.out.println("Ingrese la nota del alumno: ");
            double qualification = scanner.nextDouble();


            studentsList.add(new Student(name, age, qualification));
            System.out.println("Alumno agregado correctamente.");
        }catch (InputMismatchException e){
            System.out.println("¡ERROR! Ingrese una entrada válida.");
            scanner.nextLine();
        }catch (IllegalArgumentException e){
            System.out.println("¡ERROR! "+e.getMessage());
        }
    }

    private static void showStudentsList(){
        System.out.println("\nLISTA DE ALUMNOS");
        if (studentsList.isEmpty()){
            System.out.println("No hay alumnos en la lista");
        }else{
            for (Student student:studentsList){
                System.out.println(student);
            }
        }
    }

    private static void showMeanQualifications(){
        System.out.println("\nMEDIA DE NOTAS");
        if (studentsList.isEmpty()){
            System.out.println("No hay alumnos en la lista");
        }else{
            double addQualifications=0;
            for (Student student: studentsList){
                addQualifications+= student.getQualification();
            }
            double mean = addQualifications/studentsList.size();
            System.out.println("La media de notas de todos los alumnos es: "+mean);
        }
    }

    private static void showStudentHighestQualification(){
        System.out.println("\nALUMNO CON LA NOTA MAS ALTA");
        if (studentsList.isEmpty()){
            System.out.println("No hay alumnos en la lista");
        }else{
            Student studentHighestQualification= studentsList.get(0);
            for (Student student:studentsList){
                if (student.getQualification()>studentHighestQualification.getQualification()){
                    studentHighestQualification=student;
                }
            }
            System.out.println("El alumno con la nota más alta es: "+studentHighestQualification);
        }
    }

    private static void searchStudentByName(){
        System.out.println("\nBUSCAR ALUMNO POR NOMBRE");
        if (studentsList.isEmpty()){
            System.out.println("No hay alumnos en la lista");
        }else{
            System.out.println("Ingrese el nombre del alumno a buscar: ");
            String searchName=scanner.nextLine();

            boolean founded = false;
            for (Student student: studentsList){
                if (student.getName().equalsIgnoreCase(searchName)){
                    System.out.println("Información del alumno encontrado: \n"+"Nombre: "+student.getName()+"\nEdad: "+student.getAge()+"\nNota: "+student.getQualification());
                    founded=true;
                    break;
                }
            }

            if (!founded){
                System.out.println("No se encontró ningún alumno con el nombre \""+searchName+"\"");
            }
        }
    }
}
