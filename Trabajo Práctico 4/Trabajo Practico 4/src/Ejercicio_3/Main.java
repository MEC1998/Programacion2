package Ejercicio_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validData = false;
        do {
            try {
                System.out.println("Ingrese el valor de la base del triángulo: ");
                double base = scanner.nextDouble();

                System.out.println("Ingrese el valor de la altura del triángulo: ");
                double height = scanner.nextDouble();

                if (base<=0 || height<=0){
                    throw new IllegalArgumentException("La base y la altura deben ser valores positivos");
                }

                Triangle triangle = new Triangle(base, height);
                double area = triangle.calculateArea();

                System.out.println("El area del triángulo es: "+ area);
                validData =true;
            } catch (InputMismatchException e){
                System.out.println("¡ERROR! Ingrese un número válido");
                scanner.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println("¡ERROR! "+ e.getMessage());
            }
        } while (!validData);
        scanner.close();
    }
}