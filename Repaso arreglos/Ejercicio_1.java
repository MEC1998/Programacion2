import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero para la posicion "+(i+1)+": ");
            nums[i] = sc.nextInt();
        }

        int mayor = nums[0];
        int posicionMayor = 0;
        for (int i = 0; i < 10; i++) {
            if (mayor < nums[i]) {
                mayor = nums[i];
                posicionMayor = i;
            }
        }
        System.out.println("El mayor numero ingresado es "+mayor+" y se ingreso en la posicion "+posicionMayor+1);
    }
}
