public class Ejercicio_3 {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] primos = new int[10];
        int contador = 0;

        for (int i = 100; i <= 300; i++) {
            if (esPrimo(i)) {
                primos[contador++] = i;
                if (contador == 10) {
                    break;
                }
            }
        }
        System.out.println("Los 10 numeros primos entre 100 y 300 son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}

