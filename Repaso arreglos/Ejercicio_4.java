import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero para la posicion " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
        }

        System.out.print("Los numeros terminados en 4 se encuentran en las posiciones: ");
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 10 == 4) {
                    System.out.print((i + 1) + " ");
                    encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.print("No se encontraron numeros terminados en 4.");
        }
    }
}


