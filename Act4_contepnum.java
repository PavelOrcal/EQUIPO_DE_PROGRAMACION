import java.util.Scanner;

public class Act4_contepnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que va a ingresar: ");
        int cantidad = scanner.nextInt();

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }

        System.out.println("Números mayores que 0: " + mayoresQueCero);
        System.out.println("Números menores que 0: " + menoresQueCero);
        System.out.println("Números iguales a 0: " + igualesACero);

        scanner.close();
    }
}
