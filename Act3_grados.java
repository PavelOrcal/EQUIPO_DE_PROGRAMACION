import java.util.Scanner;

public class Act3_grados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Seleccione la conversión deseada:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        int opcion = scanner.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = celsius * 9 / 5 + 32;
                System.out.println("La temperatura en Fahrenheit es: " + resultado);
                break;
            case 2:
                resultado = celsius + 273.15;
                System.out.println("La temperatura en Kelvin es: " + resultado);
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }
}
