import java.util.Scanner;

/**
 * 
 * @author Pavel
 */
public class CalcularFactorial {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número para calcular su factorial: ");
            int numero = scanner.nextInt();

            long factorial = calcularFactorial(numero);

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }

    private static long calcularFactorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}