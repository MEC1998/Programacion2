import java.util.Scanner;

public class Ejercicio_2 {
    public static boolean esPrimo(int numero){
        if (numero <= 0){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero para la posicion "+ (i+1) +":");
            numeros[i] = sc.nextInt();
        }

        int mayorPrimo = -1;
        int posicionMayorPrimo = -1;

        for (int i = 0; i < 10; i++){
            if (esPrimo(numeros[i]) && numeros[i] > mayorPrimo){
                mayorPrimo = numeros[i];
                posicionMayorPrimo = i;
            }
        }
        if (posicionMayorPrimo != -1){
            System.out.println("El primo mayor es "+mayorPrimo+" y se encuentra en la posicion "+(posicionMayorPrimo+1+"."));
        } else {
            System.out.println("No se encontraron numeros primos en el arreglo.");
        }
    }
}
