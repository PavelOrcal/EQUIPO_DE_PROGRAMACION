import java.util.Scanner;

/**
 * 
 * @author Pavel
 */
public class ContadorDeDigitos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            int cantidadDeDigitos = contarDigitos(numero);

            System.out.println("El número " + numero + " tiene " + cantidadDeDigitos + " dígitos.");
        }
    }

    private static int contarDigitos(int numero) {
        int cantidadDeDigitos = 0;
        if (numero == 0) {
            return 1; // El número 0 tiene un dígito
        }
        while (numero != 0) {
            numero /= 10;
            cantidadDeDigitos++;
        }
        return cantidadDeDigitos;
    }
}
