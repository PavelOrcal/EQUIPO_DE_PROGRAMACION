import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = a.nextLine();
        a.close();

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}
