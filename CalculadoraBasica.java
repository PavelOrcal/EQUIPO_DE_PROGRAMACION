import java.util.Scanner;

/**
 * 
 * @author Pavel
 */
public class CalculadoraBasica {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                System.out.println("Seleccione una operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Ingrese su opción: ");
                int opcion = scanner.nextInt();

                if (opcion == 5) {
                    continuar = false;
                    System.out.println("Saliendo de la calculadora.");
                    break;
                }

                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (num1 + num2));
                    case 2 -> System.out.println("Resultado: " + (num1 - num2));
                    case 3 -> System.out.println("Resultado: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: División por cero no permitida.");
                        }
                    }
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }

                System.out.print("¿Desea continuar? (sí/no): ");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("si")) {
                    continuar = false;
                    System.out.println("Saliendo de la calculadora. ¡Adiós!");
                }
            }
        }
    }
}