import java.util.Random;
import java.util.Scanner;

public class Act4_adivinarnum {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int suposicion = 0;

        System.out.println("Adivina el número entre 1 y 100");

        while (suposicion != numeroAleatorio) {
            System.out.print("Ingrese su suposición: ");
            suposicion = scanner.nextInt();

            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! El número era " + numeroAleatorio);
            }
        }

        scanner.close();
    }
}
