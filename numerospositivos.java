import java.util.Scanner;

public class numerospositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        while (true) {
            System.out.print("Ingrese un número positivo (o un número negativo para terminar): ");
            double num = scanner.nextDouble();
            
            if (num < 0) {
                break;
            }

            sum += num;
            count++;
        }

        if (count > 0) {
            double media = sum / count;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
    
}

 
    

