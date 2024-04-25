import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero para la posicion " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int repeticionesMayor = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == mayor) {
                repeticionesMayor++;
            }
        }

        System.out.println("El mayor numero es " + mayor + " y se repite " + repeticionesMayor + " veces en el arreglo.");
    }
}


