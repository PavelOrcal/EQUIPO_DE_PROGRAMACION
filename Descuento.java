import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) throws Exception {
        
        Scanner a = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = a.nextDouble();

        a.close();

        double precioFinal = 0;
        if (precioOriginal <= 100) {
            precioFinal = precioOriginal;
        } else if (precioOriginal > 100 && precioOriginal <= 200) {
            precioFinal = precioOriginal - precioOriginal * 0.10; 
        } else if (precioOriginal > 200 && precioOriginal <= 500) {
            precioFinal = precioOriginal - precioOriginal * 0.20; 
        } else if(precioOriginal > 500)
        {
            precioFinal = precioOriginal - precioOriginal * 0.25;
        }

        System.out.print("El precio final del producto es: " + precioFinal);


    }
}
