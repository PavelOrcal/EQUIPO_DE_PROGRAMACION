import java.util.Scanner;

public class Act2_promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        double promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio de los tres números es: " + promedio);

        scanner.close();
    }
}
