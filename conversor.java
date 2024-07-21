import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        final double USD = 0.054;
        final double EUR = 0.046;
        final double THB = 1.80; 
        final double JPY = 7.89;  
        final double KRW = 70.99; 
        final double AUD = 0.079; 
        final double PEN = 0.20;  
        final double CAD = 0.071; 
        final double VES = 1.80;  
        final double ARS = 18.91; 


        System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
        double cantidadMXN = Scanner.nextDouble();

        System.out.println("Seleccione la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");

        int opcion = Scanner.nextInt();
        double resultado = 0;
        String moneda = "";

        switch (opcion) {
            case 1:
                resultado = cantidadMXN * USD;
                moneda = "USD";
                break;
            case 2:
                resultado = cantidadMXN * EUR;
                moneda = "EUR";
                break;
            case 3:
                resultado = cantidadMXN * THB;
                moneda = "THB";
                break;
            case 4:
                resultado = cantidadMXN * JPY;
                moneda = "JPY";
                break;
            case 5:
                resultado = cantidadMXN * KRW;
                moneda = "KRW";
                break;
            case 6:
                resultado = cantidadMXN * AUD;
                moneda = "AUD";
                break;
            case 7:
                resultado = cantidadMXN * PEN;
                moneda = "PEN";
                break;
            case 8:
                resultado = cantidadMXN * CAD;
                moneda = "CAD";
                break;
            case 9:
                resultado = cantidadMXN * VES;
                moneda = "VES";
                break;
            case 10:
                resultado = cantidadMXN * ARS;
                moneda = "ARS";
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }
        System.out.printf("La cantidad en %s es: %.2f%n", moneda, resultado);

        
    }

    
}