package Ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random()*100)+1;
        int attempts = 0;

        System.out.println("¡Bienvenido a Adivina el Número!\nIntenta adivinar un número entre 1 y 100.");

        while (true){
            try{
                System.out.println("¿Que número crees que saldrá?: ");
                int attempt = scanner.nextInt();
                attempts++;

                if (attempt == num){
                    System.out.println("¡Felicitaciones!¡Has adivinado el número en "+attempts+" intentos!");
                    break;
                } else if (attempt<num) {
                    System.out.println("El número que tienes que adivinar es mayor que "+attempt);
                }else{
                    System.out.println("El número que tienes que adivinar es menor que "+attempt);
                }
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduce un número válido (número entero, entre 1 y 100)");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}