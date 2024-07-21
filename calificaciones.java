/*public class calificaciones {*/
    import java.util.Scanner;

/**
 *Calculadora de Calificaciones Finales
 *Calcula la nota final de un estudiante basandote en tres notas 
 *Parciales, proyecto y examen final
 * 
 * @author pavel
 */
public class calificaciones {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double parciales = obtenerCalificacion(scanner, "parciales (40%)");
        double proyecto = obtenerCalificacion(scanner, "proyecto (30%)");
        double examenFinal = obtenerCalificacion(scanner, "examen final(30%)");
        
        double notaFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
        
        System.out.println("La calificacion final es: " + notaFinal);
               
    }
    private static double obtenerCalificacion(Scanner scanner, String tipo) {
        double calificacion = -1;
        while (calificacion < 0 || calificacion > 100) {
            System.out.print("Ingrese la calificacion de " + tipo + " (0-100):");
            calificacion = scanner.nextDouble();
               if (calificacion < 0 || calificacion > 100) {
                System.out.println("Error: la calificación debe estar entre 0 y 100.");
            }
        }
        return calificacion;
    }
}
