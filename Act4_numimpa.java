import java.util.Scanner;

public class Act4_numimpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int i = 1;
        System.out.println("Números impares desde 1 hasta " + numero + ":");

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        scanner.close();
    }
}