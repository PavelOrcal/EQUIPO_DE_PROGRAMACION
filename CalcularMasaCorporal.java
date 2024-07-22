import java.util.Scanner;

public class CalcularMasaCorporal {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos:");
        double peso = a.nextDouble();

        System.out.print("Ingrese su altura en metros:");
        double altura = a.nextDouble();

        a.close();

        if (peso <= 0)
        {
            System.out.println("El peso debe ser mayores que cero.");
        }
        else if (altura <= 0) 
        {
            System.out.println("La altura debe ser mayor que cero.");
        } 
        else 
        {
            double calcular = peso / (altura * altura);
            System.out.print("Su índice de masa corporal es: " + calcular);
        }
    }
}
