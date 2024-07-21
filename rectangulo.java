import java.util.Scanner;
 
/**
 *
 * @author pavel
 */
public class rectangulo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Ingresa el ancho del rectángulo: ");
            double ancho = scanner.nextDouble();
            System.out.print("Ingresa la altura del rectángulo: ");
            double altura = scanner.nextDouble(); 
            double area = ancho*altura;
            System.out.print("El área del rectángulo es: " + area);
       }
               
    }
}