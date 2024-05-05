import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operation;
        boolean validData = false;

        do {
            try{
                System.out.println("Ingrese el primer número: ");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();

                System.out.println("Ingrese que operación desea realizar (+, -, *, /");
                operation = scanner.next().charAt(0);

                double result = 0;

                switch (operation){
                    case '+':
                        result = num1+num2;
                        validData = true;
                        break;
                    case '-':
                        result = num1-num2;
                        validData = true;
                        break;
                    case '*':
                        result = num1*num2;
                        validData = true;
                        break;
                    case '/':
                        if (num2 == 0){
                            throw new ArithmeticException("¡ERROR! No se puede dividir por cero");
                        }
                        result = num1/num2;
                        validData = true;
                        break;
                    default:
                        throw new IllegalArgumentException("¡ERROR! Operación no válida");
                }

                System.out.println("El resultado de la operación es: "+ result);
            }catch (InputMismatchException e){
                System.out.println("¡ERROR! Ingrese un número válido");
                scanner.nextLine();
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }while (!validData);

        scanner.close();
    }
}