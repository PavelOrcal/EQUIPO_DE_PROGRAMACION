import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación numérica: ");
        int calificacion = scanner.nextInt();
        scanner.close();

        char letraCalificacion;

        if (calificacion >= 90 && calificacion <= 100) {
            letraCalificacion = 'A';
        } else if (calificacion >= 80 && calificacion <= 89) {
            letraCalificacion = 'B';
        } else if (calificacion >= 70 && calificacion <= 79) {
            letraCalificacion = 'C';
        } else if (calificacion >= 60 && calificacion <= 69) {
            letraCalificacion = 'D';
        } else if (calificacion < 60 && calificacion >= 0) {
            letraCalificacion = 'F';
        } else {
            System.out.println("Calificación no válida. Debe estar entre 0 y 100.");
            letraCalificacion = ' ';
        }

        System.out.println("La calificación con letra es: " + letraCalificacion);
    }
}
