import java.util.Scanner;

public class GenerarsecuenciaCuadrado {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = a.nextInt();

        if (numero <= 0) {
            System.out.println("Debe ingresar un número entero positivo.");
        } else {
            int i = 1;
            do {
                int cuadrado = i * i;
                System.out.println("El cuadrado de " + i + " es: " + cuadrado);
                i++;
            } while (i <= numero);
        }

        a.close();
    }
}
